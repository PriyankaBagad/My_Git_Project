package KiteAppPOMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//1. Data member
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement Username;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	//2. Constructor
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Method
	
	public String validateUserID()
	{
		String actualUserID = Username.getText();
		return actualUserID;
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
		Username.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}

}
