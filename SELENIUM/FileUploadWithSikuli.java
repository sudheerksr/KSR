package com.extentreports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;
	 
	public class FileUploadWithSikuli{
	    @Test
	    public void fileUpload() throws Exception
	    {
	        System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().window().maximize();
	 
	        driver.get("http://demo.automationtesting.in/Register.html");
	        driver.findElement(By.id("imagesrc")).click();
	 
	        Thread.sleep(5000);
	        
	        Pattern fileNameInput = new Pattern("D:\\Selenium\\FileOpenInput.PNG");
	        Pattern openButton = new Pattern("D:\\Selenium\\OpenButton.PNG");
	 
	        Screen screen = new Screen();
	        screen.type(fileNameInput, "D:\\Selenium\\OpenButton.PNG");
	        screen.click(openButton);
	    }
	}


