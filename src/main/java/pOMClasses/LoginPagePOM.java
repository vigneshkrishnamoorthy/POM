package pOMClasses;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPagePOM 

{
	
	WebDriver driver;
	
	// Creating constructor using class name & passing the webdriver as parameter
	public LoginPagePOM(WebDriver driver1) 
	
	{	
		this.driver=driver1;
		
	}
	
	

	
@FindBy(id="Id Of element")
public WebElement userName;


@FindBy(how=How.CSS,using="Id of Password")
@CacheLookup // It will store the webelemnets in cache memory & start processing
public WebElement password;

@FindBy(how=How.XPATH,using="Xpath of Submit Button")
public WebElement SubmitButton;


public void validLoginToApplication(String uname, String pword)

{
	userName.sendKeys(uname);
	password.sendKeys(pword);
	SubmitButton.click();
	
	

}

public void invalidUserLogin(String invalidUserName, String validPassword)

{
	userName.sendKeys(invalidUserName);
	password.sendKeys(validPassword);
	SubmitButton.click();
	
}


public void invalidPasswordLogin(String validUserName, String invalidPassword)

{
	userName.sendKeys(validUserName);
	password.sendKeys(invalidPassword);
	SubmitButton.click();
	
}


}
