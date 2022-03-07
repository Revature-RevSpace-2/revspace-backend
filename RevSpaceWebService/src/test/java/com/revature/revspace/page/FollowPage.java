

package com.revature.revspace.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FollowPage {
	
	@FindBy(xpath = "//p[text()='Rabin Kumar']")
	private WebElement rabin;
	
	@FindBy(xpath = "//span[text()='Follow']")
	private WebElement follow;
		
	private WebDriver driver;
	
	public FollowPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

}
