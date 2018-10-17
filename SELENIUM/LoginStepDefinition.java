package com.lps.functinal.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void User_already_on_Login_Page() {
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

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
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

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() throws Throwable {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();
	}

	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_contact_details_and_and(String firstname, String lastname, String position) {
		driver.findElement(By.id("first_name")).sendKeys(firstname);
		driver.findElement(By.id("surname")).sendKeys(lastname);
		driver.findElement(By.id("company_position")).sendKeys(position);
		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		driver.quit();
	}

}
