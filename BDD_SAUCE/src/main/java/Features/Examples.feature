Feature: Login Functionality
@Smoke
Scenario Outline: Verify login
Given Launch the browser and navigate to application
When I enter username "<username>" and password "<password>"
And I click login
And I close the browser
Examples:
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
|locked_out_user|secret_sauce|
|performance_glitch_user|secret_sauce|