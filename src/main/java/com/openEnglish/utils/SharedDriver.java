package com.openEnglish.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

@Component
public class SharedDriver {
	
	public WebDriver driver;

	
	public SharedDriver()
	{
		this.driver = null;
	}

}
