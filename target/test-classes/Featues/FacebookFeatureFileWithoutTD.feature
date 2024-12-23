
Feature: login to facebook app
Scenario: login with correct credentials

Given user is at login page
When user enter correct UN 
And user enter correct PWD
And user click on login btn
Then user should be at facebook home page