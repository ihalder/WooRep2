Feature: Validate entire Login Scenario

Background: 
Given open browser
|Chrome|
|Firefox|  //List of List
|Safari|
And navigate to facebook.com 

@Smoke
Scenario: As a user using valid credential should be logged in 
When user type valid user ID 
And user type valid password 
And user click login button
Then user should see their profile page 

@Smoke
Scenario: As a user using valid credential should be logged in 
When user type valid user ID And password 

|user ID|Password|
|user1|user1234|  //List of Map
|user2|user3456|

And user click login button
Then user should see their profile page 

@Regretion
Scenario Outline: As a user using invalid credential should not be see profile page
When user type invalid "<user ID>" in userID textBox
And user type invalid "<password>" in password textBox
And user click login button
Then user should not see their profile page 

Examples: 
|user ID|password|
|user1|User1234|
|user2|User2345|
|user3|User3456|




