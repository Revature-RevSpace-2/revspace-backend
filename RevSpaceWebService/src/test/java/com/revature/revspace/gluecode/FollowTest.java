package com.revature.revspace.gluecode;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.revature.revspace.page.FollowPage;
import com.revature.revspace.page.UserLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FollowTest {
	
	private FollowPage fp;
	
	private UserLoginPage ulp;
	
	private String email;
	
	private String password;
	
	@Given("the User is on the login pagee")
	public void the_user_is_on_the_login_pagee() {
		this.ulp = new UserLoginPage(FollowerUtilityDriver.driver);
	    assertEquals("http://localhost:4200/", FollowerUtilityDriver.driver.getCurrentUrl());
	}

	@When("the User inputs {string} into the username field")
	public void the_user_inputs_into_the_username_field(String string) {
	    this.email = string;
	}

	@When("the User Owner inputs {string} into the password field")
	public void the_user_owner_inputs_into_the_password_field(String string) {
	    this.password = string;
	}

	@When("the User Owner clicks the login button")
	public void the_user_owner_clicks_the_login_button() {
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 5);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
	    ulp.loginFromUserLoginPage(this.email, this.password);
	}

	@Then("the User is directed to the postfeed pagee")
	public void the_user_is_directed_to_the_postfeed_pagee() {
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton1")));
	    assertEquals("http://localhost:4200/postfeed", FollowerUtilityDriver.driver.getCurrentUrl());
	}

	@Given("the user is successfully logged in")
	public void the_user_is_successfully_logged_in() {
	    
	}

	@Given("The homepage loads")
	public void the_homepage_loads() {
	    
	}

	@When("The user clicks on the first comment button")
	public void the_user_clicks_on_the_first_comment_button() {
	    WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 7);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class = 'postButton'][@data-bs-target='#commentsList12']")));
	    FollowerUtilityDriver.driver.findElement(By.xpath("//span[@class = 'postButton'][@data-bs-target='#commentsList12']")).click();
	}

	@When("The user clicks on davids profile name")
	public void the_user_clicks_on_davids_profile_name() {
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 7);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='name']")));
	    FollowerUtilityDriver.driver.findElement(By.xpath("//span[@class='name']")).click();
	}
	// [@text()='David Arnbrister'

	@When("The user clicks on the follow button")
	public void the_user_clicks_on_the_follow_button() {
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 7);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Follow']")));
	    FollowerUtilityDriver.driver.findElement(By.xpath("//span[text()='Follow']")).click();
	}

	@When("The user will be following another user")
	public void the_user_will_be_following_another_user() {
		// //span[text()='Follow']
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 7);
	    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class = 'followButton']")));
	    FollowerUtilityDriver.driver.findElement(By.xpath("//button[@class = 'followButton']")).click();
	    
	}

	@Then("The user will be redirected to the post feed page")
	public void the_user_will_be_redirected_to_the_post_feed_page() {
		WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton1")));
	    assertEquals("http://localhost:4200/postfeed", FollowerUtilityDriver.driver.getCurrentUrl());
	}
	
}
