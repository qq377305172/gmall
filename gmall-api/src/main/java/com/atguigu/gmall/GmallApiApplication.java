package com.atguigu.gmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages="com.atguigu.gmall.dao")
@SpringBootApplication
public class GmallApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmallApiApplication.class, args);
	}
}
