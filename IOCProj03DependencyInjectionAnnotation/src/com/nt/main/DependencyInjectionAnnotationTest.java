package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.cfg.AppConfig;
import com.nt.sbeans.SeasonFinder;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionAnnotationTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("-------------------------------------");
		WishMessageGenerator wmg = (WishMessageGenerator)ctx.getBean("wmg");
		String result = wmg.generateWishMessage("Chinni Krishna");
		System.out.println(result);
		System.out.println("-------------------------------------");
		SeasonFinder sf = ctx.getBean("sf", SeasonFinder.class);
		String seasonName = sf.getSeason();
		System.out.println("seasonName::"+seasonName);
		
		ctx.close();

	}

}
