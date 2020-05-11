
CREATE DATABASE `xiheo2o`

USE `xiheo2o`;

/*Table structure for table `ic_category_config` */

DROP TABLE IF EXISTS `ic_category_config`;

CREATE TABLE `ic_category_config` (
    `id` bigint(11) NOT NULL AUTO_INCREMENT,
    `pid` bigint(11) NOT NULL DEFAULT '0' COMMENT 'parent_id',
    `biz_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '表示层级关系',
    `title` varchar(10) NOT NULL DEFAULT '',
    `level` int(10) NOT NULL DEFAULT '0',
    `sort` bigint(20) NOT NULL DEFAULT '0',
    `is_delete` tinyint default 0 not null comment '是否删除',
    `create_time` timestamp default CURRENT_TIMESTAMP not null comment '建表时间',
    `update_time` timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_biz_id` (`biz_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ic_category_config` */

/*Table structure for table `ic_goods` */

DROP TABLE IF EXISTS `ic_goods`;

CREATE TABLE `ic_goods` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '二级ID',
    `item_pic` varchar(500) NOT NULL DEFAULT '' COMMENT '商品图片',
    `item_price` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品价格',
    `item_long_title` varchar(30) NOT NULL DEFAULT '' COMMENT '商品长名称',
    `item_short_title` varchar(15) NOT NULL DEFAULT '' COMMENT '商品短名称',
    `item_spu_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品spuId',
    `item_status` int(11) NOT NULL DEFAULT '0' COMMENT '0待上架 1已上架 2下架',
    `item_tab_info` varchar(500) NOT NULL DEFAULT '' COMMENT 'type1:图片;type2:文字',
    `item_scroll_images` varchar(500) NOT NULL DEFAULT '' COMMENT '商品轮播图',
    `item_tag` varchar(500) NOT NULL DEFAULT '' COMMENT '所含标签的 json',
    `internal` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否自营商品 0否 1是',
    `item_shop_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '所属店铺id',
    `item_sales` int(11) NOT NULL DEFAULT '0' comment '销量',
    `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '软删除状态1删除0存在',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    KEY `idx_shop_id` (`item_shop_id`),
    KEY `item_spu_id` (`item_spu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ic_goods` */

/*Table structure for table `ic_item_sku` */

DROP TABLE IF EXISTS `ic_item_sku`;

CREATE TABLE `ic_item_sku` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `item_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '归属于哪个商品',
    `sku_describe` varchar(10) NOT NULL DEFAULT '' COMMENT 'sku文本描述',
    `sku_node_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父SkuID',
    `sku_pid` bigint(20) NOT NULL DEFAULT '0' COMMENT '子skuID',
    `sku_detail_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '规格id',
    `level` int(11) NOT NULL DEFAULT '0',
    `sort` int(11) DEFAULT '0',
    `is_delete` tinyint default 0 not null comment '是否删除',
    `create_time` timestamp default CURRENT_TIMESTAMP not null comment '建表时间',
    `update_time` timestamp default CURRENT_TIMESTAMP not null on update CURRENT_TIMESTAMP comment '更新时间',
    PRIMARY KEY (`id`),
    KEY `idx_sku_nid` (`sku_node_id`),
    KEY `idx_item_id` (`item_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ic_item_sku` */

/*Table structure for table `ic_sku_detail` */

DROP TABLE IF EXISTS `ic_sku_detail`;

CREATE TABLE `ic_sku_detail` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `price` bigint(20) NOT NULL DEFAULT '0' COMMENT '价格。单位为分',
    `long_title` varchar(30) NOT NULL DEFAULT '' COMMENT '子sku长名称',
    `short_title` varchar(15) NOT NULL DEFAULT '' COMMENT '子sku短名称',
    `father_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父sku的id',
    `pic` varchar(500) NOT NULL DEFAULT '' COMMENT '子sku的图片',
    `stock` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品库存',
    `version` bigint(20) NOT NULL DEFAULT '0' COMMENT '乐观锁',
    `remark` varchar(100) DEFAULT '' COMMENT '备注',
    `on_marketing` tinyint(1) NOT NULL COMMENT '是否促销 0否;1是',
    `is_delete` tinyint(1) NOT NULL COMMENT '软删除状态 0删除;1存在',
    `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (`id`),
    KEY `idx_father_id` (`father_id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `ic_sku_detail` */

/*Table structure for table `ic_tags` */

DROP TABLE IF EXISTS `ic_tags`;

CREATE TABLE `ic_tags` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '标签id',
  `title` varchar(7) NOT NULL DEFAULT '' COMMENT '标签名称',
  `contain_item` varchar(500) NOT NULL DEFAULT '' COMMENT '包含此标签的商品id',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '软删除状态0删除1存在',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
