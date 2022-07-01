package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullExample 
{
  @Test
  public void myMethod() 
  {
	  String a=null;
	  	  
	  Assert.assertNull(a,"Value is not Null and TC is Failed");
	  Reporter.log("Value is Null and TC is Passed", true);
  }
}
