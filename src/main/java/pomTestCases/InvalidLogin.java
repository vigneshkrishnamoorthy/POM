package pomTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pOMClasses.LoginPagePOM;
import pom_utility.BrowserFactory;

public class InvalidLogin 
{
	
	public void invalidUserNameValidation()
	
	{
	
		BrowserFactory.openBrowser("chrome", "www.google.com");
		
		 WebDriver driver = null;
		LoginPagePOM loginPagePOM = PageFactory.initElements(driver, LoginPagePOM.class);
		 
		 loginPagePOM.invalidUserLogin("xxxx", "Pass123#");
		 
		
		 

		
	}
	
	
}
