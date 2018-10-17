package com.extentreports;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	public static ExtentHtmlReporter htmlReorter;
	public static ExtentReports extentReport;
	public static ExtentTest logger;
	@BeforeSuite
	public void setUp() {
		htmlReorter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/Reports/ExtentReports.html");
		extentReport=new ExtentReports();
		
		extentReport.attachReporter(htmlReorter);		
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		if (result.getStatus()==ITestResult.FAILURE){
			logger.fail(MarkupHelper.createLabel(result.getName()+"Test Case Failed", ExtentColor.RED));
			logger.fail(result.getThrowable());
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			logger.pass(MarkupHelper.createLabel(result.getName()+"Test Case Passed",ExtentColor.GREEN));
		}else {
			logger.fail(MarkupHelper.createLabel(result.getName()+"Test Case Skipped", ExtentColor.RED));
			logger.fail(result.getThrowable());
		}
	}
	@AfterSuite
	public void tearDown() {
		extentReport.flush();

	}
}
