Feature:Free CRM Login Feature


#WithOut Examples Keyword
#Scenario:Free CRM Login Test Scenario
#
#Given User is already on Login Page
#When title of login page is Free CRM
#Then user enters "sudheerksr" and "7893000464"
#Then user clicks on login button
#Then user is on home page


#With Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When title of login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password |
	| sudheerksr | 7893000464 |
	| sudheerksr | 7893000464 |
	| sudheerksr | 7893000464 |
	