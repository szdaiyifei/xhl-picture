package com.xhl.xhlpicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author szdaiyifei
 */
@SpringBootApplication
@MapperScan("com.xhl.xhlpicturebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class XhlPictureBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(XhlPictureBackendApplication.class, args);
    }

}
