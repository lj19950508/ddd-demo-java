package com.demo.userInterface.dto;

import com.demo.domain.biz1.valueobject.Address;

/**
 * @author linjie
 * @date 2022/1/26
 */
public class UserRes {
    private Long id;
    private String name;
    private String pwd;
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
