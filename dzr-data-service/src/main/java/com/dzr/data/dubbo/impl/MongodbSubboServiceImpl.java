package com.dzr.data.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dzr.data.dubbo.api.MongodbSubboService;
import com.dzr.data.dubbo.api.request.MongoUserRequest;
import com.dzr.data.dubbo.api.response.pojo.MongoUserBo;
import com.dzr.data.service.risk.MongoService;
import com.dzr.framework.constant.Constants;
import com.dzr.framework.pojo.dubbo.DubboResponse;
import org.springframework.beans.factory.annotation.Autowired;

@Service(version = "1.0.0", validation = "true")
public class MongodbSubboServiceImpl implements MongodbSubboService {

    @Autowired
    private MongoService mongoService;

    @Override
    public DubboResponse<Boolean> insert(MongoUserBo mongoUserBo) {
        DubboResponse<Boolean> response =
                new DubboResponse<>();
        response.setStatus(Constants.System.OK);
        response.setError(Constants.System.SERVER_SUCCESS);
        mongoService.insert(mongoUserBo);
        response.setData(true);
        return response;
    }

    @Override
    public DubboResponse<MongoUserBo> queryById(MongoUserRequest request) {
        DubboResponse<MongoUserBo> response =
                new DubboResponse<>();
        response.setStatus(Constants.System.OK);
        response.setError(Constants.System.SERVER_SUCCESS);
        MongoUserBo mongoUserBo =
                mongoService.queryById(request.getUserId());
        response.setData(mongoUserBo);
        return response;
    }
}
