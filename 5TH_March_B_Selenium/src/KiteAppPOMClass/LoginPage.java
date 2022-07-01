package KiteAppPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	//1. Data Members/Variables
	
	@FindBy( id = "userid") private WebElement Username;
	@FindBy( id = "password") private WebElement Password;
	@FindBy( xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	//2. Constructor
	 
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Method
	
	public void sendUsername(String UserID)
	{
		Username.sendKeys(UserID);
	}
	
	public void sendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton()
	{
		LoginButton.click();
	}
}
