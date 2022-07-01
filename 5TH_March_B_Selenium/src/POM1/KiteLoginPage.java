package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//1. Data Members/Variables
	
	@FindBy(id = "userid") private WebElement UserID;
	@FindBy(id = "password") private WebElement PassWord;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;

	//2. Constructor
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Method
	
	public void sendUserID()
	{
		UserID.sendKeys("GP8097");
	}
	
	public void sendPassword()
	{ 
		PassWord.sendKeys("Swami@0110");
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}
	
	
}

