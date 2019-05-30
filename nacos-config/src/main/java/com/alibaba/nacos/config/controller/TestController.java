package com.alibaba.nacos.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lingjun.jlj
 * @date: 2019/5/30 14:32
 * @description: 测试获取配置中心文件
 */
@RefreshScope
@RestController
public class TestController {


    @Value("${user.name}")
    private String name;
    @Value("${user.age}")
    private String age;

    @GetMapping(value = "/getConfig")
    public String getTitle() {
        return "user name: " + name + " ; his age is " + age;
    }

}
