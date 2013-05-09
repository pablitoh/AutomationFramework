package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OESubscriptionPage {

	protected final WebDriver driver;
	
	public OESubscriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	
	public void VerifyFirstPayment() {
		
	//	asserts.verifyTrue(driver.findElement(By.xpath("//td[@style='padding-left:4px;padding-bottom:2px;height:22px;vertical-align:middle']" +
	//			"/span[., 'Processed']")).isDisplayed());
	}
	
}
