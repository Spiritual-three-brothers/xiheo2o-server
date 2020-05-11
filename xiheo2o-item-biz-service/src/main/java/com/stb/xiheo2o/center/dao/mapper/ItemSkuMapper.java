package com.stb.xiheo2o.center.dao.mapper;

import com.stb.xiheo2o.center.dao.entity.ItemSku;

public interface ItemSkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ItemSku record);

    int insertSelective(ItemSku record);

    ItemSku selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemSku record);

    int updateByPrimaryKey(ItemSku record);
}