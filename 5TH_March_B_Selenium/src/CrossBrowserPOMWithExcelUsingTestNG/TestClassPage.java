package CrossBrowserPOMWithExcelUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassPage 
{
	WebDriver driver;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	KiteChangePage changePage;
	Sheet mySheet;
	
	@Parameters("browser")
	
	@BeforeClass
	public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "E:\\Selenium\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("Launching URL...",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		login=new KiteLoginPage(driver);
		pin=new KitePinPage(driver);
		home=new KiteHomePage(driver);
		changePage=new KiteChangePage(driver);
		
		File MyFile=new File("E:\\Software Testing\\Group A Mock Result.xlsx");
		mySheet=WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
	}
	
	@BeforeMethod
	public void LoginPage()
	{
		login.sendUserID(mySheet.getRow(2).getCell(0).getStringCellValue());
		Reporter.log("Sending Username",true);
		login.sendPassword(mySheet.getRow(2).getCell(1).getStringCellValue());
		Reporter.log("Sending Password",true);
		login.ClickOnLoginButton();
		Reporter.log("Clicking on Login Button...",true);
		
		pin.sendPin(mySheet.getRow(2).getCell(2).getStringCellValue());
		Reporter.log("Sending Pin",true);
		pin.ClickOnContinueButton();
		Reporter.log("Click on Continue Button...",true);
	}
	
	@Test
	public void ValidateUserID() 
	{
		String ExpectedUserID=mySheet.getRow(2).getCell(0).getStringCellValue();
		String ActualUserID=home.ClickOnUserID();
		Reporter.log("Validating UserID...",true);
		Assert.assertEquals(ExpectedUserID, ActualUserID, "Expected UserID and Actual UserID is not matching, TC is Failed");
		Reporter.log("Expected UserID and Actual UserID is matching, TC is Passed");
	}
	
	@AfterMethod
	public void LogOutPage() throws InterruptedException
	{
		home.ClickOnLogoutButton();
		Reporter.log("Logging Out.....",true);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		Reporter.log("Closing Browser...",true);
		//driver.quit();
	}
	
	
}
