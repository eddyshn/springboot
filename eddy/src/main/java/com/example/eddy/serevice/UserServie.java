package com.example.eddy.serevice;

import org.springframework.stereotype.Component;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-25 11:13
 **/
@Component
public class UserServie {

    public String getUserById(Integer id){
        System.out.println("getUserById");
        return "eddy";
    }
}
