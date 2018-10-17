package com.lps.functinal.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lps.functinal.selenium.basetest.TestBase;

public class LoginPage extends TestBase {

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();		
	}
	
	public HomePage login(String userName,String Password) throws InterruptedException{
		username.sendKeys(userName);
		password.sendKeys(Password);
		Thread.sleep(5000);
		login.click();
		return new HomePage();		
	}
}
