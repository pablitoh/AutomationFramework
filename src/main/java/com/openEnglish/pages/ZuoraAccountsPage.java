package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZuoraAccountsPage {

	protected final WebDriver driver;
	
	public ZuoraAccountsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="findKey_input")
	private WebElement findField;
	@FindBy(id="SearchButton")
	private WebElement searchButton;
	
	public IndividualAccountPage GoToAccount(String firstName, String lastName)  {
		
		findField.sendKeys(firstName + " " + " " + lastName);
		searchButton.click();

//WAIT
		
		driver.findElement(By.xpath(String.format("//td/a[contains(.,'%s')]", firstName))).click();
		
		return new IndividualAccountPage(driver);
	}
}