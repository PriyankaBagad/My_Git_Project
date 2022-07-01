package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFalseExample 
{
  @Test
  public void myMethod() 
  {
	  boolean a=false;
	  
	  Assert.assertFalse(a, "Value is true and TC is Failed");
	  Reporter.log("Value is false and TC is Passed",true);
  }
}
