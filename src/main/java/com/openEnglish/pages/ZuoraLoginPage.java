package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZuoraLoginPage {

	private WebDriver driver;

	public ZuoraLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id="id_username")
	private WebElement usernameField;
	@FindBy(id="id_password")
	private WebElement passwordField;
	@FindBy(id="newlogin")
	private WebElement loginIframe;
	@FindBy(id="login_button")
	private WebElement loginButton;
	
	public ZuoraHomePage loginWithCredentials(String username, String password)
	{
		driver.switchTo().frame(loginIframe);
	    
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		
		loginButton.click();
		
		return new ZuoraHomePage(driver);
	}
	
}
