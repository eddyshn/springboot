package org.javaboy.controller;

import org.javaboy.service.HellloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HellloService hellloService;

    @GetMapping("/hello")
    public String hello(){
        return hellloService.sayHello();
    }
}
