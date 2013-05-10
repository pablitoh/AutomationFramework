package com.openEnglish.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsListPage {

	protected final WebDriver driver;
	
	public LeadsListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}

	@FindBy(className="reportTable")
	private WebElement reportTable;
	
	public ConvertLeadToAccountPage GoToLead(String firstName) {
		driver.findElement(By.xpath(String.format("//table[@class='reportTable tabularReportTable']" +
				"/tbody/tr[@class='even']/td/a[.='%s']", firstName))).click();
		
		return new ConvertLeadToAccountPage(driver);
	}
	
public LeadsListPage VerifyLeadIsPresent(String firstName, String lastName, String email) {
		
		boolean found = false;
		List<WebElement> list = reportTable.findElements(By.tagName("tr"));
		
		for(int i=1;i<list.size();i++)
		{
			if(!found)
			{
				List<WebElement> listCell = list.get(i).findElements(By.tagName("td"));
				
				if(listCell.size()>1)
				{
					System.out.println(listCell.get(0).getText());
					System.out.println(listCell.get(1).getText());
					System.out.println(listCell.get(4).getText());
					
					if(listCell.get(0).getText().equalsIgnoreCase(firstName) && listCell.get(1).getText().equalsIgnoreCase(lastName) && listCell.get(4).getText().equalsIgnoreCase(email))
					{
						listCell.get(0).findElement(By.tagName("a")).click();
						found = true;
					}
				}	
			}
		}
		return this;
}

}
