package com.tjs.automation.uiAutomation.uiAction.Navigation_CommonMenus;

import org.openqa.selenium.By;
/*import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;*/

public class Navigation_CommonMenus {

	/*@FindBy(xpath="//div[@class='main-section']//span[contains(text(), 'tjsys')]")
	WebElement homeLink;
	
	@FindBy(xpath="//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Contact')]")
	WebElement contactLink;
	
	@FindBy(xpath="//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Blog')]")
	WebElement blogLink;
	
	@FindBy(xpath="//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Products')]")
	WebElement productsLink;
	
	@FindBy(xpath="//div[@class='navbar-header']//a[contains(text(), 'Login')]")
	WebElement login;
	*/
	
	public By homeLink 		= By.xpath("//div[@class='main-section']//span[contains(text(), 'tjsys')]");
	public By contactLink 	= By.xpath("//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Contact')]");
	public By blogLink 		= By.xpath("//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Blog')]");
	public By productsLink	= By.xpath("//div[@class='main-section']//div[@class='dropdown']//a[contains(text(), 'Products')]");
	public By loginLink		= By.xpath("//div[@class='navbar-header']//a[contains(text(), 'Login')]");
	
	
}
