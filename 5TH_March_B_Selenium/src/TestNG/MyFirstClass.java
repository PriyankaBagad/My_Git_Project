package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyFirstClass 
{
  @Test
  public void MyMethod1() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  System.out.println("Method1 is Running...");
  }
  
  @Test
  public void MyMethod2() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  Reporter.log("Method2 is Running....");
  }
  
  @Test
  public void MyMethod3() 
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/login/");
	  Reporter.log("Method3 is Running.....", true);
  }
}
