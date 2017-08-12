package com.tjs.automation.uiAutomation.testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static final Logger log = Logger.getLogger(TestBase.class.getName());
	public WebDriver driver;
	Properties prop;
	File file;
	FileReader fileRdr;
	String fileLocation = "src\\main\\java\\com\\tjs\\automation\\uiAutomation\\config\\config.properties";
	
	public void initialize() throws IOException {
		
		loadPropertiesFile();
		selectBrowser(prop.getProperty("browser"));
		String log4jConfPath = "log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
	}
	
	public void selectBrowser(String browser) {
		
		log.info("selecting browser : " + browser);
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(prop.getProperty("loginUrl"));
		}
	}
	
	public void loadPropertiesFile() throws IOException {
		
		log.info("Loading properties file");
		prop = new Properties();
		file = new File(System.getProperty("user.dir") + System.getProperty("file.separator") + fileLocation);
		fileRdr = new FileReader(file);
		prop.load(fileRdr);
		
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
