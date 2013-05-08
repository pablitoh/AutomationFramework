package com.openEnglish.pages;

import com.openEnglish.pages.ClientAccountPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsListPage {

	protected final WebDriver driver;
	
	public AccountsListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public ClientAccountPage GoToClientAccount(String firstName, String lastName) {
		driver.findElement(By.xpath(String.format("//div/table[@class='list']" +
				"/tbody/tr/th[@scope='row']/a[.='%s, %s']", lastName, firstName))).click();
		
		return new ClientAccountPage(driver);
	}
	
	
	
}
