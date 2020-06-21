package com.cn.shirly.myeasybuy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.cn.shirly.myeasybuy.dao")
@SpringBootApplication
public class mainclass {
    public static void main(String[] args) throws Exception {
        System.out.println("启动成功！");
        SpringApplication.run(mainclass.class, args);
    }
}
