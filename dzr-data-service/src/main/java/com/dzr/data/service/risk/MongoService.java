package com.dzr.data.service.risk;

import com.dzr.data.dubbo.api.response.pojo.MongoUserBo;

public interface MongoService {

    boolean insert(MongoUserBo mongoUserBo);

    MongoUserBo queryById(Long userId);

}
