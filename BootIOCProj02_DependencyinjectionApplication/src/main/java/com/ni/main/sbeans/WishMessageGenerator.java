package com.ni.main.sbeans;

import java.time.LocalTime;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration("wmg") 
public class WishMessageGenerator {

	@Autowired
	private LocalTime lt; //HAS-A property
	
	public String generateMessage(String user) {
		int hour = lt.getHour();
		 
		if(hour<12)
			return "Good Morning"; 
		else if(hour>= 12 && hour<16)
			return "Good Afternoon";   
		else if(hour>=16 && hour<18)
			return "Good Evening";
		else if(hour>=18) 
		return "Good Evening";
		else
			throw new IllegalArgumentException("Invalid time please enter valid time..");
	}
	
	
}
