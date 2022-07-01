package KiteAppTestClass;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClass;
import KiteAppPOMClass.HomePage;
import KiteAppPOMClass.LoginPage;
import KiteAppPOMClass.PinPage;
import KiteAppUtilityClass.UtilityClass;

public class ValidateKiteUserID extends BaseClass 
{
	HomePage home;
	LoginPage login;
	PinPage pin;
	
	@BeforeClass
	public void launchBrowser()
	{
		openBrowser();
		home=new HomePage(driver);
		login=new LoginPage(driver);
		pin=new PinPage(driver);
	}
	
	@BeforeMethod
	public void loginToKitePage() throws EncryptedDocumentException, IOException
	{
		login.sendUsername(UtilityClass.readDataFromExcel(1, 0));
		login.sendPassword(UtilityClass.readDataFromExcel(1, 1));
		login.clickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(UtilityClass.readDataFromExcel(1, 2));
		pin.clickOnContinueButton();
	}

	@Test
	public void validateUserName() throws EncryptedDocumentException, IOException 
	{
		String actualUserID = home.validateUserID();
		String expectedUserID=UtilityClass.readDataFromExcel(1, 0);
		
		Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected User ID is not matching.. TC is Failed");
		Reporter.log("Actual and Expected User ID is matching..TC is passed",true);
		UtilityClass.takeScreenShot(driver);
	}
	
	@AfterClass
	public void LogOutToKitePage() throws InterruptedException
	{
		Thread.sleep(1000);
		home.clickOnLogoutButton();
	}
	
	@AfterMethod
	public void closeBrowser()	
	{
		//driver.quit();
	}
}
