package com.openEnglish.utils;

public class ProductStrategyFactory {
	
	public boolean getStrategyFor(ProductStrategy product) {
		
		return product.execute();		
	}
}