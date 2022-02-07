### 依赖关系
```
infrastructrue->userinterface->application->domain
                    |
                    \/
                   rpcclient
                   
```
### 模块说明
infrastructrue 
 1. 负责具体数据库实现 
 2. PO 转 DO 
 3. 工具类,mq类等，
 4. 并通过DI注入上层

userinterface 
 1. 负责定义入口，可以通过rest,grpc,graphql等方式对外部暴露
 2. 实现 do 转 vo的适配器

application 应用层是很轻的一层
 1. 负责编排domain服务与第三方服务
 2. 第三方服务(通过防腐层external),
 3. 不参与任何业务代码编写(参与调度repo调度第三方,调度领域服务与领域方法)
 

domain层 
 1. 聚焦业务，理论上只要引入DI模块，不引入外部任何依赖实现 ，
 2. 其中对领域的业务操作写在实体内， 对象的操作以及编排写在领域服务内(理论上对业务的操作不会调用getset方法，直接使用成员变量) (充血模型)
 3.业务代码指的是 (写操作) （cqrs）
 4.factory创建复杂对象

rpcclient层
 1. 提供本服务的rpcclient给 其他同构服务用,如果是异构服务请考虑grpc


cqrs
command操作返回void
在每个command操作执行完成时都将发布领域事件

### 问题
1. 基础设施层为什么在是在下层
 - 因为 repository impl  repostiroyImpl  所以使用这种架构并通过DI
2. 依赖 理论上  domain层只引入 bean管理的依赖来实现可被依赖注入， interface层引入mvc依赖  ， 基础设施层引入具体依赖(mysql , mq )
3. 需要微服务额外提供RPC客户端的， 可以新增一个模块 rpc 来提供被别的服务访问的能力 如 feignClient/grpc等
4. domain的业务方法  返回值为VOID  遵循cqrs,理论上domain的setter为private,使用构造器创建,构造即合理,所以在构造器里面调用setter,在setter里面验证
5. 想办法去掉domain的getter方法，do需要转换为PO，所以需要一层getter.

### 概念
聚合 Aggergate  代表多个实体  只有聚合才能拥有资源库
聚合根 AggergateRoot  聚合根是一个实体, 通过ID可以从聚合根访问与该聚合根 管理的实体 
实体 Entity   领域对象 DO
值对象 ValueObject   不含生命周期 依赖于 上层实体   如项目中的address
领域服务 DomainService  
领域时间 DomainEvent
命令和查询职责分离 CQRS

### 业务概念
领域 (子域/核心域)
子域 (业务系统中的域   通用子域/支撑子域)
限界上下文  依据拆分域
协作上下文




