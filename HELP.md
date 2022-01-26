依赖关系
infrastructrue->userinterface->application->domain

infrastructrue 
1.负责具体数据库实现 
2.POJO 转 DO 
3.工具类,mq类等，
4.并通过DI注入上层

userinterface 
1.负责定义入口，可以通过rest,grpc,graphql等方式对外部暴露
2.并可以实现 dto转成领域对象

application 应用层是很轻的一层
1.负责编排domain服务与第三方服务
2.第三方服务(通过防腐层external),
3.不参与任何业务代码编写

domain层 
1.聚焦业务，理论上只要引入DI模块，不引入外部任何依赖实现 ，
2.其中对领域的业务操作写在实体内， 对象的操作以及编排写在领域服务内(理论上对业务的操作不会调用getset方法，直接使用成员变量) (充血模型)
3.domainservice 领域服务不提供业务代码，只负责调用 domain内的业务代码。 以及调用仓储
4.业务代码指的是 (写操作) （cqrs）


1.问题
基础设施层为什么在是在下层
因为 repository impl  repostiroyImpl  所以使用这种架构并通过DI
2.  interface层  请求domain层
是否是按项目中的方式把 dto转成do,再到domain操作。 需要确认
3.依赖 理论上  domain层只引入 bean管理的依赖来实现可被依赖注入， interface层引入mvc依赖  ， 基础设施层引入具体依赖(mysql , mq 等)
