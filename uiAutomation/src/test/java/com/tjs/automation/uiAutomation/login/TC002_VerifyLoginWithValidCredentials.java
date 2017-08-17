package com.tjs.automation.uiAutomation.login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tjs.automation.uiAutomation.testBase.TestBase;
import com.tjs.automation.uiAutomation.uiActions.Login.DeskPageAfterLogin;
import com.tjs.automation.uiAutomation.uiActions.Login.LoginPage;

public class TC002_VerifyLoginWithValidCredentials extends TestBase {

	@BeforeTest
	public void setup() throws IOException {
		initialize();
	}
	
	@Test
	public void loginWithValidCredentials() {
		log.info("*****starting test : verifyLoginWithValidCredentials" );
		LoginPage login = new LoginPage(driver);
		login.login("deeps.kmurthy@gmail.com", "password");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*Assert.assertEquals(login.invalidLogin(), "Invalid Login. Try again.");
		log.info("*****Finished test : verifyLoginWithInvalidCredentials" );*/
		DeskPageAfterLogin afterLogin = new DeskPageAfterLogin(driver);
		afterLogin.verifyUsernameButton();
	}
	
	@AfterTest
	public void cleanUp() {
		driver.close();
	}
}
