package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class OpportunityPage {
	
	protected final WebDriver driver;
	
	public OpportunityPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@title='New Zuora Quote']")
	private WebElement newZuoraQuoteButton;
	
	public ZuoraQuoteRadialsPage GoToZuoraQuotePage() {
		
		newZuoraQuoteButton.click();
	
		return new ZuoraQuoteRadialsPage(driver);
	}
	
	@FindBy(xpath="//div[@id='00N400000023vm2_ileinner']/img")
	private WebElement mailStoreCheckBox;	
	@FindBy(xpath="//input[@title='Save']")
	private WebElement saveButton;
	
	public OpportunityPage SendEmail() throws Exception {
		
		Actions userAction = new Actions(driver);
		userAction.doubleClick(mailStoreCheckBox)
					.click();
		
		Action executeAction = userAction.build();
		executeAction.perform();
		
		//WAIT
		Thread.sleep(2000);		
		saveButton.click();
		
		return this;
	}
	
}
