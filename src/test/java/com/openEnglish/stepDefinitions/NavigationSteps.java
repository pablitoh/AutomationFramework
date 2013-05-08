package com.openEnglish.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.openEnglish.pages.LeadCreationWebFormPage;
import com.openEnglish.pages.ZuoraPage;
import com.openEnglish.utils.Countries;
import com.openEnglish.utils.CountryStrategy;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class NavigationSteps {
	
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
		zuorapage.loginWithCredentials(username, password);
	}
	
	@Given("^Fill the Form with the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void fill_the_form_with_users(String firstName, String lastName, String email, Countries country, String state, String city, String telType, String areaCode, String tel1, String tel2, String media, String age) throws Exception
	{
		LeadCreationWebFormPage webform = new LeadCreationWebFormPage(webdriver.driver);
		webdriver.driver.get("http://stage.thinkglish.com/inicio.do");
		webform.CreateWith(firstName, lastName, email, country, state, city, telType, areaCode, tel1, tel2, media, age);
		
		//System.out.println(country);
		
	}
}

