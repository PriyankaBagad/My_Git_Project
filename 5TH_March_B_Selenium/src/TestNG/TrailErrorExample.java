package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrailErrorExample 
{
  @Test
  public void ValidateUserID() 
  {
	  
	  
  }
  @BeforeClass
  public void LaunchBrowser()
  {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://kite.zerodha.com/");
	WebElement UserID = driver.findElement(By.id("userid"));
	WebElement PWD = driver.findElement(By.id("password"));
	WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	UserID.sendKeys("GP8097");
	PWD.sendKeys("Swami@0110");
	LoginButton.click();
  }
  
  @BeforeMethod
  public void LogIn()
  {
	  
	  
  }
   
  
 
}
