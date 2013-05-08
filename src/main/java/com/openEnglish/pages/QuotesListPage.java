package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuotesListPage {
	
	protected final WebDriver driver;
	
	public QuotesListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public QuoteDetailsPage GoToQuoteDetails(String firstName, String lastName) {
		
		driver.findElement(By.xpath(String.format("//div[@class='hotListElement']/div/div[@class='pbBody']" +
				"/table[@class='list']/tbody/tr/th[@scope='row']/a[.='%s %s"+"-"+"']", firstName, lastName))).click();
		
		return new QuoteDetailsPage(driver);
	}
	
	

}
