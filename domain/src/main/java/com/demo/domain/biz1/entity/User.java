package com.demo.domain.biz1.entity;

import com.demo.domain.biz1.valueobject.Address;

/**
 * @author linjie
 * @date 2022/1/25
 */
public class User {
    private Long id;
    private String name;
    private String pwd;
    private Address address;

    public User(Long id, String name, String pwd, Address address) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.address = address;
    }

    /**
     * 业务方法(写入方法) 写在对象内
     * @param pwd
     */
    public void changepwd(String pwd){
        this.pwd=pwd;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public Address getAddress() {
        return address;
    }
}
