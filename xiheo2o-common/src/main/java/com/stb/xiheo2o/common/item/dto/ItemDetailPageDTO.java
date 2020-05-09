package com.stb.xiheo2o.common.item.dto;

import com.stb.xiheo2o.common.sales.dto.CouponDetailDTO;
import com.stb.xiheo2o.common.shop.dto.ShopDetailDTO;
import com.stb.xiheo2o.common.user.dto.UserDefaultAddressDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ItemDetailPageDTO implements Serializable {
    private static final long serialVersionUID = -8587634768987848174L;

    /**
     * 轮播图
     */
    private List<String> scrollPic;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 长名称
     */
    private String longTitle;


    /**
     * 短名称
     */
    private String shortTitle;


    /**
     * 优惠券详情
     */
    private List<CouponDetailDTO> couponDetailDTOS;

    /**
     * 店铺详情
     */
    private ShopDetailDTO shopDetailDTO;


    /**
     * 地址信息
     */
    private UserDefaultAddressDTO addressDTO;

    /**
     * 其他...
     */
}
