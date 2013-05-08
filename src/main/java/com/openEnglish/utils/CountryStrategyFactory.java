package com.openEnglish.utils;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import com.openEnglish.utils.SharedDriver;


public class CountryStrategyFactory {
	
	@Autowired
	private SharedDriver webDriver;
	
	public void getStrategyFor(String firstName, String lastName, String email, Countries country,
			String state, String city, String telType, String telCode, String tel1, String tel2,
			String media, String age, WebDriver driver) throws Exception {
		
		System.out.println(driver);
		
		switch ( country ) {
		
    	case Argentina:				{ 	CountryStrategyArgentina arg = new CountryStrategyArgentina(driver);
    									arg.execute(firstName, lastName, email, state, city, 
    											telType, telCode, tel1, tel2, media, age);
    									break;}
    	case Venezuela:				{	CountryStrategyVenezuela ven = new CountryStrategyVenezuela(webDriver.driver);
										ven.execute(firstName, lastName, email, state, city, 
												telType, telCode, tel1, tel2, media, age); break; }
    	default:					{ throw new Exception();	}
		}

	}
}

	
