package com.laoshentou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author shenxiang
 * @date 2020年04月30日, 0030 13:07
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.laoshentou.mapper"})
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
