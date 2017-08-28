package com.dzr.data.dubbo.api.response.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBo implements Serializable {
    private Long userId;
    private String phone;
    private String account;
    private String password;
}
