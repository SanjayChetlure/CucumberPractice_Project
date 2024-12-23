Feature: Home page functionality

@sanity
Scenario: validation of title of webpage
Given I am at home page
Then page title should have "Home Page" 

@functional
Scenario: validation of signIn link
Given I am at home page
Then I should see signIn link on page

@functional
Scenario: search product
Given I am at home page
When I search for text "Jacket"
Then I should navigate to result page