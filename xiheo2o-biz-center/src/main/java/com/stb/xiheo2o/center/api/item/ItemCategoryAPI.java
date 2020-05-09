package com.stb.xiheo2o.center.api.item;

import com.stb.xiheo2o.common.dto.TestResponseDTO;

public interface ItemCategoryAPI {

    /**
     * 网关写法样板 无参数的情况
     * POST 请求 入参 {}
     * @return
     */
    String sayHello();

    /**
     * 网关写法样板 对象参数参数的情况
     * POST 请求 入参 {"name":xxx, age: xxx}
     * @return
     */
    String testWithParameter(TestResponseDTO testResponseDTO);

    TestResponseDTO testWithResponseDTO(TestResponseDTO testResponseDTO);
}
