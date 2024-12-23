Feature: Scenario outline with background keyword

Background:
Given user is on login page
When user enter mobileNumber as 9999
And  user click on login BTN



Scenario Outline: Create user for diffrent set of data

When user enter FN "<FN>"
And user enter LN "<LN>"
And user click on create user btn
Then  user should be created

Examples:
| FN | LN |
|abc1 | xyz1 | 
|abc2 | xyz2 | 


Scenario Outline: delete multiple user

When user enter FN "<FN>"
And user click on delete user btn
Then  user should be deleted

Examples:
| FN | 
|abc1 | 
|abc2 | 

