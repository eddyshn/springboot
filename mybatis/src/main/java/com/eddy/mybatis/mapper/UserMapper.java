package com.eddy.mybatis.mapper;

import com.eddy.mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: mybatis
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-31 20:19
 **/
//@Mapper
public interface UserMapper {

    //@Select("SELECT * FROM users")
    List<User> getAllUser();
}
