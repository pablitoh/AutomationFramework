package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailInboxPage {

	protected final WebDriver driver;
	
	public EmailInboxPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//span[@name='Finance and Collections .']")
	private WebElement financeMail;
	
	public EmailPage GoToEmail() {
		
		financeMail.click();
		
		return new EmailPage(driver);
	}
	
	
	@FindBy(xpath="//span[@name='Solicitud procesada con éxito']")
	private WebElement licenseMail;
	
	public EmailPage GoToVerifyLicense() {
		
		licenseMail.click();
		
		return new EmailPage(driver);
	}
	
}
