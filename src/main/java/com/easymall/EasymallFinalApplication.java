package com.easymall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.easymall.mapper")
@SpringBootApplication
public class EasymallFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasymallFinalApplication.class, args);
    }

}
