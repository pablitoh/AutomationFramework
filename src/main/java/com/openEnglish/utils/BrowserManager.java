package com.openEnglish.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;



public class BrowserManager {
	
    public WebDriver chooseBrowser(Browsers browser) throws Exception {
    	
    	WebDriver driver;
    	
    	switch ( browser ) {
	    	case Firefox:				{ 	driver = new FirefoxDriver(); 		break; }
	    	case Chrome:				{ 	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
	    									driver = new ChromeDriver();			break; }
	    	case InternetExplorer:		{	
	    									System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
	    									driver = new InternetExplorerDriver(); 	break; }
	    	default:				{ throw new Exception();	}
		}
    	return driver;
    	
}
}