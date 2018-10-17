package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakeScreenShoot {

	/**
	 * 
	 * @param ldriver
	 * 	driver instance
	 * @param screenShootName
	 * Name of the ScreenName
	 * @return
	 * return path
	 */
	public static String captureScreenShot(WebDriver ldriver, String screenShootName) {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) ldriver).getScreenshotAs(OutputType.FILE);
		try {
			// now copy the screenshot to desired location using copyFile method
			String path = System.getProperty("user.dir") + "\\ScreenShoots\\" + screenShootName + ".png";

			FileUtils.copyFile(src, new File(path));
			return path;
		} catch (IOException e)

		{
			System.out.println(e.getMessage());
			return e.getMessage();
		}

	}

}
