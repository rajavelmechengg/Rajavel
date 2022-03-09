Feature: Login Functionallity in Adactin Hotel 

Scenario Outline: User login the adactin hotel with multiple inputs
Given user Launch the application
When The user enters the username "<username>" and pass word "<password>"
And The user click the login button
Then User validate the login process

Examples:
|username|password|
|rajavel|ganesan|
|ganesan|rajavel|
|12345678|asdfghjk|
|asdfghj|12345678|
|RAJAVELGANESAN|raja9944532517|