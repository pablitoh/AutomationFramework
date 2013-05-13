package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.openEnglish.utils.Countries;


public class LeadCreationWebFormPage {

	protected final WebDriver driver;
	
	public LeadCreationWebFormPage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(id="firstName")
	private WebElement firstNameField;
	@FindBy(id="lastName")
	private WebElement lastNameField;
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(id="country")
	private WebElement countrySelect;
	@FindBy(id="media")
	private WebElement mediaSelect;
	@FindBy(id="state")
	private WebElement stateSelect;
	@FindBy(id="city")
	private WebElement citySelect;
	@FindBy(id="phoneType1Local")
	private WebElement phoneLocal;
	@FindBy(id="phoneType1Cell")
	private WebElement phoneCell;
	@FindBy(id="areaCode1")
	private WebElement areaCode;
	@FindBy(id="phoneNumber11")
	private WebElement phoneNumber1;
	@FindBy(id="phoneNumber12")
	private WebElement phoneNumber2;
	@FindBy(id="age")
	private WebElement ageSelect;
	@FindBy(id="sendButton")
	private WebElement sendButton;

	
	public ProductAdvisorQuestionnairePage FillArgentina(String firstName, String lastName, String email, Countries country,
			String state, String city, String telType, String telCode, 
			String tel1, String tel2, String media, String age) throws Exception {
		
		firstNameField.clear();
		lastNameField.clear();
		emailField.clear();
		
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		
		Select selectCountry = new Select(countrySelect);
		selectCountry.selectByVisibleText(country.toString());
		
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.textToBePresentInElement(By.id("state"), state));
		
		Select selectState = new Select(stateSelect);
		selectState.selectByVisibleText(state);
		
		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.textToBePresentInElement(By.id("city"), city));
		
		Select selectCity = new Select(citySelect);
		selectCity.selectByVisibleText(city);
		
		//Is there a better way to do this?
		if (telType.contains("Local")) {
			phoneLocal.click();
		}
			
		else {
			phoneCell.click();
		}
		
		phoneNumber1.sendKeys(tel1);
		phoneNumber2.sendKeys(tel2);
			
		//Depending on the test cases, this needs to be reviewed in order to change it to Strategy Pattern
		Select selectMedia = new Select(mediaSelect);
		selectMedia.selectByVisibleText(media);

		Select selectAge = new Select(ageSelect);
		selectAge.selectByVisibleText(age);
		
		sendButton.click();
		
		return new ProductAdvisorQuestionnairePage(driver);
	}
	
	public ProductAdvisorQuestionnairePage FillVenezuela(String firstName, String lastName, String email, Countries country,
			String state, String city, String telType, String telCode, 
			String tel1, String tel2, String media, String age) throws Exception {
		
		firstNameField.sendKeys(firstName);
		lastNameField.sendKeys(lastName);
		emailField.sendKeys(email);
		
		Select selectCountry = new Select(countrySelect);
		selectCountry.selectByVisibleText(country.toString());
		
		areaCode.sendKeys(telCode);
		phoneNumber1.sendKeys(tel1);
		phoneNumber2.sendKeys(tel2);
			
		//Depending on the test cases, this needs to be reviewed in order to change it to Strategy Pattern
		Select selectMedia = new Select(mediaSelect);
		selectMedia.selectByVisibleText(media);

		Select selectAge = new Select(ageSelect);
		selectAge.selectByVisibleText(age);
		
		sendButton.click();
		
		return new ProductAdvisorQuestionnairePage(driver);
	}
	
	
}
