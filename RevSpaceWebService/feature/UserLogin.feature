Feature: User Login Page

  Scenario: A User would like to login
    Given The User is on the Login page
	  When The User inputs their email "hdelange369@gmail.com"
	  And The User inputs their "password"
	  And The User clicks login
	  Then The User is directed to the postfeed page