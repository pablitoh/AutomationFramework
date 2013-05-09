package com.openEnglish.stepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.LeadsListPage;
import com.openEnglish.pages.SFLoginPage;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SalesForceSteps {

	@Autowired
	SharedDriver webDriver;
	
	
	@Then("^I login to Salesforce using \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void LogInSalesForce(String userName, String password) {
		
		webDriver.driver.get("https://test.salesforce.com/");
		
		SFLoginPage loginPage = new SFLoginPage(webDriver.driver);
		loginPage.Login(userName, password);
	}
	
	@Then("Verify XXXX is present")
	public void VerifyLeadCreation(String firstName) {
		
		LeadsListPage leadsListPage = new LeadsListPage(webDriver.driver);
		leadsListPage.VerifyLeadIsPresent(firstName);
	}
	
}
