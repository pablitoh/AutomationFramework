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


@wipi
Scenario Outline: Testing new DataTable implementations
Given The browser Firefox

Given Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password
Then Verify the user <First Name>, <Last Name>, <Email> is present in Salesforce
Then I convert the Lead to Account
Then I go to the opportunity
Then I create the Zuora quote
Then I complete the radial page
Then I fill the Quote form
Then I select the regular product
Then I submit the contract with <Dni>, <ccType>, <ccNumber>, <ccDate>, <First Name>, <Last Name>, <cvv>
Then Pause

@wip
Scenario Outline: Testing new DataTable implementations
Given The browser Firefox

Given Im on Zuora Page
Then I login to Zuora using "fnc_test0@openenglish.com" as username and "Finance00" as password
Then I go to accounts page
Then I access the customers account using <First Name> and <Last Name>
Then I go to edit
Then I edit the account
Then I go to the subscription
Then I verify the subscription

Examples:

	|First Name|Last Name|Email                           |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              | Dni | ccType | ccNumber| ccDate | cvv|
	|"Test6631"   |"User1299"|"automation+6631@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"| "111111111" | "Visa" | "4012888888881881" | "10/15" | "123"| 

	
@test
Scenario: Testing
Given The browser Firefox
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password
