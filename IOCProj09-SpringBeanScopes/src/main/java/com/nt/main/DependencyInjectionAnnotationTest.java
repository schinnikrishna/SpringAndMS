package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionAnnotationTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("-------------------------------------");
		WishMessageGenerator wmg = (WishMessageGenerator)ctx.getBean("wmg");
		String result = wmg.generateWishMessage("Chinni Krishna");
		System.out.println(result);
		
		
		ctx.close();

	}

}
