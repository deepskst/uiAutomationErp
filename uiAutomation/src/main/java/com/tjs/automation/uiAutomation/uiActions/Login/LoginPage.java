package com.tjs.automation.uiAutomation.uiActions.Login;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tjs.automation.uiAutomation.uiAction.Navigation_CommonMenus.Navigation_CommonMenus;

public class LoginPage extends Navigation_CommonMenus {

	//public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LoginPage.class.getName());
	public static final Logger log = Logger.getLogger(LoginPage.class.getName());
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='login_email']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//input[@id='login_password']")
	WebElement password;
	
	@FindBy(xpath = "//div[@id='page-login']//button[contains(text(), 'Sign in')]")
	WebElement signIn;
	
	@FindBy(xpath = "//div[@id='page-login']//span[contains(text(), 'Invalid Login. Try again')]")
	WebElement failedLogin;
	
	public LoginPage(WebDriver driver) {
		
		//this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login(String email, String passwordStr) {
		
		// user login
		emailAddress.sendKeys(email);
		log.info("Clicked on email : " + emailAddress.toString());
		password.sendKeys(passwordStr);
		log.info("Clicked on password : " + password.toString());
		signIn.click();
		log.info("Clicked on sign in : " + signIn.getText());
	}
	
	public String invalidLogin() {
		log.info("Error message is : " + failedLogin.getText());
		return failedLogin.getText();
	}
}
