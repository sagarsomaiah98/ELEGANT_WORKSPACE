Feature: Login Functionality with input details

@Reg
Scenario: Verify login
Given Launch the browser and navigate to application
When I enter username "performance_glitch_user" and password "secret_sauce"
And I click login
Then I am logged in successfully
And I close the browser
