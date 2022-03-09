Feature: User Login Pagee

Scenario: A User would like to login
		Given The User is on the login page
		When The User inputs their email "hdelange369@gmail.com" 
		And The User inputs their password "password" 
		And The User clicks login
		Then The User is directed to the postfeed page
