package com.stb.xiheo2o.center.dao.mapper;

import com.stb.xiheo2o.center.dao.entity.SkuDetail;

public interface SkuDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SkuDetail record);

    int insertSelective(SkuDetail record);

    SkuDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SkuDetail record);

    int updateByPrimaryKey(SkuDetail record);
}