package com.openEnglish.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

public class CountryStrategyArgentina implements CountryStrategy {
		
		private WebDriver driver;
	
		public CountryStrategyArgentina(WebDriver driver) {
			
			this.driver = driver;
			PageFactory.initElements(this.driver, this);
		}
	
		@FindBy(id="country")
		private WebElement countrySelect;
		
		public boolean execute(String firstName, String lastName, String email,
				String state, String city, String telType, String telCode, String tel1, String tel2,
				String media, String age) throws InterruptedException {
			
			Select selectCountry = new Select(countrySelect);
			selectCountry.selectByVisibleText("Argentina");
			
			(new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.textToBePresentInElement(By.id("state"), state));
			
			Select selectState = new Select(driver.findElement(By.id("state")));
			selectState.selectByVisibleText(state);
			
			(new WebDriverWait(driver, 30))
			  .until(ExpectedConditions.textToBePresentInElement(By.id("city"), city));
			
			Select selectCity = new Select(driver.findElement(By.id("city")));
			selectCity.selectByVisibleText(city);
			
			
			
			//Is there a better way to do this?
			if (telType.contains("Local")) {
				WebElement local = driver.findElement(By.id("phoneType1Local"));
				local.click();
			}
				
			else {
				
				WebElement cell = driver.findElement(By.id("phoneType1Cell"));
				cell.click();
			}
			
			driver.findElement(By.id("phoneNumber11")).sendKeys(tel1);
			driver.findElement(By.id("phoneNumber12")).sendKeys(tel2);
		
		return true;
		}
}

