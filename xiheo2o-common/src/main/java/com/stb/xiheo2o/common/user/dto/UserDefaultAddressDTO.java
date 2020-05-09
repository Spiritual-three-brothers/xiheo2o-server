package com.stb.xiheo2o.common.user.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDefaultAddressDTO implements Serializable {
    private static final long serialVersionUID = -5073927372831356765L;

    private Long accountId;


    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 地址区域
     */
    private String addressArea;

    /**
     * 精确地址d
     */
    private String detailAdress;
}
