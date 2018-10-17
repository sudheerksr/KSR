package com.lps.functional.reports;

import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setUp() {
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-outout/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Cucumber BDD Framework");
		htmlReporter.config().setReportName("LoanSphere Invoicing Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Env", "10-64");
	}
	@Test
    public void logsGeneration()
    {
        test = extent.createTest("logsGeneration");
        test.log(Status.INFO,"createTest() method will return the ExtentTest object");
        test.log(Status.INFO, "I am in actual Test");
        test.log(Status.INFO, "We can write the actual test logic in this Test");
         
        // Using Labels
        test.log(Status.INFO, MarkupHelper.createLabel("*************** Using Labels ***************", ExtentColor.RED));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 1", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 2", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 3", ExtentColor.BLUE));
        test.log(Status.INFO, MarkupHelper.createLabel("This is Test Logger 4", ExtentColor.BLUE));
    }
	@Test(priority=0)
	public void test1() {
		test = extent.createTest("Test Pass", "This test will demonstrate the PASS test case");
		Assert.assertTrue(true);
	}

	@Test(priority=1)
	public void test2() {
		extent.createTest("Test Fail", "This test will demonstrate the Fail test case");
		Assert.assertFalse(true);
	}

	@Test(priority=2)
	public void test3() {
		test = extent.createTest("demoTestSkip", "This test will demonstrate the SKIP test case");
		throw new SkipException("This test case not ready for execution");
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {
		if (result.getStatus() == ITestResult.FAILURE) {
		
			//String screenShotPath = TakesScreenshot.capture(driver, "screenShotName");
			test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:",
					ExtentColor.RED));
			test.fail("ScreenShoot below"+test.addScreenCaptureFromPath("Scree"));
			test.fail(result.getThrowable());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case Pass", ExtentColor.GREEN));
		} else {
			test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + "", ExtentColor.ORANGE));
			test.skip(result.getThrowable());
		}

	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
