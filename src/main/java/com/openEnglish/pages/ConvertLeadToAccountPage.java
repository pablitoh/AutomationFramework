package com.openEnglish.pages;

import com.openEnglish.pages.ClientAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ConvertLeadToAccountPage {

	protected final WebDriver driver;
	
	public ConvertLeadToAccountPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(name="convert")
	private WebElement convertButton;
	@FindBy(name="save")
	private WebElement saveButton;
	
	public ClientAccountPage Convert() {
		
		convertButton.click();
		saveButton.click();
		
		return new ClientAccountPage(driver);
	}
	
	
}
