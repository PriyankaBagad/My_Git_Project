package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Combine_KeywordStudy 
{
  @Test
  public void D() 
  {
	  Reporter.log("Method D is Running", true);
  }
  @Test(priority = -1, timeOut = 1000, dependsOnMethods = {"A"})
  public void B() 
  {
	  Reporter.log("Method B is Running", true);
  }
  @Test
  public void A() 
  {
	  Reporter.log("Method A is Running", true);
  }
  
}
