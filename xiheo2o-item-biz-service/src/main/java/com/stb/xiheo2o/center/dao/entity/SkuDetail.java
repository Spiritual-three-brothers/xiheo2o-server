package com.stb.xiheo2o.center.dao.entity;

import java.util.Date;
import lombok.Data;

@Data
public class SkuDetail {
    /**
    * 主键id
    */
    private Long id;

    /**
    * 价格。单位为分
    */
    private Long price;

    /**
    * 子sku长名称
    */
    private String longTitle;

    /**
    * 子sku短名称
    */
    private String shortTitle;

    /**
    * 父sku的id
    */
    private Long fatherId;

    /**
    * 子sku的图片
    */
    private String pic;

    /**
    * 商品库存
    */
    private Long stock;

    /**
    * 乐观锁
    */
    private Long version;

    /**
    * 备注
    */
    private String remark;

    /**
    * 是否促销 0否;1是
    */
    private Boolean onMarketing;

    /**
    * 软删除状态 0删除;1存在
    */
    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;
}