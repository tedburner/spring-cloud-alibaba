package com.alibaba.server.conttroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lingjun.jlj
 * @date: 2019/5/30 13:48
 * @description:
 */
@RestController
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "Hello, Spring Cloud Alibaba!";
    }
}
