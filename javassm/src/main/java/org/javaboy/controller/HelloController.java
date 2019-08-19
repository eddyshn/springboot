package org.javaboy.controller;

import org.javaboy.service.HellloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HellloService hellloService;

    @GetMapping("/hello")
    public String hello(){
        return hellloService.sayHello();
    }

    @GetMapping("/data")
    public List<String> getData() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            list.add("www.justdojava.com>>>" + i);
        }
        return list;
    }
}
