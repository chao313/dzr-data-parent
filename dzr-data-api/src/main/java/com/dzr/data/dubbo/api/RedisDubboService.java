package com.dzr.data.dubbo.api;

import com.dzr.framework.pojo.dubbo.DubboResponse;

public interface RedisDubboService {

    DubboResponse<String> queryVersion();

}
