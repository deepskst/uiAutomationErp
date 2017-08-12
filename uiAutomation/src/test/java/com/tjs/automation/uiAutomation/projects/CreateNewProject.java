package com.tjs.automation.uiAutomation.projects;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tjs.automation.uiAutomation.testBase.TestBase;
import com.tjs.automation.uiAutomation.uiActions.Login.DeskPageAfterLogin;
import com.tjs.automation.uiAutomation.uiActions.Login.LoginPage;

public class CreateNewProject extends TestBase {
	
	@BeforeTest
	public void setUp() throws IOException {
		initialize();
	}
	
	@Test
	public void newProject() {
		LoginPage login = new LoginPage(driver);
		login.login("deeps.kmurthy@gmail.com", "password");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		DeskPageAfterLogin desk = new DeskPageAfterLogin(driver);
		desk.clickExplore();
		
	}
	
	@AfterTest
	public void windUp() {
		//closeBrowser();
	}
}
