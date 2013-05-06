Feature: Test de Seba

@Firefox
Scenario: Probar Gilada
Given The browser is Firefox
Given Im on Zuora Page
Then Fill the username and Password with "sarasa" and "conde"

@IE
Scenario: Probar Gilada
Given The browser is InternetExplorer
Given Im on Zuora Page
Then Fill the username and Password with "sarasa" and "conde"
