package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCountStudy 
{
  @Test(invocationCount = 3)
  public void A() 
  {
	  Reporter.log("A method is Running", false);
  }
 @AfterMethod
 public void myMethod()
 {
	 Reporter.log("MyMethod is Running", true);
 }
}
