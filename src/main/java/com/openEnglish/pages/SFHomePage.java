package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openEnglish.pages.AccountsListPage;

public class SFHomePage {
	
	protected final WebDriver driver;
	
	public SFHomePage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath="//li[@id='Lead_Tab']/a")
	private WebElement leadsTab;
	
	public LeadsHomePage GoToLeadsHome() {
		leadsTab.click();
		return new LeadsHomePage(driver);
	}
	
	@FindBy(xpath="//li[@id='Account_Tab']/a")
	private WebElement accountsTab;
	
	public AccountsListPage GoToAccountsList() {
		accountsTab.click();
		return new AccountsListPage(driver);
		
	}
	
	@FindBy(xpath="//li[@id='Opportunity_Tab']/a")
	private WebElement opportunityTab;
	
	public OpportunitiesListPage GoToOpportunitiesList() {
		opportunityTab.click();
		return new OpportunitiesListPage(driver);
	}
	
	@FindBy(xpath="//li[@id='01r400000001saA_Tab']/a")
	private WebElement quotesList;
	
	public QuotesListPage GoToQuotesList() {
		quotesList.click();
		return new QuotesListPage(driver);
	}
	
}
