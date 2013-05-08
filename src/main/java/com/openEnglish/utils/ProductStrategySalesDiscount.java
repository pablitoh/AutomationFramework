package com.openEnglish.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductStrategySalesDiscount implements ProductStrategy {
		
		protected final WebDriver driver;
		
		public ProductStrategySalesDiscount(WebDriver driver) {
			super();
			this.driver = driver;
		}
	
		public boolean execute() {
				
			driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:searchField")).sendKeys("Sales Discount 10%");
			driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:btnSearchProducts")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:quoting_form:" +
					"quoting_page_block:j_id28:product_zselect_table:j_id34:listtable_pageblock']/div/span/" +
					"table[@class='list']/tbody/tr/td/span/span/span/" +
					"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:" +
					"quoting_form:quoting_page_block:j_id28:rateplan_zselect_table:j_id54:listtable_pageblock']/div/span/" +
					"table[@class='list']/tbody/tr/td/span/span/span/" +
					"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']")).click();
			
			return true;
		}
}
