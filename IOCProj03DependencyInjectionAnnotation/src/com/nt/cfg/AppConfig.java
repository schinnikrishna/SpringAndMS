package com.nt.cfg;

import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {
	public AppConfig() {
		// TODO Auto-generated constructor stub
		System.out.println("AppConfig.AppConfig()");
	}
	
//	getLocalTime
	@Bean(name = "ltime")
	public LocalTime getLocalTime() {
		System.out.println("AppConfig.getLocalTime()");
		return LocalTime.now();
	}

}
