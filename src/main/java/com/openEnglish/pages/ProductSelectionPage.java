package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.openEnglish.utils.ProductStrategyFactory;
import com.openEnglish.utils.Products;

public class ProductSelectionPage {

	protected final WebDriver driver;
	
	public ProductSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	public QuoteDetailsPage SelectProduct(Products product) throws Exception {
		
		ProductStrategyFactory productStrategy = new ProductStrategyFactory();
		
		productStrategy.getStrategyFor(product);

		saveButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
