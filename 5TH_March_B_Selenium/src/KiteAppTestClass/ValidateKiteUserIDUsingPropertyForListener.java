package KiteAppTestClass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClassUsingPropertyForListener;
import KiteAppPOMClass.HomePage;
import KiteAppPOMClass.LoginPage;
import KiteAppPOMClass.PinPage;
import KiteAppUtilityClass.UtilityClassUsingPropertyFile;

@Listeners(testNGListener.Listener1.class)
public class ValidateKiteUserIDUsingPropertyForListener extends BaseClassUsingPropertyForListener
{
	LoginPage login;
	HomePage home;
	PinPage pin;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openBrowser();
		login=new LoginPage(driver);
		home=new HomePage(driver);
		pin=new PinPage(driver);
	}
	
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUsername(UtilityClassUsingPropertyFile.readDataFromPropertyFile("UN"));
		login.sendPassword(UtilityClassUsingPropertyFile.readDataFromPropertyFile("PWD"));
		login.clickOnLoginButton();
		
		UtilityClassUsingPropertyFile.implicitWait(driver, 1000);
		
		pin.sendPin(UtilityClassUsingPropertyFile.readDataFromPropertyFile("PIN"));
		pin.clickOnContinueButton();
		UtilityClassUsingPropertyFile.implicitWait(driver, 1000);
	}
	
	@Test
	public void ValidateUserID() throws IOException 
	{
		String actualUserID = home.validateUserID();
		String expectedUserID=UtilityClassUsingPropertyFile.readDataFromPropertyFile("UN1");
		
		Assert.assertEquals(actualUserID, expectedUserID, "Actual and Expected User ID is not matching..TC is Failed");
		Reporter.log("Actual and expected User ID is matching. TC is Passed",true);
		
		//UtilityClassUsingPropertyFile.takeScreenShot(driver);		
	}
	
	@AfterMethod
	public void LogOutFromKiteApp() throws InterruptedException
	{
		home.clickOnLogoutButton();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
