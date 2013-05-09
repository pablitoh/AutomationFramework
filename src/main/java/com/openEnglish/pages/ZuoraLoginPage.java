package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ZuoraLoginPage {

	protected final WebDriver driver;
	
	public ZuoraLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	public ZuoraHomePage Login(String userName, String password) {
		driver.switchTo().frame("newlogin");
		
		driver.findElement(By.id("id_username")).clear();
	    driver.findElement(By.id("id_username")).sendKeys(userName);
	    driver.findElement(By.id("id_password")).clear();
	    driver.findElement(By.id("id_password")).sendKeys(password);
	    driver.findElement(By.id("login_button")).click();		
		
		return new ZuoraHomePage(driver);
	}
	
}
