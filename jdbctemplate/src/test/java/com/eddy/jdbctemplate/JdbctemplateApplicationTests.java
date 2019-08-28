package com.eddy.jdbctemplate;

import com.eddy.jdbctemplate.bean.User;
import com.eddy.jdbctemplate.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JdbctemplateApplicationTests {

    @Autowired
    UserService userService;

    @Test
    public void contextLoads() {
        User user = new User();
        user.setUsername("eddy");
        user.setAddress("guangzhou");

        userService.addUser(user);
    }

}
