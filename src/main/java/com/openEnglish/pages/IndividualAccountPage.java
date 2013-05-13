package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndividualAccountPage {

	protected final WebDriver driver;
	
	public IndividualAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//a[@id='bt_basic_edit']/span")
	private WebElement editButton;
	
	@FindBy(xpath="//table[@id='subsciptions']/tbody/tr/td/div/a[contains(.,'OE')]")
	private WebElement subscription;
	
	public EditIndividualAccountPage EditAccount() {
		
		editButton.click();
		
		return new EditIndividualAccountPage(driver);
	}
	

	
	public OESubscriptionPage GoToOESubscription() {
		
		subscription.click();
		
		return new OESubscriptionPage(driver);
	}
	
}