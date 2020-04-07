Feature: Testing login functionality on adactin application
Scenario: user checking the login function using valid username and valid password
Given user launch the application
When user enter the valid username in username field
And user enter the valid password in password field
And user click on login button
Then user confirm it navigates to the homepage