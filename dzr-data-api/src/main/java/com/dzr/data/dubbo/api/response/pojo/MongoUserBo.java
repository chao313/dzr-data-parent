package com.dzr.data.dubbo.api.response.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class MongoUserBo implements Serializable {
    private Long userId;
    private String phone;
    private String account;
    private String password;
}
