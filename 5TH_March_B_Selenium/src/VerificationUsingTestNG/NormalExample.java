package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NormalExample 
{
  @Test
  public void Verification() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  
	  WebElement CheckBox1 = driver.findElement(By.id("checkBoxOption1"));
//	  if(CheckBox1.isSelected())
//	  {
//		  Reporter.log("Checkbox is Selected and TC is Passed");
//	  }
//	  else
//	  {
//		  Reporter.log("Checkbox is not Selected and TC is Failed");
//	  }
	  CheckBox1.click();
	  Thread.sleep(100);
	  Assert.assertTrue(CheckBox1.isSelected(), "Checkbox is not selected and TC is Failed");
	  Reporter.log("Checkbox is Selected and TC is Passed",true);
  }
}
