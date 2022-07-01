
package VerificationUsingTestNG;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KiteZerodaLoginExample 
{
  @Test
  public void myMethod() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  
	  WebElement UserID = driver.findElement(By.id("userid"));
	 	   	  
	  UserID.sendKeys("ELR321");
	  Thread.sleep(1000);
	  
	  String ActualUserID = UserID.getText();
	  
	  String ExpectedUserID="ELR321";
	  Thread.sleep(1000);
	  
	  Assert.assertEquals(ActualUserID, ExpectedUserID);
	  //Assert.assertEquals(ActualUserID, ExpectedUserID);
	  Reporter.log("UserID is matching and TC is Passed");
	  
	  
  }
}
