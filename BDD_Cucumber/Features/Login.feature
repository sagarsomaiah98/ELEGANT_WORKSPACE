Feature: Login into application

Scenario: Login with valid credentials
Given Chrome browser is launched
When I enter the url
And I enter the username and password
And I click on login button
Then I am logged in successfully
