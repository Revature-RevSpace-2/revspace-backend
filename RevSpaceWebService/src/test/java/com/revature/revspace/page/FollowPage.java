

package com.revature.revspace.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowPage {
	
	@FindBy(xpath = "//span[@class = 'postButton'][@data-bs-target='#commentsList12']")
	private WebElement commentButton;
	
	// [@style='cursor: pointer;'][@text()='David Arnbrister']
	@FindBy(xpath = "//span[@class='name']")
	private WebElement davidButton;
	
	@FindBy(xpath = "//button[@class = 'followButton']")
	private WebElement followButton;
		
	private WebDriver driver;
	
	public FollowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	
	

}
