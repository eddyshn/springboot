package com.example.eddy.controller;

import com.example.eddy.serevice.UserServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-25 11:14
 **/
@RestController
public class UserController {

    @Autowired
    UserServie userServie;

    @GetMapping("/user")
    public String getUserById(Integer id){
        return  userServie.getUserById(id);
    }
}
