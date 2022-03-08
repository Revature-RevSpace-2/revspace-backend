package com.revature.revspace.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NotificationFeedPage {
	
//	@FindBy (xpath="//p")
//	private WebElement comment;
//	// /html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[1]/div[2]
//	
//	@FindBy (xpath="//p")
//	private WebElement userReceive;
//	// /html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[1]/div[1]/div/div/span[1]/p
//	
	@FindBy (xpath="//span[@class='postButton']")
	private WebElement postButtonLike;
	// /html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[1]/div[3]/span[1]
	
	@FindBy (xpath="//small[@class='comment-text")
	private WebElement comment;
	// /html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[1]/div[4]/div[2]/div[1]/div/small

	@FindBy (xpath="//span[@id='submitBtn42']")
	private WebElement postButtonComment;
	// /html/body/app-root/body/app-post-feed/app-populate-feed/div[1]/div/div/div/div[2]/div[3]/span[2]
	
		

	public NotificationFeedPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void likeNotification() {
		this.postButtonLike.click();
	}
	
	
	public void commentNotification(String comment) {
		this.comment.clear();
		this.comment.sendKeys(comment);
		this.postButtonComment.click();

	}
}
