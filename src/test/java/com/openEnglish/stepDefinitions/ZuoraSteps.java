package com.openEnglish.stepDefinitions;


import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.EditIndividualAccountPage;
import com.openEnglish.pages.IndividualAccountPage;
import com.openEnglish.pages.OESubscriptionPage;
import com.openEnglish.pages.ZuoraAccountsPage;
import com.openEnglish.pages.ZuoraHomePage;
import com.openEnglish.pages.ZuoraLoginPage;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class ZuoraSteps {
	
	@Autowired
	private SharedDriver webDriver;
	
	
	@Then("^I login to Zuora using \"([^\"]*)\" as username and \"([^\"]*)\" as password$")
	public void login_to_zuora(String userName, String password) {
		webDriver.driver.get("https://apisandbox.zuora.com/login.html");
		ZuoraLoginPage zLogin = new ZuoraLoginPage(webDriver.driver);
		
		zLogin.loginWithCredentials(userName, password);
	}
	
	@Then("^I go to accounts page")
	public void go_to_accounts() {
		
		ZuoraHomePage zHome = new ZuoraHomePage(webDriver.driver);
		
		zHome.GoToAccountsPage();
	}
	
	@Then("^I access the customers account using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void go_to_customer_account(String firstName, String lastName) {
		
		ZuoraAccountsPage zAccounts = new ZuoraAccountsPage(webDriver.driver);
		
		zAccounts.GoToAccount(firstName, lastName);
		
	}
	
	@Then("^I edit the account")
	public void go_to_edit_account() {
		
		IndividualAccountPage iAccount = new IndividualAccountPage(webDriver.driver);
		
		EditIndividualAccountPage editAccount = iAccount.EditAccount();
		editAccount.EditWith();
	}
	
	
	@Then("^I verify the subscription")
	public void go_to_oe_subscription() {
		
		IndividualAccountPage iAccount = new IndividualAccountPage(webDriver.driver);
		
		OESubscriptionPage subPage = iAccount.GoToOESubscription();
		subPage.VerifyFirstPayment();
	}
	
	
	
}