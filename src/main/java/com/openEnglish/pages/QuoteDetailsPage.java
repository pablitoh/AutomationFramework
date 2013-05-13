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
	@FindBy(xpath="//a[.='Send to Z-Billing']")
	private WebElement sendToZuoraLink;
	@FindBy(xpath="//div[@id='CF00N400000023oTD_ileinner']/a")
	private WebElement opportunity;
	@FindBy(linkText="Store URL")
	private WebElement storeLink;
	
	public ProductSelectionPage GoToProductSelection() {
		
		selectProductsButton.click();
		
		return new ProductSelectionPage(driver);
	}
	
	
	public ZBillingPage GoToZbilling() {
		
		sendToZuoraLink.click();
		
		return new ZBillingPage(driver);
	}
	
	public OpportunityPage GoToOpportunity() {
		opportunity.click();
		
		return new OpportunityPage(driver);
	}
	
	public StorePaymentPage goToStore()
	{
	driver.get(storeLink.getAttribute("href"));
	return new StorePaymentPage(driver);
	}
	
	
}
