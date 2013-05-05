package com.openEnglish.testRunners;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;



import cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@Cucumber.Options(	features = "classpath:features", 
					format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
					glue="com.openEnglish.stepDefinitions",
					monochrome=true
					)

public class TestRunner {
	
}
