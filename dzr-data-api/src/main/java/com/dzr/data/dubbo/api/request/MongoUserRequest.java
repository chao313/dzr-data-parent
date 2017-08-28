package com.dzr.data.dubbo.api.request;

import com.dzr.framework.pojo.dubbo.BaseRequest;
import lombok.Data;

@Data
public class MongoUserRequest extends BaseRequest {

    private Long UserId;
}
