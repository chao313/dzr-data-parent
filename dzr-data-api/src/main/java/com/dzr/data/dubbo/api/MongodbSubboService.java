package com.dzr.data.dubbo.api;

import com.dzr.data.dubbo.api.request.MongoUserRequest;
import com.dzr.data.dubbo.api.response.pojo.MongoUserBo;
import com.dzr.framework.pojo.dubbo.DubboResponse;

public interface MongodbSubboService {

    DubboResponse<Boolean> insert(MongoUserBo mongoUserBo);

    DubboResponse<MongoUserBo> queryById(MongoUserRequest request);

}
