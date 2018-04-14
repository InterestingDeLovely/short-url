package com.url;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 短链接启动程序
 * @author YI
 * @date 2018-4-12 15:25:53
 */
@SpringBootApplication
@MapperScan("com.url.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
