package com.demo.domain.biz1.entity;

import com.demo.domain.biz1.valueobject.Address;

/**
 * @author linjie
 * @date 2022/1/25
 */
public class User {
    private long id;
    private String name;
    private String pwd;
    private Address address;

    /**
     * domain 构造后就拥有声明周期了
     * @param id
     * @param name
     * @param pwd
     * @param address
     */
    public User(Long id, String name, String pwd, Address address) {
        this.setId(id);
        this.setName(name);
        this.setPwd(pwd);
        this.setAddress(address);
    }

    /**
     * 业务方法(写入方法) 写在对象内  返回值 void
     * @param pwd
     */
    public void changepwd(String pwd){
        this.pwd=pwd;
    }

    public boolean exist(){
        return id!=0;
    }

    /**
     * setter方法为private 用来验证参数
     * @param id
     */
    private void setId(Long id) {
        //验证与业务有关的逻辑
        this.id = id;
    }

    private void setName(String name) {
        if(name.equals("julina")){
            throw new RuntimeException("不让你注册");
        }
        this.name = name;
    }

    private void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private void setAddress(Address address) {
        this.address = address;
    }


    //提供getter方法
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
