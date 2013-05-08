package com.openEnglish.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CountryStrategyVenezuela implements CountryStrategy {
		
		protected final WebDriver driver;
	
		public CountryStrategyVenezuela(WebDriver driver) {
		super();
		this.driver = driver;
		}
		
		@FindBy(id="country")
		private WebElement countrySelect;

		public boolean execute(String firstName, String lastName, String email, String country,
				String state, String city, String telType, String telCode, String tel1, String tel2,
				String media, String age) {
			
			Select selectCountry = new Select(countrySelect);
			selectCountry.selectByVisibleText(country);
			
			driver.findElement(By.id("areaCode1")).sendKeys(telCode);
			driver.findElement(By.id("phoneNumber11")).sendKeys(tel1);
			driver.findElement(By.id("phoneNumber12")).sendKeys(tel2);
		
		return true;
		}
}
