package com.lps.functinal.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lps.functinal.selenium.basetest.TestBase;
import com.lps.functinal.selenium.util.TestUtil;

public class CreateNewCompany extends TestBase {

	@FindBy(name = "company_name")
	WebElement company;

	@FindBy(name = "industry")
	WebElement industry;

	@FindBy(name = "annual_revenue")
	WebElement annualRevenue;

	@FindBy(id = "num_of_employees")
	WebElement employees;

	@FindBy(name = "status")
	WebElement status;

	@FindBy(name = "category")
	WebElement category;

	@FindBy(name = "priority")
	WebElement priority;

	@FindBy(name = "source")
	WebElement source;

	@FindBy(name = "identifier")
	WebElement identifier;

	@FindBy(name = "vat_number")
	WebElement vatNumber;

	@FindBy(name = "phone")
	WebElement phone;

	@FindBy(name = "fax")
	WebElement fax;

	@FindBy(name = "website")
	WebElement website;

	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "symbol")
	WebElement symbol;

	@FindBy(name = "client_lookup")
	WebElement parentCompany;

	@FindBy(name = "address_title")
	WebElement addressTitle;

	@FindBy(name = "type")
	WebElement type;

	@FindBy(name = "address")
	WebElement address;

	@FindBy(name = "city")
	WebElement city;

	@FindBy(name = "state")
	WebElement state;

	@FindBy(name = "postcode")
	WebElement postcode;

	@FindBy(name = "country")
	WebElement country;

	@FindBy(name = "tags")
	WebElement tags;

	@FindBy(name = "service")
	WebElement description;

	@FindBy(xpath = "//tr[8]/td/input[@value='Save']")
	WebElement save;
	
	public CreateNewCompany() {
		PageFactory.initElements(driver, this);
	}
	
	public String createNewCompany() throws InterruptedException{
		TestUtil.waitFor(company, 30);
		company.sendKeys("SRRINDUSTRIES");
		industry.sendKeys("Food Processing");
		annualRevenue.sendKeys("100000");
		employees.sendKeys("10");
		status.sendKeys("Active");
		category.sendKeys("Client");
		priority.sendKeys("High");
		source.sendKeys("Email");
		identifier.sendKeys("Food");
		vatNumber.sendKeys("GDK505209");
		phone.sendKeys("7893000464");
		fax.sendKeys("7893000464");
		website.sendKeys("www.freecrm.com");
		email.sendKeys("sudheerksrgdk@gmail.com");
		symbol.sendKeys("HYD");
		parentCompany.sendKeys("SRRINDUSTRIES");
		addressTitle.sendKeys("SRRINDUSTRIES");
		address.sendKeys("SRRINDUSTRIES");
		city.sendKeys("Hyderabad");
		state.sendKeys("Telangana");
		postcode.sendKeys("505209");
		country.sendKeys("INDIA");
		String companyName=company.getText();
		save.click();
		return companyName;		
	}
}
