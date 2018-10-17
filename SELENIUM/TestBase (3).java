package com.lps.functinal.selenium.basetest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.lps.functinal.selenium.util.TestUtil;
import com.lps.functinal.selenium.util.WebEventListener;

/**
 * Hello world!
 *
 */
public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;

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

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\main\\java\\com\\lps\\functinal\\selenium\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\SOFTWARE\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\SOFTWARE\\geckodriver-v0.21.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

	}

	public static String capture(WebDriver driver, String screenShotName) throws Exception {
		return screenShotName;
		/*
		 * Screenshot screenshot = new
		 * AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
		 * takeScreenshot(driver); String dest = System.getProperty("user.dir") +
		 * "/ErrorScreenshots/" + screenShotName + ".png";
		 * ImageIO.write(screenshot.getImage(),"PNG",new File(dest)); return dest;
		 */
	}

	@AfterSuite
	public void tearDown() {
		extent.flush();
	}
}
