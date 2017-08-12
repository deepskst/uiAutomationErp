package com.tjs.automation.uiAutomation.login;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.tjs.automation.uiAutomation.testBase.TestBase;

public class TC002_VerifyLoginWithValidCredentials extends TestBase {

	@BeforeTest
	public void setup() throws IOException {
		initialize();
	}
	
	@Test
	public void loginWithValidCredentials() {
		
	}
	
	@AfterTest
	public void cleanUp() {
		
	}
}
