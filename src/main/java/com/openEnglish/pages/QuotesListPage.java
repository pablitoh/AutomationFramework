package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class QuotesListPage {
	
	protected final WebDriver driver;
	
	public QuotesListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	public QuoteDetailsPage GoToQuoteDetails(String firstName, String lastName) {
		
		driver.findElement(By.xpath(String.format("//div[@class='hotListElement']/div/div[@class='pbBody']" +
				"/table[@class='list']/tbody/tr/th[@scope='row']/a[.='%s %s"+"-"+"']", firstName, lastName))).click();
		
		return new QuoteDetailsPage(driver);
	}
	
	

}
