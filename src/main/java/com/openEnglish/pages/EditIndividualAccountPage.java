package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EditIndividualAccountPage {

	protected final WebDriver driver;
	
	public EditIndividualAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(id="notes")
	private WebElement notes;
	@FindBy(id="customFieldsData.cf1Data")
	private WebElement customProcessorSelect;
	@FindBy(id="netSuiteIntegrationData.synctoNetSuite")
	private WebElement netSuiteSelect;
	@FindBy(xpath="//a[@id='save_basicInfo']/span")
	private WebElement saveButton;
	
	public IndividualAccountPage EditWith() {
		
		notes.sendKeys("test account");
		
		Select customProcessor = new Select(customProcessorSelect);
		customProcessor.selectByVisibleText("No");
		
		Select netSuiteIntegration = new Select(netSuiteSelect);
		netSuiteIntegration.selectByVisibleText("No");

		saveButton.click();
		
		return new IndividualAccountPage(driver);
		
	}
	
	
	
}