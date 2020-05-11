package com.stb.xiheo2o.center.dao.entity;

import java.util.Date;
import lombok.Data;

@Data
public class ItemSku {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 归属于哪个商品
    */
    private Long itemId;

    /**
    * sku文本描述
    */
    private String skuDescribe;

    /**
    * 父SkuID
    */
    private Long skuNodeId;

    /**
    * 子skuID
    */
    private Long skuPid;

    /**
    * 规格id
    */
    private Long skuDetailId;

    private Integer level;

    private Integer sort;

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