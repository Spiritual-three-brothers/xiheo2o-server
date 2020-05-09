package com.stb.xiheo2o.center.api.item.impl;

import com.stb.xiheo2o.center.api.item.ItemCategoryAPI;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

@Service
@Slf4j
public class ItemCateGoryAPI implements ItemCategoryAPI {


    @Override
    public String sayHello() {
        return "Hello, World";
    }
}
