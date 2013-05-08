package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZuoraHomePage {

	protected final WebDriver driver;
	
	public ZuoraHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath="//a/strong[.='Customer Accounts']")
	private WebElement accountsPage;
	
	public ZuoraAccountsPage GoToAccountsPage() {
		
		accountsPage.click();
		
		return new ZuoraAccountsPage(driver);
	}
}
