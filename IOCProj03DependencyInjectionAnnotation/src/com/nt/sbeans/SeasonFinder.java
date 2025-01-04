package com.nt.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private Date date;
	
	
	
	public SeasonFinder() {
//		super();
		// TODO Auto-generated constructor stub
		System.out.println("SeasonFinder.SeasonFinder()");
	}



	public String getSeason() {
		System.out.println("SeasonFinder.getSeason()");
		int monthNo = date.getMonth();
		if(monthNo >= 2 && monthNo <=5 )
			return "Summer";
		else if(monthNo >= 6 && monthNo <= 8)
			return "Monsoon";
		else if(monthNo >= 9 && monthNo <= 10)
			return "Autumn";
		else return "Winter ";
		
	}

}
