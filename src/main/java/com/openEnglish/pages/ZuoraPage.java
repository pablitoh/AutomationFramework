package com.openEnglish.pages;
import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ZuoraPage {
	
	
	private WebDriver driver;

	public ZuoraPage(WebDriver driver)
	{
		this.driver = driver; 	
	}

	
	public ZuoraPage typenames()
	{
		driver.switchTo().frame("newlogin");
	    
		driver.findElement(By.id("id_username")).sendKeys("Pablo");
		

		return new ZuoraPage(driver);
	}
	
}
