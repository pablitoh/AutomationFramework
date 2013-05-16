package com.openEnglish.utils;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

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
	    	case HtmlUnitDriver: 	{ driver = new HtmlUnitDriver(); break;}
	    	default:				{ throw new Exception();	}
		}
    	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    	if(!driver.getClass().toString().equals("class org.openqa.selenium.htmlunit.HtmlUnitDriver"))
    	{
    		driver.manage().window().maximize();
    	}
    	
    	return driver;
    	
    }
}
