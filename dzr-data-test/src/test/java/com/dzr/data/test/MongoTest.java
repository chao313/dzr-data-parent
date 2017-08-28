package com.dzr.data.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dzr.common.util.BillNoUtils;
import com.dzr.data.dubbo.api.MongodbSubboService;
import com.dzr.data.dubbo.api.request.MongoUserRequest;
import com.dzr.data.dubbo.api.response.pojo.MongoUserBo;
import com.dzr.data.test.base.BaseTest;
import com.dzr.framework.pojo.dubbo.DubboResponse;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MongoTest extends BaseTest {

    @Reference(version = "1.0.0")
    private MongodbSubboService mongodbSubboService;

    @Before
    public void mongoInsertTest(){
        MongoUserBo mongoUserBo =
                new MongoUserBo();
        mongoUserBo.setAccount("2942200183");
        mongoUserBo.setPassword("Ys20140913");
        mongoUserBo.setPhone("18888106873");
        mongoUserBo.setUserId(1L);
        DubboResponse<Boolean> response =
                mongodbSubboService.insert(mongoUserBo);
    }

    @Test
    public void mongoQueryTest(){
        MongoUserRequest request =
                new MongoUserRequest();
        request.setRequestId(BillNoUtils.GenerateBillNo());
        request.setUserId(1L);
        DubboResponse<MongoUserBo> response =
                mongodbSubboService.queryById(request);
        response.getData();
    }

}
