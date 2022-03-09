package com.revature.revspace.gluecode;

import com.revature.revspace.page.UserLoginPage;

import static org.junit.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginTest {

	public UserLoginPage ulp;
	
	public String email;
	
	public String password;
	
	@Given("The User is on the login page")
	public void the_user_is_on_the_login_page() {
	    this.ulp = new UserLoginPage(FollowerUtilityDriver.driver);
	    assertEquals("http://localhost:4200/", FollowerUtilityDriver.driver.getCurrentUrl());
	}

	@When("The User inputs their email {string}")
	public void the_user_inputs_their_email(String string) {
		this.email = string;
	}

	@When("The User inputs their password {string}")
	public void the_user_inputs_their_password(String string) {
	    this.password = string;
	}

	@When("The User clicks login")
	public void the_user_clicks_login() {
	    WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 5);
	    wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
	    ulp.loginFromUserLoginPage(this.email, this.password);
	}

	@Then("The User is directed to the postfeed page")
	public void the_user_is_directed_to_the_postfeed_page() {
	    WebDriverWait wait = new WebDriverWait(FollowerUtilityDriver.driver, 5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dropdownMenuButton1")));
	    assertEquals("http://localhost:4200/postfeed", FollowerUtilityDriver.driver.getCurrentUrl());
	}

}
