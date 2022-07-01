package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueExample 
{
  @Test
  public void myMethod() 
  {
	  boolean a=true;
	  	  
	  Assert.assertTrue(a, "Value is false and TC is Failed");
	  Reporter.log("Value is true and TC is Passed", true);
	  
  }
}
