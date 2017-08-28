package com.dzr.data.persistence.dzr.entity;

import com.dzr.framework.entity.BaseEntity;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Table;

@Table(name="t_user")
@Data
@ToString
public class User extends BaseEntity {
    private Long userId;
    private String phone;
    private String account;
    private String password;
}
