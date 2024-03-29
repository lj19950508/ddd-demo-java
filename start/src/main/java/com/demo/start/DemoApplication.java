package com.demo.start;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linjie
 * @date 2022/9/1
 */

/**
 * 临时放这里  应该放到 全局  修改为单一架构 去掉模块化后比较合适
 */
@SpringBootApplication
@ComponentScan("com.demo")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
