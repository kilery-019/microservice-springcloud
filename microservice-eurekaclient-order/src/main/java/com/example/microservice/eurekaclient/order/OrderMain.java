package com.example.microservice.eurekaclient.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 订单服务门面
 * @author Kilery.Chen
 *
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class OrderMain {
    
    public static int i = 0;

    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class, args);
    }
    
    @RequestMapping("/")
    public String home() {
        return "Welcome to Order service"+i++;
    }
}