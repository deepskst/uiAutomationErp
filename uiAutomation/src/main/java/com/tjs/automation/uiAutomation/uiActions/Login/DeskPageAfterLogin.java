package com.tjs.automation.uiAutomation.uiActions.Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskPageAfterLogin {
	
	@FindBy(xpath="//div[@id='icon-grid']//div[@title='Explore' and @class='app-icon']")
	WebElement ExploreButton;
	
	public DeskPageAfterLogin(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public void clickExplore() {
		ExploreButton.click();
	}
}
