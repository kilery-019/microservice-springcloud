package com.example.microservice.eurekaclient.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * 测试Order提供的服务，通过RestTemplate
 * @author Kilery.Chen
 *
 */
@RestController
@RequestMapping("/test/user")
public class OrderTestController {

    @Autowired
    private RestTemplate restTemplate;
    
    //  /test/user/getOrders/{userId}
    @RequestMapping("/getOrders/{userId}")
    public String findOrdersByUser(@PathVariable String userId) {
        //TODO 如何发现这个地址呢？
        String order = restTemplate.getForObject("http://localhost:8001/order/byId", String.class);
        return order;
    }
}
