package com.dzr.data.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dzr.data.dubbo.api.RedisDubboService;
import com.dzr.data.test.base.BaseTest;
import com.dzr.framework.pojo.dubbo.DubboResponse;
import org.junit.Test;

public class RedisTest extends BaseTest {

    @Reference(version = "1.0.0")
    private RedisDubboService redisDubboService;

    @Test
    public void redisTest(){
        DubboResponse<String> dubboResponse
                = redisDubboService.queryVersion();
        String version = dubboResponse.getData();
        System.out.print(version+"----------");

    }

}
