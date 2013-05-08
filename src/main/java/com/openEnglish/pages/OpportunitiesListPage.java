package com.openEnglish.pages;

import org.openqa.selenium.WebDriver;

public class OpportunitiesListPage {
	
	protected final WebDriver driver;
	
	public OpportunitiesListPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	public OpportunityPage GoToOpportunity() {
		
		//logica de buscar en la lista
		
		return new OpportunityPage(driver);
		
	}
	

}
