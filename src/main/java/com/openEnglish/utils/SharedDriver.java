package com.openEnglish.utils;


import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

/*
 * Pablo Conde - 6/5/2013 Added: 
 * WebDriver instance to be injected via Spring
 */
@Component
public class SharedDriver {
	
	public WebDriver driver;

	public SharedDriver()
	{
		this.driver = null;
	}
}
