package com.stb.xiheo2o.center.api.item.impl;

import com.stb.xiheo2o.center.api.item.ItemCategoryAPI;
import com.stb.xiheo2o.common.dto.TestResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.soul.client.common.annotation.SoulClient;

@Service
@Slf4j
public class ItemCateGoryAPI implements ItemCategoryAPI {


    @Override
    @SoulClient(path = "/hello", desc = "测试接口")
    public String sayHello() {
        return "Hello, World";
    }

    @Override
    @SoulClient(path = "/test", desc = "测试接口2")
    public String testWithParameter(TestResponseDTO testResponseDTO) {
        return "123123";
    }

    @Override
    @SoulClient(path = "/test3", desc = "测试接口3")
    public TestResponseDTO testWithResponseDTO(TestResponseDTO testResponseDTO) {
        return testResponseDTO;
    }


}
