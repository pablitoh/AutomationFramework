Feature: Integration

@testflow
Scenario Outline: Testing flow
Given The browser Firefox
Given Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then Fill the Questionnaire with the <Yes or No>, <Credit Card>, <Credit Card 2>, <Debit Card>, <Checkings or Savings>, <Educational Level>
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password

Examples:
	|First Name	   |Last Name|Email                           |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              |Yes or No|Credit Card  |Credit Card 2|Debit Card  |Checkings or Savings|Educational Level|
	|"Test410"     |"User123"|"automation+410@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|"Yes"    |"Credit Card"|" "          |"Debit Card"|" "                 |"College"        |
