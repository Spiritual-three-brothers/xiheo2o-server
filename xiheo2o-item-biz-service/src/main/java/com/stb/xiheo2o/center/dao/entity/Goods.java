package com.stb.xiheo2o.center.dao.entity;

import java.util.Date;
import lombok.Data;

@Data
public class Goods {
    /**
    * 二级ID
    */
    private Long id;

    /**
    * 商品图片
    */
    private String itemPic;

    /**
    * 商品价格
    */
    private Long itemPrice;

    /**
    * 商品长名称
    */
    private String itemLongTitle;

    /**
    * 商品短名称
    */
    private String itemShortTitle;

    /**
    * 商品spuId
    */
    private Long itemSpuId;

    /**
    * 0待上架 1已上架 2下架
    */
    private Integer itemStatus;

    /**
    * type1:图片;type2:文字
    */
    private String itemTabInfo;

    /**
    * 商品轮播图
    */
    private String itemScrollImages;

    /**
    * 所含标签的 json
    */
    private String itemTag;

    /**
    * 是否自营商品 0否 1是
    */
    private Boolean internal;

    /**
    * 所属店铺id
    */
    private Long itemShopId;

    /**
    * 销量
    */
    private Integer itemSales;

    /**
    * 软删除状态1删除0存在
    */
    private Boolean isDelete;

    private Date createTime;

    private Date updateTime;
}