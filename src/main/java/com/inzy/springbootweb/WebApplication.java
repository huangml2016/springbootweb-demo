package com.inzy.springbootweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@MapperScan("com.inzy.springbootweb.dao")
@SpringBootApplication	
//@EnableEurekaClient
public class WebApplication extends SpringBootServletInitializer {
//	@Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(WebApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
