package com.revature.revspace.gluecode;

import com.revature.revspace.page.UserLoginPage;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginTest {
	
	public UserLoginPage ulp;
	
	public String email;
	
	public String password;
	
	@Given("The User is on the Login page")
	public void the_user_is_on_the_login_page() {
		this.ulp = new UserLoginpage(FollowerUtilityDriver.driver);
		assertEquals("http://localhost:4200/", FollowerUtilityDriver.driver.getCurrentUrl());
	}

	@When("The User inputs their email {string}")
	public void the_user_inputs_their_email(String string) {
		this.email = string;
	}

	@When("The User inputs their {string}")
	public void the_user_inputs_their(String string) {
		this.password = string;
	}

	@When("The User clicks login")
	public void the_user_clicks_login() {

	}

	@Then("The User is directed to the postfeed page")
	public void the_user_is_directed_to_the_postfeed_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
