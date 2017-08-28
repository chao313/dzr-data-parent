package com.dzr.data.service.risk.impl;

import com.dzr.common.util.BillNoUtils;
import com.dzr.data.dubbo.api.request.MongoUserRequest;
import com.dzr.data.dubbo.api.response.pojo.MongoUserBo;
import com.dzr.data.service.risk.MongoService;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service(value = "mongoService")
public class MongoServiceImpl implements MongoService {

    @Resource
    protected MongoTemplate mongoTemplate;

    @Override
    public boolean insert(MongoUserBo mongoUserBo) {
        mongoTemplate.save(mongoUserBo);
        return true;
    }

    @Override
    public MongoUserBo queryById(Long userId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("userId").is(userId));
        MongoUserBo mongoUserBo =
                mongoTemplate.findOne(query, MongoUserBo.class);
        return mongoUserBo;
    }
}
