package com.thoughtworks.selenium;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;

public class Test1 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver=new WebDriver() {
			
			@Override
			public TargetLocator switchTo() {
				driver=new FirefoxDriver();
				Seleniu
				
				return null;
			}
			
			@Override
			public void quit() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Navigation navigate() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Options manage() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Set<String> getWindowHandles() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getWindowHandle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTitle() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getPageSource() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCurrentUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void get(String url) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public List<WebElement> findElements(By by) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public WebElement findElement(By by) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void close() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}
	
}
