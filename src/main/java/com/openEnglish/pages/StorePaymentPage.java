package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class StorePaymentPage {

	protected final WebDriver driver;
	
	public StorePaymentPage(WebDriver driver) {
		super();
		this.driver = driver;
	}	
	
	
	@FindBy(id="account.billTo.documentNumber")
	private WebElement dniField;
	@FindBy(id="paymentMethodSelector")
	private WebElement typeOfCardselector;
	@FindBy(id="paymentMethodViewModel.paymentInfo.cardNumber")
	private WebElement creditCardNumberField;
	@FindBy(id="expiryMonth")
	private WebElement expiryMonthSelect;
	@FindBy(id="expiryYear")
	private WebElement expiryYearSelect;
	@FindBy(id="paymentMethodViewModel.paymentInfo.cardHolderName")
	private WebElement cardHolderNameField;
	@FindBy(id="paymentMethodViewModel.paymentInfo.securityCode")
	private WebElement ccvField;
	@FindBy(id="contracts[0].signature")
	private WebElement signatureField;
	@FindBy(id="contracts0.hasAcceptedTerms1")
	private WebElement acceptContractCheckBox1;
	@FindBy(id="contracts0.hasAcceptedMoneyBackGuaranteeUpfront1")
	private WebElement acceptContractCheckBox2;
	@FindBy(id="contracts0.hasAcceptedNoRefundsUpfront1")
	private WebElement acceptContractCheckBox3;
	@FindBy(id="confirm")
	private WebElement confirmButton;	
	
	public void PayWith(String dni, String ccType, String ccNumber, String ccExpiryMonth, 
			String ccExpiryYear, String firstName, String lastName, String cvv) {
		
		dniField.sendKeys(dni);
		
		Select ccSelect = new Select(typeOfCardselector);
		ccSelect.selectByVisibleText(ccType);
		
		creditCardNumberField.sendKeys(ccNumber);
	
		Select ccExpiryMonthSelect = new Select(expiryMonthSelect);
		ccExpiryMonthSelect.selectByVisibleText(ccExpiryMonth);
		
		Select ccExpiryYearSelect = new Select(expiryYearSelect);
		ccExpiryYearSelect.selectByVisibleText(ccExpiryYear);

		cardHolderNameField.clear();
		cardHolderNameField.sendKeys(firstName + lastName);
		
		ccvField.sendKeys(cvv);
		
		signatureField.sendKeys(firstName + lastName);

		
		acceptContractCheckBox1.click();
		acceptContractCheckBox2.click();
		acceptContractCheckBox3.click();
		
		//WebElement earlyTermination = driver.findElement(By.id("contracts0.hasAcceptedEarlyTerminationFee1"));
		
		//if (earlyTermination.isEnabled())
		//	earlyTermination.click();
		
		confirmButton.click();	
	}
	
}
