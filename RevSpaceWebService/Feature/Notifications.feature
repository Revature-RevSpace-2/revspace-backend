 Feature:  Notifications are generated when users click like or follow another users comments or profile
 


				Background: A user is at the post feed page
								Given user on the post feed page  
								And another users comment is visible on the page
								Then the current user has the option to like or comment on the visible feed


				Scenario: The Current User Likes A Post 
								Given the current user selects like on the first visible post
								And the user clicks the like highlighted button
								Then the user owner of the post should receive a notification of the like
								
								
								
				Scenario: The Current User Comments On A Post 
								Given the current user selects comment on the first visible post
								And the user click the like highlighted comments button
								And the user types in "my test comment"
								And clicks the submit button
								And the new comment is posted to this comments thread  
								Then the user owner of the post should receive a notification of the comment
								
								
								
								
								