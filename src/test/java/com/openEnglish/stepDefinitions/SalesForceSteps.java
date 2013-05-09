package com.openEnglish.stepDefinitions;

import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.ClientAccountPage;
import com.openEnglish.pages.ConvertLeadToAccountPage;
import com.openEnglish.pages.LeadsListPage;
import com.openEnglish.pages.OpportunityPage;
import com.openEnglish.pages.SFLoginPage;
import com.openEnglish.pages.ZuoraQuoteCreationFormPage;
import com.openEnglish.pages.ZuoraQuoteRadialsPage;
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
	
	@Then("^I convert the Lead to Account")
	public void ConvertLeadToAccount() {
		
		ConvertLeadToAccountPage convert = new ConvertLeadToAccountPage(webDriver.driver);
		convert.Convert();
	}
	
	@Then("^I go to the opportunity")
	public void ClickOpportunity() {
		
		ClientAccountPage opportunity = new ClientAccountPage(webDriver.driver);
		opportunity.GoToOpportunity();
	}
	
	@Then("^I create the Zuora quote")
	public void createZuoraQuote() {
		
		OpportunityPage zuoraQuote = new OpportunityPage(webDriver.driver);
		zuoraQuote.GoToZuoraQuotePage();
	}
	
	@Then("^I complete the radial page")
	public void completeRadialPage() {
		
		ZuoraQuoteRadialsPage quoteRadial = new ZuoraQuoteRadialsPage(webDriver.driver);
		quoteRadial.GoToCreateZuoraQuote();
	}
	
	@Then("^I fill the Quote form")
	public void fillQuoteForm() {
		
		ZuoraQuoteCreationFormPage fillForm = new ZuoraQuoteCreationFormPage(webDriver.driver);
		fillForm.CreateQuote();
	}
	
	
		
}
