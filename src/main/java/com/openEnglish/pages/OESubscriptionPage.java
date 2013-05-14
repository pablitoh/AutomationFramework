package com.openEnglish.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OESubscriptionPage {

	protected final WebDriver driver;
	
	public OESubscriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(className="z-table-block")
	private WebElement tableInfo;
	
	public OESubscriptionPage VerifyFirstPayment() {
		
		boolean found = false;
		int MAXRETRY = 10;
		int i=0;
		while(!found && i<MAXRETRY)
		{
			List<WebElement> list = tableInfo.findElements(By.tagName("tr"));
			
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
				for (WebElement tr : list) {
					try
					{
						String thText = tr.findElement(By.tagName("th")).getText();
						String tdText = tr.findElement(By.tagName("td")).getText();
						
						
						if(thText.equals("OE_First_Payment_Status:") && tdText.equals("Processed"))
						{
							found = true;
						}
					}
					catch(NoSuchElementException e)
					{
						
					}
				}
				if(!found)
				{
					i++;
					driver.navigate().refresh();
				}
				
		}
		if(!found)
		{
			Assert.fail("Status was not set to Proccessed after " + MAXRETRY + " retries");
		}

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	
				
		
		return this;
	}
	
}
