package pomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pOMClasses.LoginPagePOM;
import pom_utility.BrowserFactory;

public class VerifyValidLogin 

{
	
	@Test (priority =0,invocationCount=2,threadPoolSize =2)
	public void validateLogin()
	
	{
		//Launch Browser
		WebDriver driver =  BrowserFactory.openBrowser("firefox", "http://www,google.com");
		
		// Initializing the element , created page object using page factory
		LoginPagePOM loginPagePOM = PageFactory.initElements(driver, LoginPagePOM.class);
		
		//Performing the Login by calling the Method
		loginPagePOM.validLoginToApplication("admin", "Password");
		
		
		
		
		
	}
	

}
