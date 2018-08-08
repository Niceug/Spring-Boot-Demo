package com.ltp.spring_boot;

import com.ltp.spring_boot.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		AppConfig appConfig = (AppConfig) context.getBean("appConfig");
        System.out.println(appConfig);
    }
}
