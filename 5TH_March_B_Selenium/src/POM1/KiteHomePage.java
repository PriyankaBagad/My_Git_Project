package POM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage 
{
	//1. Data members/ Variables
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	
	//2. Constructor
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Methods
	
	public void ClickOnUserID()
	{
		String actualUserID = UserID.getText();
		String expectedUserID = "GP8097";
		
		if(actualUserID.equals(expectedUserID))
		{
			System.out.println("User ID is matching and TC is Passed");
		}
		else
		{
			System.out.println("User ID is not matching and TC is Failed");
		}
		
	}
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}
	
}
