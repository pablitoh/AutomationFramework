package com.openEnglish.utils;


public class CountryStrategyFactory {
	
	public boolean getStrategyFor(CountryStrategy country) {
		
		return country.execute(null, null, null, null, null, null, null, null, null, null, null, null);	
	}
}

	
