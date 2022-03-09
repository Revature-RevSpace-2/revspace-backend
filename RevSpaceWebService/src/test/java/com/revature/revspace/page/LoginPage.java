package com.revature.revspace.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath= "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void login(String email, String password) {
		System.out.println(email);
		this.email.clear();
		this.password.clear();
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.loginButton.click();
	}
	
	
}
