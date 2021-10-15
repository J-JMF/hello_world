package com.example.hello_world;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorldApplication {

    @RestController
    public class HelloSpringBoot {
        @RequestMapping(path = {"/helloSpringBoot"})
        public String HelloSpring (){
            System.out.println("helloword Spring Boot！这是一个用Spring Boot开发的网站。 ");
            return "helloword Spring Boot！这是一个用Spring Boot开发的网站。";
        }
    }
    public static void main(String[] args) {

        // Spring应用启动起来
        SpringApplication.run(HelloWorldApplication.class,args);
    }
}

