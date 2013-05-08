package com.openEnglish.utils;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductStrategyFactory {
	
	@Autowired
	SharedDriver webdriver;
	
	public void getStrategyFor(Products product) throws Exception {
		
		switch ( product ) {
		
    	case RegularCourse:				{ 	ProductStrategyRegularCourseFinanced reg = new ProductStrategyRegularCourseFinanced(webdriver.driver);
    										reg.execute(); break; }
    	default:						{ throw new Exception();	}
		}
	}
}