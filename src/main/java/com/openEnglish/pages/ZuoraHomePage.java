package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZuoraHomePage {

	protected final WebDriver driver;
	
	public ZuoraHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//a/strong[.='Customer Accounts']")
	private WebElement accountsPage;
	
	public ZuoraAccountsPage GoToAccountsPage() {
		
		accountsPage.click();
		
		return new ZuoraAccountsPage(driver);
	}
}
