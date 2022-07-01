package ChromOptions;

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
	
	public String ClickOnUserID()
	{
		String actualUserID = UserID.getText();
		return actualUserID;
	}
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}
	
}
