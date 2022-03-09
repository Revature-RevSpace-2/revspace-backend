Feature: A user can follow another user

Background: A User is on the login page
		Given the User is on the login pagee
		When the User inputs "nickmontyando@gmail.com" into the username field
		And the User Owner inputs "myPass" into the password field
		And the User Owner clicks the login button
		Then the User is directed to the postfeed pagee

Scenario: Follow a User
    Given the user is successfully logged in
    And The homepage loads
    When The user clicks on the first comment button
    And The user clicks on davids profile name
    And The user clicks on the follow button
    And The user will be following another user
    Then The user will be redirected to the post feed page