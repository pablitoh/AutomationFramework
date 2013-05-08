package com.openEnglish.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductStrategyRegularCourseFinanced implements ProductStrategy {
	
	protected final WebDriver driver;
	
	public ProductStrategyRegularCourseFinanced(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public boolean execute() {
		
		driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:searchField")).sendKeys("Regular Course");
		driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:btnSearchProducts")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:" +
				"quoting_form:quoting_page_block:j_id28:product_zselect_table:j_id34:listtable_pageblock']/div/span/" +
				"table[@class='list']/tbody/tr/td/span/span/span/" +
				"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']"));
		
		productList.get(0).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> ratePlanList = driver.findElements(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:" +
				"quoting_form:quoting_page_block:j_id28:rateplan_zselect_table:j_id54:listtable_pageblock']/div/span/" +
				"table[@class='list']/tbody/tr/td/span/span/span/" +
				"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']"));
		
		ratePlanList.get(0).click();
		
		return true;
		
		
	}

}