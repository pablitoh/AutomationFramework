package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;

public class OESubscriptionPage {

	protected final WebDriver driver;
	
	public OESubscriptionPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public void VerifyFirstPayment() {
		
	//	asserts.verifyTrue(driver.findElement(By.xpath("//td[@style='padding-left:4px;padding-bottom:2px;height:22px;vertical-align:middle']" +
	//			"/span[., 'Processed']")).isDisplayed());
	}
	
}
