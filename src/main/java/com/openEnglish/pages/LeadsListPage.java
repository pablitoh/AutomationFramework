package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LeadsListPage {

	protected final WebDriver driver;
	
	public LeadsListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	
	public ConvertLeadToAccountPage GoToLead(String firstName) {
		driver.findElement(By.xpath(String.format("//table[@class='reportTable tabularReportTable']" +
				"/tbody/tr[@class='even']/td/a[.='%s']", firstName))).click();
		
		return new ConvertLeadToAccountPage(driver);
	}
	
	public LeadsListPage VerifyLeadIsPresent(String firstName) {
		
		driver.findElement(By.xpath(String.format("//table[@class='reportTable tabularReportTable']" +
				"/tbody/tr[@class='even']/td/a[.='%s']", firstName))).isDisplayed();
		
		return this;
	}

}
