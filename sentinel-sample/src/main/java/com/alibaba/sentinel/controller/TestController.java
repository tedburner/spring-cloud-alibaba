package com.alibaba.sentinel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lingjun.jlj
 * @date: 2019/6/4 17:43
 * @description:
 */
@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String hello(){
        return "Hello, Spring Cloud Alibaba";
    }

}
