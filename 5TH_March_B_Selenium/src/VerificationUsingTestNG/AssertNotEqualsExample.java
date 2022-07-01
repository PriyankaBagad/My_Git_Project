package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEqualsExample 
{
  @Test
  public void MyMethod() 
  {
	  String a="Jira";
	  String b="TestNG";
	  
	  Assert.assertNotEquals(a, b, "String is equal and TC is Failed");
	  Reporter.log("String is not equal and TC is Passed", true);
  }
}
