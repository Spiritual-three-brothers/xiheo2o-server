package com.stb.xiheo2o.center;

import com.stb.xiheo2o.center.dao.mapper.GoodsMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BaseAPITest {

    @Resource
    private GoodsMapper goodsMapper;

    @Test
    public void testMapper() {
        goodsMapper.selectByPrimaryKey(1L);
    }
}
