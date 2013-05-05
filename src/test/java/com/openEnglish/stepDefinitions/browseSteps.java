package com.openEnglish.stepDefinitions;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.utils.SharedDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class browseSteps {
	
	
	@Autowired
	private SharedDriver webDriver;
	
	public enum Browsers		{ Firefox, Chrome, InternetExplorer};
	
	 @Given("^I want to use the browser (.*)$")
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
	    	
	    }
	
	@Then("Close the browser")
	public void say_something() {	
		webDriver.driver.quit();
	}
}
