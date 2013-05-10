package com.openEnglish.stepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.utils.BrowserManager;
import com.openEnglish.utils.Browsers;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.*;

/*
 * Pablo Conde - 6/5/2013 Added: 
 * ConfigurationSteps.java only contains cross-features steps. Such as browser configuration/operations, profile loading, etc.
 */
public class ConfigurationSteps {
	
	
	@Autowired
	private SharedDriver webDriver;

	
	 @Given("^The browser (.*)$")
	    public void selectBrowser(Browsers browser) throws Exception {
		 webDriver.driver=  new BrowserManager().chooseBrowser(browser);	
	    }
	 @Then("Pause")
	 public void pauseEverything() throws InterruptedException
	 {
		 Thread.sleep(10000);
	 }
	
	@After
	public void quit_browser_instance() {	
		
		if(webDriver.driver!=null)
			webDriver.driver.quit();
	}
}
