package com.example.microservice.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名不能是EurekaClient，会跟内置的逻辑冲突
 * @author Kilery.Chen
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class MyEurekaClient {
    
    public static int i = 0;

    public static void main(String[] args) {
        SpringApplication.run(MyEurekaClient.class, args);
    }
    
    @RequestMapping("/home")
    public String home() {
        return "Welcome home"+i++;
    }
}
