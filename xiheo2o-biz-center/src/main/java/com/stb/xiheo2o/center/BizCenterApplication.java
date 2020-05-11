package com.stb.xiheo2o.center;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
@MapperScan(basePackages = "com.stb.xiheo2o.center.dao.mapper")
public class BizCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizCenterApplication.class, args);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    BizCenterApplication   started    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
