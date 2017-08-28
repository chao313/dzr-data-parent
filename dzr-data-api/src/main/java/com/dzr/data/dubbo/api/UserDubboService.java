package com.dzr.data.dubbo.api;

import com.dzr.data.dubbo.api.request.UserRequest;
import com.dzr.data.dubbo.api.response.pojo.UserBo;
import com.dzr.framework.pojo.dubbo.DubboResponse;

public interface UserDubboService {

    DubboResponse<UserBo> queryUserByID(UserRequest userRequest);

}
