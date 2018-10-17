package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRuntime_property 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Getattribute("propname"):--->
		 * 			getattribute is a runtime command it capture any object property values
		 * 			using it's property name inside the tag available, 
		 * 
		 * 	Syntax:-->
		 * 			driver.findElement(By.id("attributename")).getAttribute("attributename");
		 */

		//Browser Launch
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("i0116"));
		
		String Obj_name=username.getAttribute("name");
		System.out.println("Object Name is   "+Obj_name);
		
		String Obj_class=username.getAttribute("class");
		System.out.println("Object class is  "+Obj_class);
		
		String Obj_type=username.getAttribute("type");
		System.out.println("Object type is  "+Obj_type);
		
		
		String Obj_lang=username.getAttribute("lang");
		System.out.println("object lang is  "+Obj_lang);
		
		String Obj_maxlength=username.getAttribute("maxlength");
		System.out.println("Object max length is  "+Obj_maxlength);
		
		String Obj_aria_label=username.getAttribute("aria-label");
		System.out.println("Object aria label is "+Obj_aria_label);
		
	
		
		
		
		/*
		 * Example:--> How To Caputre UserInput From WebApplication
		 */
		
		
		//Send Data to Edit field
		driver.findElement(By.id("i0116")).clear();
		driver.findElement(By.id("i0116")).sendKeys("Webdriver");
		
		
		//Capure User Input Data at Runtime
		String AcutalValue=driver.findElement(By.id("i0116")).getAttribute("value");
		
		
		//Compare Actual And Expected value
		if(AcutalValue.equalsIgnoreCase("WebDriver"))
		{
			System.out.println("WEbdriver successfully Set Input into WebEdit Field");
		}
		else
		{
			System.out.println("Input Data Show null in WebEdit field");
		}
		
		
		
		
		
		
		
				

	}

}
