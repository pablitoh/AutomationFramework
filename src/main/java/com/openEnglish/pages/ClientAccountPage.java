package com.openEnglish.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientAccountPage {

	protected final WebDriver driver;
	
	public ClientAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	@FindBy(xpath="//div[@class='listRelatedObject opportunityBlock']" +
				"/div/div[@class='pbBody']/table/tbody/tr/th[@scope='row']/a")
	private WebElement opportunity;	
	
	public OpportunityPage GoToOpportunity() {
		
		opportunity.click();
		
		return new OpportunityPage(driver);
	}
	
	
	
	
}
