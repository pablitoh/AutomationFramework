package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.openEnglish.utils.ProductStrategy;
import com.openEnglish.utils.ProductStrategyFactory;

public class ProductSelectionPage {

	protected final WebDriver driver;
	
	public ProductSelectionPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	public QuoteDetailsPage SelectProduct(ProductStrategy product) {
		
		ProductStrategyFactory productStrategy = new ProductStrategyFactory();
		
		productStrategy.getStrategyFor(product);

		saveButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
