package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.openEnglish.utils.CountryStrategy;
import com.openEnglish.utils.CountryStrategyFactory;
import com.openEnglish.utils.ProductStrategy;

public class LeadCreationWebFormPage {

	protected final WebDriver driver;
	
	public LeadCreationWebFormPage (WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id="firstName")
	private WebElement firstNameField;
	@FindBy(id="lastName")
	private WebElement lastNameField;
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(id="media")
	private WebElement mediaSelect;
	@FindBy(id="age")
	private WebElement ageSelect;
	@FindBy(id="sendButton")
	private WebElement sendButton;

	
	
	public ProductAdvisorQuestionnairePage CreateWith(String firstName, String lastName, String email, CountryStrategy country,
			String state, String city, String telType, String telCode, String tel1, String tel2,
			String media, String age) throws Exception {
		
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		
		
		
		CountryStrategyFactory countryStrategy = new CountryStrategyFactory();
		
		countryStrategy.getStrategyFor(country);
		
			
		//Depending on the test cases, this needs to be reviewed in order to change it to Strategy Pattern
		Select selectMedia = new Select(mediaSelect);
		selectMedia.selectByVisibleText(media);

		Select selectAge = new Select(ageSelect);
		selectAge.selectByVisibleText(age);
		
		sendButton.click();
		
		return new ProductAdvisorQuestionnairePage(driver);
	}
	
	
}
