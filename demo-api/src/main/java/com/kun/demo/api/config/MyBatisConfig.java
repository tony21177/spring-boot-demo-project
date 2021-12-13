package com.kun.demo.api.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan("com.kun.mapper")
public class MyBatisConfig {
}
