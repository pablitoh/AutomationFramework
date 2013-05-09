package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OpportunitiesListPage {
	
	protected final WebDriver driver;
	
	public OpportunitiesListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);

	}
	
	
	public OpportunityPage GoToOpportunity() {
		
		//logica de buscar en la lista
		
		return new OpportunityPage(driver);
		
	}
	

}
