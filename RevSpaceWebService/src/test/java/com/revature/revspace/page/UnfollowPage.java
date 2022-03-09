package com.revature.revspace.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UnfollowPage {

	@FindBy(xpath = "//span[@*, 'Comments']")
	private WebElement commentButton;

	@FindBy(xpath = "//span[text()='David Arnbrister']")
	private WebElement davidButton;

	@FindBy(xpath = "//span[text()='Unfollow']")
	private WebElement followButton;

	private WebDriver driver;

	public UnfollowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

}
