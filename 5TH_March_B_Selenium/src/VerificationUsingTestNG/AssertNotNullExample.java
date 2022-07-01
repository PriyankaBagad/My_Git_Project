package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotNullExample 
{
	@Test
	  public void myMethod() 
	  {
		  String a="Hi";
		 
		  Assert.fail();
		  Assert.assertNotEquals(a,"Value is Null and TC is Failed");
		  Reporter.log("Value is not Null and TC is Passed", true);
	  }
}
