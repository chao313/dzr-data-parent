package com.dzr.data.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dzr.common.util.BillNoUtils;
import com.dzr.data.dubbo.api.UserDubboService;
import com.dzr.data.dubbo.api.request.UserRequest;
import com.dzr.data.dubbo.api.response.pojo.UserBo;
import com.dzr.data.test.base.BaseTest;
import com.dzr.framework.pojo.dubbo.DubboResponse;
import org.junit.Test;

public class DubboTest extends BaseTest {

    @Reference(version = "1.0.0")
    private UserDubboService userDubboService;


    @Test
    public void userDubboTest(){

        UserRequest userRequest = new UserRequest();
        userRequest.setUserId(1L);
        userRequest.setRequestId(BillNoUtils.GenerateBillNo());
        DubboResponse<UserBo> response=
                userDubboService.queryUserByID(userRequest);

        System.out.print(response);


    }
}
