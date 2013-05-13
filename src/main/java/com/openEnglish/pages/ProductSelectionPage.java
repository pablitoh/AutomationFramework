package com.openEnglish.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductSelectionPage {

	protected final WebDriver driver;
	
	public ProductSelectionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;
	
	public QuoteDetailsPage SelectProduct() {
		
		driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:searchField")).sendKeys("Regular Course");
		driver.findElement(By.id("quoting_page:quoting_form:quoting_page_block:j_id28:btnSearchProducts")).click();
		
		
		
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:" +
				"quoting_form:quoting_page_block:j_id28:product_zselect_table:j_id34:listtable_pageblock']/div/span/" +
				"table[@class='list']/tbody/tr/td/span/span/span/" +
				"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']"));
		
		productList.get(0).click();
		
		
		
		List<WebElement> ratePlanList = driver.findElements(By.xpath("//div[@class='Custom5Block']/div[@id='quoting_page:" +
				"quoting_form:quoting_page_block:j_id28:rateplan_zselect_table:j_id54:listtable_pageblock']/div/span/" +
				"table[@class='list']/tbody/tr/td/span/span/span/" +
				"img[@src='/resource/1356042819000/zqu__radioBtnUnChk']"));
		
		ratePlanList.get(0).click();
		
		(new WebDriverWait(driver, 50))
		  .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Save']")));
		saveButton.click();
		
		return new QuoteDetailsPage(driver);
	}
	
	
}
