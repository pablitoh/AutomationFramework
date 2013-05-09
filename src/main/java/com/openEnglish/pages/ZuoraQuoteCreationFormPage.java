package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ZuoraQuoteCreationFormPage {

	protected final WebDriver driver;
	
	public ZuoraQuoteCreationFormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		
	}
	
	@FindBy(id="asdf:quoteForm:quoteblock:SubscriptionTermsBlock:paymentMethod")
	private WebElement creditCardSelect;
	@FindBy(id="asdf:quoteForm:quoteblock:SubscriptionTermsBlock:billingTerm")
	private WebElement billingTermSelect;
	@FindBy(xpath="//td[@id='asdf:quoteForm:quoteblock:j_id26:bottom']" +
				"/input[@id='asdf:quoteForm:quoteblock:j_id26:bottom:j_id27']")
	private WebElement saveButton;
	
	
	public QuoteDetailsPage CreateQuote() {
		
		Select selectPayment = new Select(creditCardSelect);
		selectPayment.selectByVisibleText("Credit Card");
		
		Select selectBillingTerm = new Select(billingTermSelect);
		selectBillingTerm.selectByVisibleText("1 Year");
		
		saveButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
