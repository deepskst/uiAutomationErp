package com.tjs.automation.uiAutomation.login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.tjs.automation.uiAutomation.testBase.TestBase;
import com.tjs.automation.uiAutomation.uiActions.Login.LoginPage;

public class TC001_VerifyLoginWithInvalidCredentials extends TestBase {

	//Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class);
	//WebDriver driver;
	/*public static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class);*/
	//
	public static final Logger log = Logger.getLogger(TC001_VerifyLoginWithInvalidCredentials.class.getName());
	
	@BeforeClass
	public void setUp() throws IOException {
		initialize();
	}
	
	@Test
	public void verifyLoginWithInvalidCredentials() {
		log.info("*****starting test : verifyLoginWithInvalidCredentials" );
		LoginPage login = new LoginPage(driver);
		login.login("dees.kmurthy@gmail.com", "password");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Assert.assertEquals(login.invalidLogin(), "Invalid Login. Try again.");
		log.info("*****Finished test : verifyLoginWithInvalidCredentials" );
	}
	
	@AfterClass
	public void endTest() {
		driver.close();
	}
}
