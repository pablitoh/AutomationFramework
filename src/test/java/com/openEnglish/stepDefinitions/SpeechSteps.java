package com.openEnglish.stepDefinitions;

import static org.junit.Assert.assertNotNull;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.ZuoraPage;
import com.openEnglish.utils.SharedDriver;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;

public class SpeechSteps {
	
	@Autowired
	SharedDriver webdriver;
	
	@Given("Im on Zuora Page")
	public void go_to_zuorapage() {
		webdriver.driver.get("https://apisandbox.zuora.com/login.html");	
	}
	@Then("Fill the username and Password")
	public void fill_zuora_auth()
	{
		ZuoraPage zuorapage = new ZuoraPage(webdriver.driver);
		zuorapage.typenames();
	}
	
}
