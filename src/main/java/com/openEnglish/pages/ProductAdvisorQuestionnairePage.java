package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.util.Assert;

public class ProductAdvisorQuestionnairePage {

	protected final WebDriver driver;
	
	public ProductAdvisorQuestionnairePage (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id="q1a")
	private WebElement yesRadial;
	@FindBy(id="q1b")
	private WebElement noRadial;
	@FindBy(id="q2a")
	private WebElement cc1Radial;
	@FindBy(id="q2b")
	private WebElement cc2Radial;
	@FindBy(id="q2c")
	private WebElement debitRadial;
	@FindBy(name="checkingOrSavings") //This field has the same ID as the one above
	private WebElement checkingOrSavingsRadial;
	@FindBy(id="q3a")
	private WebElement highSchoolRadial;
	@FindBy(id="q3b")
	private WebElement technicalRadial;
	@FindBy(id="q3c")
	private WebElement collegePartialRadial;
	@FindBy(id="q3d")
	private WebElement collegeRadial;
	@FindBy(id="q3e")
	private WebElement masterRadial;
	@FindBy(id="sendInfoButton")
	private WebElement sendInfoButton;
	
	public ProductAdvisorQuestionnairePage VerifyScreen() {
			
		Assert.isTrue(textContainer.getText().equals("Thank you for requesting information"));
		
		return this;
	}
	
	@FindBy(xpath="//div[@class='success_container squestions_container']/h2")
	private WebElement textContainer;
	
	public SuccessfulRegistrationPage AnswerWith(String yesOrNo, String cc1, String cc2, String debit, String check,
			String studies) {
		
		Assert.isTrue(textContainer.getText().equals("Thank you for requesting information"));
		
		if(yesOrNo.contains("Yes"))
			yesRadial.click();
		
		else
			noRadial.click();
		
		
		if(cc1.length() > 1)
			cc1Radial.click();
		if(cc2.length() > 1)
			cc2Radial.click();
		if(debit.length() > 1)
			debitRadial.click();
		if(check.length() > 1)
			checkingOrSavingsRadial.click(); 
		
		
		if(studies.contains("High School"))
			highSchoolRadial.click();
		if(studies.contains("Technical"))
			technicalRadial.click();
		if(studies.matches("College Partial"))
			collegePartialRadial.click();
		if(studies.matches("College"))
			collegeRadial.click();
		if(studies.contains("Master"))
			masterRadial.click();
	
		
		sendInfoButton.click();
		
		return new SuccessfulRegistrationPage(driver);
	}
	
}
