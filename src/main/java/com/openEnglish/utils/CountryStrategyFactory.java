package com.openEnglish.utils;

import org.springframework.beans.factory.annotation.Autowired;
import com.openEnglish.utils.SharedDriver;


public class CountryStrategyFactory {
	
	@Autowired
	SharedDriver webdriver;
	
	public void getStrategyFor(String firstName, String lastName, String email, Countries country,
			String state, String city, String telType, String telCode, String tel1, String tel2,
			String media, String age) throws Exception {
		
		switch ( country ) {
		
    	case Argentina:				{ 	CountryStrategyArgentina arg = new CountryStrategyArgentina(webdriver.driver);
    									arg.execute(firstName, lastName, email, state, city, 
    											telType, telCode, tel1, tel2, media, age); break;}
    	case Venezuela:				{	CountryStrategyVenezuela ven = new CountryStrategyVenezuela(webdriver.driver);
										ven.execute(firstName, lastName, email, state, city, 
												telType, telCode, tel1, tel2, media, age); break; }
    	default:					{ throw new Exception();	}
		}

	}
}

	
