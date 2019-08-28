package com.eddy.jdbctemplate.service;

import com.eddy.jdbctemplate.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * @program: jdbctemplate
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-27 22:52
 **/
@Service
public class UserService {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public Integer addUser(User user){
        return jdbcTemplate.update("insert into user (name, address) values (?,?);", user.getUsername(), user.getAddress());
    }
}
