package com.stb.xiheo2o.center;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BizCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizCenterApplication.class, args);
        log.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>    BizCenterApplication   started    >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
