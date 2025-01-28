package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class SpringI18NTest {

	public static void main(String[] args) {
		// read Locale info from command line
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Locale Language");
		String langauge = sc.next();
		System.out.println("Enter Locale Country");
		String country = sc.next();
		Locale locale = new Locale(langauge, country);
		// create Spring IOC
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		// call getMessage()
		String welcomeMsg = ctx.getMessage("welcome.msg", new String[] {}, locale);
		System.out.println(welcomeMsg);
		String goodbyeMsg = ctx.getMessage("goodbye.msg", new String[] {}, locale);
		System.out.println(goodbyeMsg);
		String chatMsg = ctx.getMessage("chat.msg", new String[] {}, locale);
		System.out.println(chatMsg);
		
		sc.close();
		ctx.close();

	}

}
