package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

<<<<<<< HEAD
import com.openEnglish.utils.Countries;
=======
import com.openEnglish.utils.CountryStrategy;
>>>>>>> 4a95f6b0daceeaede9536def952c12fef233a1ea
import com.openEnglish.utils.CountryStrategyFactory;

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

	
	
<<<<<<< HEAD
	public ProductAdvisorQuestionnairePage CreateWith(String firstName, String lastName, String email, Countries country,
=======
	public ProductAdvisorQuestionnairePage CreateWith(String firstName, String lastName, String email, CountryStrategy country,
>>>>>>> 4a95f6b0daceeaede9536def952c12fef233a1ea
			String state, String city, String telType, String telCode, String tel1, String tel2,
			String media, String age) throws Exception {
		
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		
<<<<<<< HEAD
		//WAIT
		Thread.sleep(5000);
=======
		
		
>>>>>>> 4a95f6b0daceeaede9536def952c12fef233a1ea
		CountryStrategyFactory countryStrategy = new CountryStrategyFactory();
		
		countryStrategy.getStrategyFor(firstName, lastName, email, country, state, city, telType, telCode, tel1, tel2, media, age);
		
			
		//Depending on the test cases, this needs to be reviewed in order to change it to Strategy Pattern
		Select selectMedia = new Select(mediaSelect);
		selectMedia.selectByVisibleText(media);

		Select selectAge = new Select(ageSelect);
		selectAge.selectByVisibleText(age);
		
		sendButton.click();
		
		return new ProductAdvisorQuestionnairePage(driver);
	}
	
	
}
