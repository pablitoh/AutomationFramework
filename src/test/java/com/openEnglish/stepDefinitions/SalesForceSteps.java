package com.openEnglish.stepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.LeadsListPage;
import com.openEnglish.pages.SFLoginPage;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class SalesForceSteps {

	@Autowired
	SharedDriver webdriver;
	
	
	@Then("Logs in SalesForce")
	public void LogInSalesForce(String userName, String password) {
		
		SFLoginPage loginPage = new SFLoginPage(webdriver.driver);
		loginPage.Login(userName, password);
	}
	
	@Then("Verify XXXX is present")
	public void VerifyLeadCreation(String firstName) {
		
		LeadsListPage leadsListPage = new LeadsListPage(webdriver.driver);
		leadsListPage.VerifyLeadIsPresent(firstName);
	}
	
}
