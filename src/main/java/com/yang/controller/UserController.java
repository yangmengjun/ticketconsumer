package com.yang.controller;

import com.yang.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: yangmengjun
 * @date: 2019\3\26 0026 17:19
 */
@RestController
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${user.userServiceUrl}")
    private String userServiceUrl;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject(this.userServiceUrl + id,User.class);
    }
}

