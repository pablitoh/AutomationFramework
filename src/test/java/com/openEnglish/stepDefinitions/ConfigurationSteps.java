package com.openEnglish.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.*;




public class ConfigurationSteps {
	
	
	@Autowired
	private SharedDriver webDriver;
	
	public enum Browsers		{ Firefox, Chrome, InternetExplorer};
	
	 @Given("^The browser is (.*)$")
	    public void chooseBrowser(Browsers browser) throws Exception {
	    	switch ( browser ) {
		    	case Firefox:				{ 	webDriver.driver = new FirefoxDriver(); 		break; }
		    	case Chrome:				{ 	System.setProperty("webdriver.chrome.driver", "chromedriver.exe"); 
		    									webDriver.driver = new ChromeDriver();			break; }
		    	case InternetExplorer:		{	
		    									System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		    									webDriver.driver = new InternetExplorerDriver(); 	break; }
		    	default:				{ throw new Exception();	}
			}
	    	webDriver.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    }
	
	@After
	public void quit_browser_instance() {	
		webDriver.driver.quit();
	}
}
