package com.stb.xiheo2o.center.api.item.impl;

import com.stb.xiheo2o.center.api.item.ItemCategoryAPI;
import com.stb.xiheo2o.center.dao.entity.Goods;
import com.stb.xiheo2o.center.dao.mapper.GoodsMapper;
import com.stb.xiheo2o.common.item.dto.TestResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.soul.client.common.annotation.SoulClient;

import javax.annotation.Resource;

@Service
@Slf4j
public class ItemCateGoryAPI implements ItemCategoryAPI {

    @Resource
    private GoodsMapper goodsMapper;
    @Override
    //@SoulClient(path = "/hello", desc = "测试接口")
    public String sayHello() {
        Goods goods = goodsMapper.selectByPrimaryKey(1L);
        log.error("error:{}", goods);
        return "Hello, World";
    }

    @Override
    //@SoulClient(path = "/test", desc = "测试接口2")
    public String testWithParameter(TestResponseDTO testResponseDTO) {
        return "123123";
    }

    @Override
    //@SoulClient(path = "/test3", desc = "测试接口3")
    public TestResponseDTO testWithResponseDTO(TestResponseDTO testResponseDTO) {
        return testResponseDTO;
    }


}
