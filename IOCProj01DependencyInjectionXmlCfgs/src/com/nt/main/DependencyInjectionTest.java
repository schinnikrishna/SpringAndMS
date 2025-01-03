package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DependencyInjectionTest.main()::Start");
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		Object obj = ctx.getBean("wmg");
		//		Type Casting
		WishMessageGenerator wmg=(WishMessageGenerator)obj;
		String result = wmg.generateWishMessage("Chinni");
		System.out.println(result);
		ctx.close();
		System.out.println("DependencyInjectionTest.main()::End");
		

	}

}
