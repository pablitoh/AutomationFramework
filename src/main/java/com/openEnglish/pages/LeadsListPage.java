package com.openEnglish.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsListPage {

	protected final WebDriver driver;
	
	public LeadsListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public ConvertLeadToAccountPage GoToLead(String firstName) {
		driver.findElement(By.xpath(String.format("//table[@class='reportTable tabularReportTable']" +
				"/tbody/tr[@class='even']/td/a[.='%s']", firstName))).click();
		
		return new ConvertLeadToAccountPage(driver);
	}

}
