package pom_utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory 

{
	
 static WebDriver driver;

public static WebDriver openBrowser(String browserName, String url)

{
	if(browserName.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "Path of Firefox driver");
		driver = new FirefoxDriver();
	}
	
	else if (browserName.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", "Path of chrome driver");
		driver = new ChromeDriver();
		
	}
	
	
	else if (browserName.equalsIgnoreCase("ie")) 
	{
		System.setProperty("webdriver.ie.driver", "Path of ie driver");
		driver = new InternetExplorerDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.get("url");
	
	
	return driver;
	
}

}
