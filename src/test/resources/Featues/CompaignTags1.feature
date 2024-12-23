Feature: campaign feature

@sanity
Scenario: Create Campaign
Given user is at Campaign page
When user click on create Campaign
And user enter info 
Then status of Campaign should get draft

@regression
Scenario: Scheduling Campaign
Given user is at Campaign page
When user click on edit Campaign
And enter the date and time 
Then status of Campaign should get scheduled  

@functional
Scenario: send Campaign
Given user is at Campaign page
When user click on active btn
Then status of Campaign should get sent