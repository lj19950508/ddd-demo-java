package com.demo.application.dto;

/**
 * @author linjie
 * @date 2022/1/25
 */
public class ChangpwdDTO {
    private Long userId;
    private String pwd;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
