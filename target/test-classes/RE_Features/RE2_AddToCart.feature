Feature: Adding product

@sanity
Scenario: Selecting product type
Given I am at home page
When I click on Men 
Then I should redirect to section

@regression
Scenario: Adding product to cart 
Given I am at home page
When I Select product
Then Product page should display 
When I select size & colour
And click on add to cart 
Then I should See product added confirmation msg ad "shopping cart"