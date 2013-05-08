package com.openEnglish.utils;


public class CountryStrategyFactory {
	
	public boolean getStrategyFor(ProductStrategy product) {
		
		return product.execute();	
	}
}

	
