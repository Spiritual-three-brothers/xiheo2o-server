package com.stb.xiheo2o.center.dao.entity;

import java.util.Date;
import lombok.Data;

@Data
public class CategoryConfig {
    private Long id;

    /**
    * parent_id
    */
    private Long pid;

    /**
    * 表示层级关系
    */
    private Long bizId;

    private String title;

    private Integer level;

    private Long sort;

    /**
    * 是否删除
    */
    private Byte isDelete;

    /**
    * 建表时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}