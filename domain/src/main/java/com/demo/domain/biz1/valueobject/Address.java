package com.demo.domain.biz1.valueobject;

/**
 * @author linjie
 * @date 2022/1/25
 */
public class Address {

    private String province;
    private String city;
    private String area;
    private String detail;

    public Address(String province, String city, String area, String detail) {
        this.province = province;
        this.city = city;
        this.area = area;
        this.detail = detail;
    }

    public String getProvince() {
        return province;
    }

    public String getCity() {
        return city;
    }

    public String getArea() {
        return area;
    }

    public String getDetail() {
        return detail;
    }
}
