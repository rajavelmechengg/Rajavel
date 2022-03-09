Feature: Login Functionallity in Adactin Hotel App

Scenario: Adactin Hotel App Login without Username and Password 
	Given Adactin home page Launched s1 
	When The user click the login button s1 
	Then The user verifies that valid notification is displayed s1 
	
Scenario: Adactin Hotel App Login both Username and Password Invalid 
	When The user enters the invalid username s2 
	But The user enters the invalid password s2 
	And The user click the login button s2 
	Then User verifies that valid notification is displayed	s2 
	
Scenario: Adactin Hotel App Login with Invalid Username and Valid Password 
	When The user enters the invalid username s3 
	And The user enters the valid password s3 
	And The user click the login button s3 
	Then User verifies that valid notification is displayed s3 
	
Scenario: Adactin Hotel App Login with Valid Username and Invalid Password 
	When The user enters the valid username s4 
	But The user enters the invalid password s4 
	And The user click the login button s4 
	Then User verifies that valid notification is displayed s4 
	
Scenario: Adactin Hotel App Login with both Username and Password valid
	Given Adactin home page Launched(T4)
	When The user enters the valid username(T4)
	And The user enters the valid password(T4)
	And The user click the login button(T4)
	Then User verifies the login is successful(T4)
	
Scenario: User search the Hotel 
	Given The user entered search hotel page 
	When The user select the prefered location 
	And The user select the prefered hotel 
	And The user select the prefered room type
	And The user select the  number of rooms
	And The user enter the checkin date
	And The user enter the checkout date
	And The user select the number of audults per room
	And The user select the number of children
	And The user click the search button
	Then The user verifies current page is successfully move to next page
	
	
Scenario: User select the confirmed hotel
	Given The user entered confirmed hotel page
	When The user select the confirmed hotel
	And The user click the contiue button
	
Scenario: User submit the payments details 
	Given The user entered the payment details page
	When The user enter the  first name
	And The user enter the last name
	And The user enter the  billing addresss
	And The user enter the credit card number
	And The user select the credit card type
	And The user enter the expiry month
	And The user enter the expiry year
	And The user enter the ccv number
	And The user click the book now button
	Then The user verifies the hotel booking summary
	And The user click the logout button
	Then The user verifies the logout is successful

