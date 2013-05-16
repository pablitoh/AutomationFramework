Feature: Integration


@integration
Scenario Outline: Testing flow
Given The browser Firefox
Then Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then Fill the Questionnaire with the <YesOrNo>, <cc1>, <cc2>, <debit>, <check>, <studies>
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password
Then I Verify the user <First Name>, <Last Name>, <Email> is present in Salesforce
Then I convert the Lead to Account with <First Name>, <Last Name>
Then I go to the opportunity
Then I create the Zuora quote
Then I select the regular product
Then I submit the contract with <Dni>, <ccType>, <ccNumber>, <ccDate>, <First Name>, <Last Name>, <cvv>
Then I login to Zuora using "fnc_test0@openenglish.com" as username and "Finance00" as password
Then I go to accounts page
Then I access the customers account using <First Name> and <Last Name>
Then I edit the account
Then I verify the subscription

Examples:

	|First Name	 |Last Name   |Email                              |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              | Dni         | ccType | ccNumber           | ccDate  | cvv  |YesOrNo|cc1  |cc2|debit  |check|studies |
	|"Test76799"|"User55519"|"automation+76799@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"| "111111111" | "Visa" | "4012888888881881" | "10/15" | "123"|"Yes"  |"cc1"|" "|"debit"|" "  |"Master"|  


@integrationfail
Scenario Outline: Demo Fail
Given The browser Firefox
Then Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then Fill the Questionnaire with the <YesOrNo>, <cc1>, <cc2>, <debit>, <check>, <studies>
Then Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>
Then Fill the Questionnaire with the <YesOrNo>, <cc1>, <cc2>, <debit>, <check>, <studies>

Examples:

	|First Name|Last Name  |Email                              |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age              |YesOrNo|cc1  |cc2|debit  |check|studies |
	|"Test33112"|"User33112"|"automation+33112@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|"Yes"  |"cc1"|" "|"debit"|" "  |"Master"|  


@integrationfail2
Scenario: Demo Fail 2
Given The browser Firefox
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password
Then I create the Zuora quote


@integrationmultibrowser
Scenario Outline: Demo Multi Browser
Given The browser <Browser>
Then I login to Salesforce using "fnc@openenglish.com.oetest0" as username and "finance0" as password
Then Pause

Examples:
	
	|Browser|
	|Firefox|
	|Chrome|
	|InternetExplorer|
	|HtmlUnitDriver|
	
	
@integrationcreateleads
Scenario Outline: Create leads fast
Given The browser HtmlUnitDriver
Then Fill the Form with the <First Name>, <Last Name>, <Email>, <Country>, <State>, <City>, <Tel Type>, <Area Code>, <Tel1>, <Tel2>, <Media>, <Age>

Examples:

	|First Name|Last Name  |Email                              |Country    |State         |City  |Tel Type|Area Code|Tel1  |Tel2  |Media  |Age        |
	|"Test33113"|"User33113"|"automation+33113@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|
	|"Test33114"|"User33114"|"automation+33114@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|
	|"Test33115"|"User33115"|"automation+33115@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|
	|"Test33116"|"User33116"|"automation+33116@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|
	|"Test33117"|"User33117"|"automation+33117@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|
	|"Test33118"|"User33118"|"automation+33118@openenglish.com"|"Argentina"|"Buenos Aires"|"Amba"|"Mobile"|"null"   |"1234"|"5678"|"Radio"|"19-25 years old"|

