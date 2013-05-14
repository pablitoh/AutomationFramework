package com.openEnglish.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.ClientAccountPage;
import com.openEnglish.pages.ConvertLeadToAccountPage;
import com.openEnglish.pages.LeadsHomePage;
import com.openEnglish.pages.LeadsListPage;
import com.openEnglish.pages.OpportunityPage;
import com.openEnglish.pages.ProductSelectionPage;
import com.openEnglish.pages.QuoteDetailsPage;
import com.openEnglish.pages.SFHomePage;
import com.openEnglish.pages.SFLoginPage;
import com.openEnglish.pages.StorePaymentPage;
import com.openEnglish.pages.ZBillingPage;
import com.openEnglish.pages.ZuoraQuoteCreationFormPage;
import com.openEnglish.pages.ZuoraQuoteRadialsPage;
import com.openEnglish.utils.Products;
import com.openEnglish.utils.SharedDriver;

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
	
	@Then("^I Verify the user \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" is present in Salesforce$")
	public void VerifyLeadCreation(String firstName, String lastName, String email) {
		
		SFHomePage homePage = new SFHomePage(webDriver.driver);
		LeadsHomePage leadsHomePage = homePage.GoToLeadsHome();
		LeadsListPage leadsListPage = leadsHomePage.GoToLeadsList();
		leadsListPage.VerifyLeadIsPresent(firstName,lastName,email);
	}

	
	@Then("^I convert the Lead to Account with \"([^\"]*)\", \"([^\"]*)\"$")
	public void ConvertLeadToAccount(String firstName, String lastName) {
		
		ConvertLeadToAccountPage convert = new ConvertLeadToAccountPage(webDriver.driver);
		convert.Convert(firstName, lastName);
	}
	
	@Then("^I go to the opportunity")
	public void ClickOpportunity() {
		
		ClientAccountPage opportunity = new ClientAccountPage(webDriver.driver);
		opportunity.GoToOpportunity();
		
	}
	
	@Then("^I create the Zuora quote")
	public void createZuoraQuote() {
		OpportunityPage zuoraQuote = new OpportunityPage(webDriver.driver);
		ZuoraQuoteRadialsPage quoteRadial = zuoraQuote.GoToZuoraQuotePage();
		ZuoraQuoteCreationFormPage fillForm = quoteRadial.GoToCreateZuoraQuote();
		fillForm.CreateQuote();
	}
	
	@Then("^I select the regular product")
	public void select_product() throws Exception
	{
		QuoteDetailsPage quoteDetails = new QuoteDetailsPage(webDriver.driver);
		ProductSelectionPage productSelection = quoteDetails.GoToProductSelection();
		quoteDetails = productSelection.SelectProduct();
		ZBillingPage zbillingPage = quoteDetails.GoToZbilling();
		quoteDetails = zbillingPage.SendToZBilling();
		quoteDetails.goToStore();
		
	}
	
	@Then("^I submit the contract with \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void submit_contract_in_Store(String dni, String ccType, String ccNumber,  String ccDate, String firstName, String lastName, String cvv)
	{
		StorePaymentPage storePayment = new StorePaymentPage(webDriver.driver);
		storePayment.PayWith(dni, ccType, ccNumber, ccDate, firstName, lastName, cvv);
	}
	
	
	
	
	
		
}
