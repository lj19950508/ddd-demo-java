package com.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author linjie
 * @date 2022/9/1
 */
@SpringBootApplication
//@ComponentScan(basePackages={"com.demo"})
//@MapperScan("com.demo.infrastructure.persistent.mybatis")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
