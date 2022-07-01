package POM1UsingTestNG_SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class KiteHomePage 
{
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogoutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnUserID()
	{
		String actualUserID = UserID.getText();
		String expectedUserID = "ELR3211";
		
		Assert.assertEquals(actualUserID, expectedUserID,"UserId and Pwd is not matching, TC is Failed");
		Reporter.log("UserID and PWD is matching, TC is Passed",true);
	}
	
	public void ClickOnLogoutButton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(1000);
		LogoutButton.click();
	}
	
}
