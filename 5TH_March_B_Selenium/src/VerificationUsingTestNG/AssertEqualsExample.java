package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsExample {
  @Test
  public void MyMethod() 
  {
	  String a="Jira";
	  String b="Jira";
	  
	  Assert.assertEquals(a, b, "String is not equals and TC is Failed");
	  Reporter.log("String is equal and TC is Passed", true);
	  
  }
}
