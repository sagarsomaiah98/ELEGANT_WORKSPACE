Feature: Login defined credentials
Scenario Outline: Verify login
Given Launch the browser and navigate to application
When I enter "standard_user" and "secret_sauce"
And I click login
And I close the browser