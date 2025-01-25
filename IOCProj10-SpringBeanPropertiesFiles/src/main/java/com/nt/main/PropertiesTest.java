package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.config.AppConfig;
import com.nt.sbeans.PersonInfo;

public class PropertiesTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		PersonInfo p = ctx.getBean("pInfo", PersonInfo.class);
		System.out.println(p);
		System.out.println("=====================");
		
		Environment env = ctx.getEnvironment();
		System.out.println("Per.id from Environment object::"+env.getProperty("per.id"));
		System.out.println("=====================");
		
		System.out.println(env);
		ctx.close();

	}

}
