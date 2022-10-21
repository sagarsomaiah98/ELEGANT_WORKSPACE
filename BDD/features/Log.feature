Feature: login
Scenario: login to application
Given launch chrome browser
When I navigate to url
And I enter username and password
And I click login
Then I am able to login