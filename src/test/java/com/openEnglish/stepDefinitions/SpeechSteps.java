package com.openEnglish.stepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.ZuoraPage;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;





public class SpeechSteps {
	
	@Autowired
	SharedDriver webdriver;
	
	@Given("Im on Zuora Page")
	public void go_to_zuorapage() {
		webdriver.driver.get("https://apisandbox.zuora.com/login.html");	
	}
	
	@Then("^Fill the username and Password with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void fill_zuora_auth(String username, String password)
	{
		ZuoraPage zuorapage = new ZuoraPage(webdriver.driver);
		zuorapage.typenames(username, password);
	}
	
}
