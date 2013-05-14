package com.openEnglish.stepDefinitions;


import org.springframework.beans.factory.annotation.Autowired;

import com.openEnglish.pages.LeadCreationWebFormPage;
import com.openEnglish.pages.ProductAdvisorQuestionnairePage;
import com.openEnglish.utils.Countries;
import com.openEnglish.utils.SharedDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class WebSteps {
	
	@Autowired
	private SharedDriver webDriver;

	@Then("^Fill the Form with the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void fill_the_form_with_users(String firstName, String lastName, String email, Countries country, String state, String city, String telType, String areaCode, String tel1, String tel2, String media, String age) throws Exception
	{
		LeadCreationWebFormPage webform = new LeadCreationWebFormPage(webDriver.driver);
		webDriver.driver.get("http://stage.thinkglish.com/inicio.do");
		webform.FillArgentina(firstName, lastName, email, country, state, city, telType, areaCode, tel1, tel2, media, age);
		
		//ProductAdvisorQuestionnairePage questionnaire = new ProductAdvisorQuestionnairePage(webDriver.driver);
		//questionnaire.VerifyScreen();
		
	}
	
	@Then("^Fill the Questionnaire with the \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void fill_the_questionnaire(String yesOrNo, String cc1, String cc2, String debit, String check, String studies) {
		
		ProductAdvisorQuestionnairePage questionnaire = new ProductAdvisorQuestionnairePage(webDriver.driver);
		questionnaire.AnswerWith(yesOrNo, cc1, cc2, debit, check, studies);
	}
}

