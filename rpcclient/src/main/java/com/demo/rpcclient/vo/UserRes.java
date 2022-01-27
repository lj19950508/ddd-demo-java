package com.demo.rpcclient.vo;


/**
 * @author linjie
 * @date 2022/1/26
 */
public class UserRes {
    private Long id;
    private String name;
    private String pwd;
    private AddressRes address;

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

    public AddressRes getAddress() {
        return address;
    }

    public void setAddress(AddressRes address) {
        this.address = address;
    }
}
