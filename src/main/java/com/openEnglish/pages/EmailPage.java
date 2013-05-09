package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailPage {

	protected final WebDriver driver;
	
	public EmailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}	

	@FindBy(xpath="//a[.='Store URL']")
	private WebElement storeURL;
	
	public StorePaymentPage GoToStore() {
		
		String navigateTo = storeURL.getAttribute("href");
		driver.get(navigateTo);
		
		return new StorePaymentPage(driver);
	}
	
	
	public void VerifyReceivedLicense() {
		
		//asserts.verifyTrue(driver.findElement(By.xpath("//a[.='Activar']")).isEnabled());
	}
	
}