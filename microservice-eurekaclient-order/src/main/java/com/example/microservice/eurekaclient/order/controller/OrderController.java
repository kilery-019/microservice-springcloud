package com.example.microservice.eurekaclient.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.eurekaclient.order.model.Order;

/**
 * 订单controller
 * @author Kilery.Chen
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    private int i = 1;
    @RequestMapping("/byId")
    public String getOrderById() {
        Order order = new Order();
        order.setId("123");
        order.setReceiverPhone("135"+i++);
        order.setPrice(10.1+i);
        return order.toString();
    }
}
