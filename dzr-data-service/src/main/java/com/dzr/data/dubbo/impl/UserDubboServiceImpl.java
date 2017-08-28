package com.dzr.data.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dzr.common.util.BeanUtils;
import com.dzr.data.dubbo.api.UserDubboService;
import com.dzr.data.dubbo.api.request.UserRequest;
import com.dzr.data.dubbo.api.response.pojo.UserBo;
import com.dzr.data.persistence.dzr.entity.User;
import com.dzr.data.service.risk.UserService;
import com.dzr.framework.constant.Constants;
import com.dzr.framework.pojo.dubbo.DubboResponse;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.InvocationTargetException;


@Service(version = "1.0.0", validation = "true")
public class UserDubboServiceImpl implements UserDubboService {

    @Autowired
    private UserService userService;

    @Override
    public DubboResponse<UserBo> queryUserByID(UserRequest userRequest) {

        DubboResponse<UserBo> response = new DubboResponse<>();
        response.setStatus(Constants.System.OK);
        response.setError(Constants.System.SERVER_SUCCESS);
        User user = userService.QueryByID(userRequest.getUserId());
        System.out.print(user+"==============");
        UserBo userBo = new UserBo();
        try {
            BeanUtils.copyProperties(userBo, user);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        response.setData(userBo);
        return response;
    }
}
