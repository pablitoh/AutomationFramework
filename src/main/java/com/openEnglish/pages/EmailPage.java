package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage {

	protected final WebDriver driver;
	
	public EmailPage(WebDriver driver) {
		super();
		this.driver = driver;
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