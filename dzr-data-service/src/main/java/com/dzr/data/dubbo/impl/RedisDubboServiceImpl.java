package com.dzr.data.dubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dzr.data.dubbo.api.RedisDubboService;
import com.dzr.data.service.risk.RedisService;
import com.dzr.framework.constant.Constants;
import com.dzr.framework.pojo.dubbo.DubboResponse;
import org.springframework.beans.factory.annotation.Autowired;


@Service(version = "1.0.0", validation = "true")
public class RedisDubboServiceImpl implements RedisDubboService {

    @Autowired
    private RedisService redisService;

    @Override
    public DubboResponse<String> queryVersion() {
        String version =  redisService.queryVsersion();
        DubboResponse<String> response
                = new DubboResponse<>();
        response.setStatus(Constants.System.OK);
        response.setError(Constants.System.SERVER_SUCCESS);
        response.setData(version);
        return  response;
    }
}
