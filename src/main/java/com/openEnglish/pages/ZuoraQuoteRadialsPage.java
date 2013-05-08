package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ZuoraQuoteRadialsPage {

	protected final WebDriver driver;
	
	public ZuoraQuoteRadialsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(id="j_id0:j_id1:j_id28:accountsection:accTypeRadio:0")
	private WebElement radialButton;
	@FindBy(name="j_id0:j_id1:j_id28:j_id45:j_id46")
	private WebElement saveButton;
	
	
	public ZuoraQuoteCreationFormPage GoToCreateZuoraQuote() {
		
		radialButton.click();
		//wait
		saveButton.click();
		
		return new ZuoraQuoteCreationFormPage(driver);
	}

	
}
