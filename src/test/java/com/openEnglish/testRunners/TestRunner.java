package com.openEnglish.testRunners;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;;

/* 
 * Pablo Conde - 6/5/2013 Added: 
 * Calling this class from Maven, you should use the -Dcucumber.options parameter to override the default configuration. 
 * i.e: mvn test -Dcucumber.options="--tags @Firefox,@IE" will run only the scenarios with the @Ie or @Firefox scenarios 
 * 
 * */
@RunWith(Cucumber.class)
@Cucumber.Options(	features = "classpath:features", 
					format = {"pretty", "html:target/cucumber-htmlreport","json-pretty:target/cucumber-report.json"},
					glue="com.openEnglish.stepDefinitions",
					monochrome=true,
					tags="@integration"
					)

public class TestRunner {
	/*
	 * Pablo Conde - 6/5/2013 Added: 
	 * Empty Test runner class needed for Junit.
	 */

}
