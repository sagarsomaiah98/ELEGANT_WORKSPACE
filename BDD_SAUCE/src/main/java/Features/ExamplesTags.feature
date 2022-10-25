Feature: Login Functionality

@Reg
Scenario: Verify login
Given Launch the browser and navigate to application
When I enter username and password
And I click login
And I close the browser

@Sanity
Scenario: Add to cart
Given Launch the browser and navigate to application
When I enter username and password
And I click login
When I select add to cart
When I click cart
And I verify items added to cart
And I close the browser
