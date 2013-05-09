package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuoteDetailsPage {

	
	protected final WebDriver driver;
	
	public QuoteDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//td[@id='topButtonRow']/input[@value='Select / View Products']")
	private WebElement selectProductsButton;
	
	public ProductSelectionPage GoToProductSelection() {
		
		selectProductsButton.click();
		
		return new ProductSelectionPage(driver);
	}
	
	@FindBy(xpath="//a[.='Send to Z-Billing']")
	private WebElement sendToZuoraLink;
	
	public ZBillingPage GoToZbilling() {
		
		sendToZuoraLink.click();
		
		return new ZBillingPage(driver);
	}
	
	@FindBy(xpath="//div[@id='CF00N400000023oTD_ileinner']/a")
	private WebElement opportunity;
	
	public OpportunityPage GoToOpportunity() {
		opportunity.click();
		
		return new OpportunityPage(driver);
	}
	
	
}
