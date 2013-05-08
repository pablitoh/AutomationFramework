package com.openEnglish.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LeadsHomePage {
	
	protected final WebDriver driver;
	
	public LeadsHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	@FindBy(xpath="//span[@class='dateFormat']/a")
	private List<WebElement> setDateLink;
	@FindBy(id="scope")
	private WebElement scopeSelect;
	@FindBy(xpath="//input[@value='Run Report']")
	private WebElement runReportButton;
	
	public LeadsListPage GoToLeadsList() {
		List<WebElement> setDate = setDateLink;
		
		for (WebElement date : setDate) {
			
			date.click();
			//wait
		}
		
		Select selectView = new Select(scopeSelect);
		selectView.selectByVisibleText("All leads");

		runReportButton.click();

		return new LeadsListPage(driver);
	}
	
}