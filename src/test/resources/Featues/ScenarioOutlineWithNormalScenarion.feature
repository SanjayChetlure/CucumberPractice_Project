Feature: Login to app using scenario outline with Normal scenarion
Scenario Outline: login to app

Given user is on login page
When user enter username "<UN>"
When user enter password "<PWD>"
And user enter PIN <PIN>
And user click on login BTN
Then user should be logged in

Examples:
|UN | PWD | PIN |
|abc1| xyz1| 123|
|abc2| xyz2| 456|
|abc3| xyz3| 789|


Scenario: verify title of app

Given user enter url of app
Then title should display



