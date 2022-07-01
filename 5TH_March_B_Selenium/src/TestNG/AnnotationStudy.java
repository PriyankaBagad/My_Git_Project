package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy 
{
  @Test
  public void MyTest() 
  {
	  Reporter.log("Test method is Running", true);
  }
  
  @BeforeMethod
  public void LogIn()
  {
	  Reporter.log("Before method is Running", true);
  }
  
  @AfterMethod
  public void LogOut()
  {
	  Reporter.log("After method is running", true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("Before class is running", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("After class is running", true);  
  }
}
