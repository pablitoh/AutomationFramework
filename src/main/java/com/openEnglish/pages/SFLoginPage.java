package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SFLoginPage {

	protected final WebDriver driver;
	
	public SFLoginPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id="username")
	private WebElement userNameField;
	@FindBy(id="password")
	private WebElement passwordField;
	@FindBy(id="Login")
	private WebElement loginButton;
	
	public SFHomePage Login(String userName, String password) {
		
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		loginButton.click();
		
		return new SFHomePage(driver);
	}
	
}
