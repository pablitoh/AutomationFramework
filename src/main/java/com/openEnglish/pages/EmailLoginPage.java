package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailLoginPage {

	protected final WebDriver driver;
	
	public EmailLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(id="Email")
	private WebElement emailField;
	@FindBy(id="Passwd")
	private WebElement passwordField;
	@FindBy(id="signIn")
	private WebElement signInButton;
	
	
	public EmailInboxPage Login(String email, String password) {
				
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		signInButton.click();
		
		return new EmailInboxPage(driver);
	}
	
}
