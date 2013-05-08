package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualAccountPage {

	protected final WebDriver driver;
	
	public IndividualAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[@id='bt_basic_edit']/span")
	private WebElement editButton;
	
	public EditIndividualAccountPage EditAccount() {
		
		editButton.click();
		
		return new EditIndividualAccountPage(driver);
	}
	
	@FindBy(xpath="//table[@id='subsciptions']/tbody/tr/td/div/a[contains(.,'OE')]")
	private WebElement subscription;
	
	public OESubscriptionPage GoToOESubscription() {
		
		subscription.click();
		
		return new OESubscriptionPage(driver);
	}
	
}