package com.dzr.data.service.risk.impl;

import com.dzr.common.redis.template.RedisClientTemplate;
import com.dzr.data.service.risk.RedisService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="redisService")
public class RedisServiceImpl implements RedisService {
    private static String version = "VERSION";

    @Autowired
    private RedisClientTemplate redisClientTemplate ;

    @Override
    public String queryVsersion() {
        String result = redisClientTemplate.get(version);
        return StringUtils.isBlank(result)?"暂无数据":result;
    }
}
