Feature: Overall functionallity of the zaful application 

Scenario: Zaful application login with valid credentials 
Given The zaful application launched
When The User accept the popup notification
And The user click the  user icon
And The user enter valid user name and password
And The user click the Sign In button
Then Validate the application wether login successful

Scenario:Select one MEN SETS product and overview and add in bag 

