 package com.revature.revspace.gluecode;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.revspace.page.LoginPage;
import com.revature.revspace.page.NotificationFeedPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class NotificationsTest {
	
	private LoginPage lp;
	private String email;
	private String password;
	
	private NotificationFeedPage nfp;
	private String comment;
	
	
	@Given("user on the post feed page")
	public void user_on_the_post_feed_page() {
		lp = new LoginPage(RevspaceUtilityDriver.driver);
		this.nfp = new NotificationFeedPage(RevspaceUtilityDriver.driver);
		WebDriverWait wait = new WebDriverWait(RevspaceUtilityDriver.driver, 5);
		wait.until(ExpectedConditions.urlMatches("/"));
		this.email="test4250580@gmail.com";
		this.password="Test123$";
		this.lp.login(this.email, this.password);
		
		
	}

	@Given("another users comment is visible on the page")
	public void another_users_comment_is_visible_on_the_page() {
		WebDriverWait wait = new WebDriverWait(RevspaceUtilityDriver.driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Post Feed']")));
		assertEquals("Post Feed", RevspaceUtilityDriver.driver.findElement(By.xpath("//a[text()='Post Feed']")).getText());
	}
	@Then("the current user has the option to like or comment on the visible feed")
	public void the_current_user_has_the_option_to_like_or_comment_on_the_visible_feed() {
	    
	}
	@Given("the current user selects like on the first visible post")
	public void the_current_user_selects_like_on_the_first_visible_post() {
	    //nfp.likeNotification();
	}
	@Given("the user clicks the like highlighted button")
	public void the_user_clicks_the_like_highlighted_button() {
	    
	}
	@Then("the user owner of the post should receive a notification of the like")
	public void the_user_owner_of_the_post_should_receive_a_notification_of_the_like() {
	   
	}
	
	
	@Given("the current user selects comment on the first visible post")
	public void the_current_user_selects_comment_on_the_first_visible_post() {
		 assertEquals("http://localhost:4200/postfeed", RevspaceUtilityDriver.driver.getCurrentUrl()); 
		 WebDriverWait wait = new WebDriverWait(RevspaceUtilityDriver.driver, 5);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[1]/div[4]/div[2]/div[1]/div/small")));
	}
	@Given("the user click the like highlighted comments button")
	public void the_user_click_the_like_highlighted_comments_button() {
	    
	}
	@Given("the user types in {string}")
	public void the_user_types_in(String string) {
	    this.comment = string;
	}
	@Given("clicks the submit button")
	public void clicks_the_submit_button() {
	   //this.nfp.commentNotification(this.comment);
	}
	@Given("the new comment is posted to this comments thread")
	public void the_new_comment_is_posted_to_this_comments_thread() {
	    
	}
	@Then("the user owner of the post should receive a notification of the comment")
	public void the_user_owner_of_the_post_should_receive_a_notification_of_the_comment() {
	    
	}





}
