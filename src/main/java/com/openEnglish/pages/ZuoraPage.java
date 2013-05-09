package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
/*
 * Pablo Conde - 6/5/2013 Added: 
 * Zuora HomePage class
 */
public class ZuoraPage {
	
	
	private WebDriver driver;

	public ZuoraPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id="id_username")
	private WebElement usernameField;
	@FindBy(id="id_password")
	private WebElement passwordField;
	@FindBy(id="newlogin")
	private WebElement loginIframe;
	
	public ZuoraPage loginWithCredentials(String username, String password)
	{
		driver.switchTo().frame(loginIframe);
	    
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		
		return new ZuoraPage(driver);
	}
	
}
