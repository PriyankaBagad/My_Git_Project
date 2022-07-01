package POM1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteLoginPage Login = new KiteLoginPage(driver);
		Login.sendUserID();
		Login.sendPassword();
		Login.ClickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage Pin = new KitePinPage(driver);
		Pin.sendPin();
		Pin.ClickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage Home = new KiteHomePage(driver);
		Home.ClickOnUserID();
		Home.ClickOnLogoutButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.quit();
		
		
		
		
	}

}
