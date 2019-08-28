package com.eddy.jdbctemplate.bean;

/**
 * @program: jdbctemplate
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-27 22:50
 **/
public class User {
    private Integer id;
    private String username;
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
