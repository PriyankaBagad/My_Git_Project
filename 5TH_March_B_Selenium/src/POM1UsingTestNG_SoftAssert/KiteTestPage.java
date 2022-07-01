package POM1UsingTestNG_SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteTestPage 
{
		WebDriver driver;
		KiteLoginPage Login;
		KitePinPage Pin;
		KiteHomePage Home;
		KiteChangePage ChangeUser;
		
	  @BeforeClass
	  public void LaunchBrowser()
	  {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Login=new KiteLoginPage(driver);
		Pin=new KitePinPage(driver);
		Home=new KiteHomePage(driver);
		ChangeUser=new KiteChangePage(driver);
	  }
	  @BeforeMethod
	  public void LoginPage() throws InterruptedException 
	  {
		  Login.sendUserID();
		  Login.sendPassword();
		  Login.ClickOnLoginButton();
		  Thread.sleep(1000);
		  Pin.sendPin();
		  Pin.ClickOnContinueButton();
		  Thread.sleep(1000);
  	  }
	   
	  @Test
	  public void ValidateUserID() throws InterruptedException 
	  {		  
		Home.ClickOnUserID();
		Thread.sleep(1000);
	  }
		
	  @AfterMethod
	  public void Logout() throws InterruptedException
	  {
		Home.ClickOnLogoutButton();  
		  
	  }
	   
	  @AfterClass
	  public void CloseBrowser()
	  {
		  ChangeUser.ClickOnChangeUser();
		  driver.quit();
	  }
}
