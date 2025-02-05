package com.nt.main.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {

	public SeasonFinder() {
		System.out.println("SeasonFinder.SeasonFinder()");
	}
	       
	@Autowired
	LocalDate ld; 
 
	public String findSeason() {
		int month = ld.getMonthValue();
		if (month >= 3 && month < 6)
			return "Summer season";
		else if (month >= 6 && month > 10)
			return "Rainy season";
		else
			return "Winter season";
	}
}
