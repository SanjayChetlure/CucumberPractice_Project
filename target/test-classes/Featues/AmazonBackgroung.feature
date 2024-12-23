Feature: Amazone features

Background:
Given user is on Amzone login page
When user enter Username as "ABC"
And user enter password as "XYZ"
And user enter pin as 1234
And user click on login button


Scenario: login to Amazone App
Then Amazone app should be loged in.

Scenario: place order
When user search product
When user added product to Cart
When user paid amount
Then order confirmed msg should display

Scenario: Logout from Amazone
When  user click on logout Button
Then Amazone app should be loged out
 


