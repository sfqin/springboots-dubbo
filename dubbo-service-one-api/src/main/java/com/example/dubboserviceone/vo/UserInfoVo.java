package com.example.dubboserviceone.vo;

import java.io.Serializable;

public class UserInfoVo implements Serializable {

    private String userName;

    private String address;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
