package com.example.eddy.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-24 10:13
 **/
@RestController
//@CrossOrigin(origins = "http://localhost:8080")
public class Hello {

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }
}
