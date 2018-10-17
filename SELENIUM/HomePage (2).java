package com.lps.functinal.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lps.functinal.selenium.basetest.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//a[@href='https://www.freecrm.com/index.cfm?logout=1']")
	WebElement logOff;
	
	@FindBy(xpath="//a[contains(text(),'Companies')]")
	WebElement Companies;
	
	@FindBy(xpath="//a[contains(text(),'New Company')]")
	WebElement NewCompany;
	
	@FindBy(xpath="//a[contains(text(),'Full Search Form')]")
	WebElement fullSearchForm;
	
	public HomePage() {
		PageFactory.initElements(driver, this);		
	}
	
	public void clickLogOff() {
		logOff.click();		
	}

	public void navigateToNewCompany() {
		Actions actions=new Actions(driver);
		actions.moveToElement(Companies).moveToElement(NewCompany).click().build().perform();
	}
	
	public void navigateToFullSearchForm() {
		Actions actions=new Actions(driver);
		actions.moveToElement(Companies).moveToElement(fullSearchForm).click().build().perform();
	}
	


}
