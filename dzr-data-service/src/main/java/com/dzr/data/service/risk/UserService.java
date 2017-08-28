package com.dzr.data.service.risk;

import com.dzr.data.persistence.dzr.entity.User;

public interface UserService {
    int count();
    User QueryByID(Long userId);
}
