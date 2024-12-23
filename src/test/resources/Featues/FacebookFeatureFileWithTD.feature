Feature: login to facebook with Test data

Scenario: login with Test Data

Given user is on login page
When user enter UN as "abc"
And user enter PWD as "xyz"
And user enter pin 1234
And user clicks on login btn
Then Home page should display