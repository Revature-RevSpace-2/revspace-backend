Feature: A user can post follow another user

Background: A User is on the login page
		Given The User is logged in on the login page
		When The User selects ther Login page
		And The User inputs "nickmontyando@gmail.com" into the username field
		And The User Owner inputs "myPass" into the password field
		And The User Owner clicks login
		Then The User is directed to the homepage

Scenario: User can only view a post for users they follow
    Given The user is successfully logged in
    When The homepage loads
    Then The user can only view posts from users they follow
    
