package com.dzr.data.persistence.dzr.dao;

import com.dzr.data.persistence.dzr.entity.User;
import com.dzr.framework.dao.BaseDao;
import org.springframework.stereotype.Service;

@Service
public interface UserDao extends BaseDao<User> {
    User getUserById(Long id);
}
