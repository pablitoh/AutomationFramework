Feature: Trial Test Feature Zuora

@Firefox
Scenario: Testing Zuora Login on Firefox
Given The browser Chrome
Given Im on Zuora Page
Then Fill the username and Password with "sarasa" and "conde"

@IE
Scenario: Testing Zuora on Internet Explorer
Given The browser InternetExplorer
Given Im on Zuora Page
Then Fill the username and Password with "sarasa" and "conde"

@test
Scenario Outline: Testing new DataTable implementations
Given The browser Firefox
Given Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password

Examples:
	|First Name|Last Name|Email                           |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              |
	|"Test40102"   |"User123"|"automation+40102@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|