package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZuoraAccountsPage {

	protected final WebDriver driver;
	
	public ZuoraAccountsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(id="findKey_input")
	private WebElement findField;
	@FindBy(id="SearchButton")
	private WebElement searchButton;
	
	public IndividualAccountPage GoToAccount(String firstName, String lastName)  {
		
		findField.sendKeys(firstName + " " + " " + lastName);
		searchButton.click();

		(new WebDriverWait(driver, 30))
		  .until(ExpectedConditions.textToBePresentInElement(By.xpath("//td/a"), firstName));
		
		driver.findElement(By.xpath(String.format("//td/a[contains(.,'%s')]", firstName))).click();
		
		return new IndividualAccountPage(driver);
	}
}