package com.extentreports;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReports3 {
	
	@Test
	public void loginTest() {
		System.out.println(System.getProperty("user.dir")+"\\test-output\\ExtentsReports.html");
		ExtentHtmlReporter extentHtmlReporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/ExtentsReports.html");
		ExtentReports extentReports=new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);
		ExtentTest logger=extentReports.createTest("LoginTest");
		logger.log(Status.PASS, "Login To Amazon");
		String a="abc";
		logger.info(a);		
		extentReports.flush();
		
		
	}

}
