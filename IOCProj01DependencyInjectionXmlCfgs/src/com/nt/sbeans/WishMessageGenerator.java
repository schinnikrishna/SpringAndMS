package com.nt.sbeans;

import java.time.LocalTime;

public class WishMessageGenerator {
	private LocalTime lt; // HAS-A property

	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator.WishMessageGenerator()");
	}

	public void setLt(LocalTime lt) {
		this.lt = lt;
		System.out.println("WishMessageGenerator.setLt()");
	}
	//	Business Logic method
	public String generateWishMessage(String user) {
		System.out.println("WishMessageGenerator.generateWishMessage()");
		int hour = lt.getHour();// In 24 hrs format
		if(hour<12) return "Good Morning::"+user;
		else if (hour<16) return "Good Afternoon::"+user;
		else if (hour<20) return "Good Evening::"+user;
		else return "Good Night::"+user;
		
	}
	
	

}
