package verificationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRuntimeText {

	public static void main(String[] args) 
	{
		
		/*
		 * gettext():--->
		 * 			is a runtime command, it capture Visible text on
		 * 			targeted element(Outtertext)
		 * 
		 * 	Syntax:--->
		 * 		String runtimetext=driver.findElement(By.id("idvalue)).gettext();
		 */
		
		//Browser Launch
		WebDriver driver=new FirefoxDriver();
		driver.get("http://hotmail.com");
		driver.manage().window().maximize();
		
		
		//Capture Entire page Text
		String VisibleText=driver.findElement(By.tagName("body")).getText();
		
		
		//Expected Result is 
		String Exp_Text="Email or phone";
		
		//Verify With in page Expected text Available
		if(VisibleText.contains(Exp_Text))
		{
			System.out.println("As expected text presented");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
