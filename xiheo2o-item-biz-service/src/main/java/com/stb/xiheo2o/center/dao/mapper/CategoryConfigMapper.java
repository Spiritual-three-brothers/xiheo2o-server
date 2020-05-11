package com.stb.xiheo2o.center.dao.mapper;

import com.stb.xiheo2o.center.dao.entity.CategoryConfig;

public interface CategoryConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CategoryConfig record);

    int insertSelective(CategoryConfig record);

    CategoryConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryConfig record);

    int updateByPrimaryKey(CategoryConfig record);
}