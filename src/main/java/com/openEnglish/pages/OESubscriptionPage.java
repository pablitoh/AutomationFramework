package com.openEnglish.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class OESubscriptionPage {

	protected final WebDriver driver;
	
	public OESubscriptionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	
	public OESubscriptionPage VerifyFirstPayment() {
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='z-table-block z-basic']/table/tbody/tr"));
		WebElement td;
		WebElement th;
		boolean found = false;
		int i = 0;
		
		while(i < 30 || found == false) {
			for (WebElement tr : list) {
				th = tr.findElement(By.xpath("//th/h5"));
				td = tr.findElement(By.xpath("//td/span"));
				
				if(th.getText().contains("OE_First_Payment_Status:") && td.getText().contains("Processed")) {
					found = true;
				}
				
				i++;
			}
			
			driver.navigate().refresh();
		}
				
//		String verify = driver.findElement(By.xpath("//div[@class='z-table-block z-basic']/table/tbody" +
//				"/tr/td/span[contains(.,'Processed')]")).getText();
		
//		for(int i = 0 ; i < 30 ; i++) {
//			if(verify.contains("Processed")) {
//				System.out.println("ANDA");
//			}
//			else {
////				String asd = driver.getCurrentUrl();
////				driver.get(asd);
//				System.out.println(verify);
//				driver.navigate().refresh();
//			}
//		}
		
		return this;
	}
	
}
