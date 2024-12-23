Feature: login to bank acc

Scenario: login with nominee info

Given user should be at bank acc login page
When user enter following data
|abc1|xyz1|111111|abc1@gmail.com|
|abc2|xyz2|222222|abc2@gmail.com|
|abc3|xyz2|333333|abc3@gmail.com|
And user click on submit btn
Then user get created