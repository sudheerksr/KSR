package com.lps.functinal.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DealsStepDefinition {/*
	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void User_is_already_on_Login_Page() {
		System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.freecrm.com/");
	}

	@SuppressWarnings("deprecation")
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		junit.framework.Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", loginBtn);
	}

	@SuppressWarnings("deprecation")
	@Then("^user is on home page$")
	public void user_is_on_home_page() throws InterruptedException {
		Thread.sleep(7000);
		String title = driver.getTitle();
		junit.framework.Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException {
		driver.switchTo().frame("mainpanel");
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
	}
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealsdata) throws Throwable {
		
		List<List<String>> dealValues =  dealsdata.raw();
		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));	   
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

*/}
