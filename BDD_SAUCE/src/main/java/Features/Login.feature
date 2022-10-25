Feature: Login Functionality

@Reg
Scenario: Verify login
Given Launch the browser and navigate to application
When I enter username and password
And I click login
Then I am logged in successfully
And I close the browser

