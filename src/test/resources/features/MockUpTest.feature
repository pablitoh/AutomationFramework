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

Examples:
	|First Name|Last Name|Email                           |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              |
	|"Test2"   |"User123"|"automation+123@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|