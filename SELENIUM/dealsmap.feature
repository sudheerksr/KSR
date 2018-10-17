Feature: Deal data creation

Scenario: Free CRM Create a new deal scenario
Given User is already on Login Page
When title of login page is Free CRM
Then user enters username and password
| username | password |
| sudheerksr | 7893000464 |

Then user clicks on login button
Then user is on home page
Then user moves to new deal page
Then user enters deal details
| title     | amount | probability | commission |
| test deal1 | 1000 | 50 | 10 |
| test deal2 | 2000 | 50 | 10 |
| test deal3 | 3000 | 50 | 10 |
| test deal4 | 4000 | 50 | 10 |

Then close the browser