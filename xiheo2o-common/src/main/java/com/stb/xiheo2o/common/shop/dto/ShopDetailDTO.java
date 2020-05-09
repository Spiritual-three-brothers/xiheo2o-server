package com.stb.xiheo2o.common.shop.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShopDetailDTO implements Serializable {
    private static final long serialVersionUID = 2053271991376027333L;

    private Long shopId;

    private String shopName;
}
