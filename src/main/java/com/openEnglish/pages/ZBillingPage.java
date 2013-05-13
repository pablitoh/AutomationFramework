package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZBillingPage {
	
	protected final WebDriver driver;
	
	public ZBillingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(id="page:previewform:subscriptionblock:j_id323:j_id326")
	private WebElement sendToZuora;
	@FindBy(xpath="//input[@value='Done']")
	private WebElement doneButton;
	
	public QuoteDetailsPage SendToZBilling() throws Exception {
		
		sendToZuora.click();
		
		//WAIT
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Done']")));
		doneButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
