package com.alibaba.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: lingjun.jlj
 * @date: 2019/5/30 14:32
 * @description:
 */
@RefreshScope
@RestController
public class TestController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/test")
    public String test() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("server-sample");
        String url = serviceInstance.getUri() + "/test?name=" + "Arthas";
        RestTemplate template = new RestTemplate();
        String result = template.getForObject(url, String.class);
        return "Invoke : " + url + ", return : " + result;

    }

}
