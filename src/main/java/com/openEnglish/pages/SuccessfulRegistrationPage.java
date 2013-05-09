package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SuccessfulRegistrationPage {

	protected final WebDriver driver;
	
	public SuccessfulRegistrationPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	
	
}
