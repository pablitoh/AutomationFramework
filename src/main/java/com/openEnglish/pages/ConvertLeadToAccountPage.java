package com.openEnglish.pages;

import com.openEnglish.pages.ClientAccountPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class ConvertLeadToAccountPage {

	protected final WebDriver driver;
	
	public ConvertLeadToAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(name="convert")
	private WebElement convertButton;
	@FindBy(name="save")
	private WebElement saveButton;
	@FindBy(id="accid")
	private WebElement accid;
	
	public ClientAccountPage Convert(String firstName, String lastName) {
		
		convertButton.click();
		Select accSelect = new Select(accid);
		  accSelect.selectByVisibleText("Create New Account: " + firstName + " " + lastName);
		saveButton.click();
		
		return new ClientAccountPage(driver);
	}
	
	
}
