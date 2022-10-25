Feature: Background
Background: Background test
Given I am running background test

Scenario: Verify login
Given Launch the browser and navigate to application
When I enter username and password
And I click login
And I close the browser

Scenario: Add to cart
Given Launch the browser and navigate to application
When I enter username and password
And I click login
When I select add to cart
When I click cart
And I verify items added to cart
And I close the browser