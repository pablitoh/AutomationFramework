package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZBillingPage {
	
	protected final WebDriver driver;
	
	public ZBillingPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="page:previewform:subscriptionblock:j_id323:j_id326")
	private WebElement sendToZuora;
	@FindBy(xpath="//input[@value='Done']")
	private WebElement doneButton;
	
	public QuoteDetailsPage SendToZBilling() throws Exception {
		
		sendToZuora.click();
		//WAIT
		Thread.sleep(5000);
		doneButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
