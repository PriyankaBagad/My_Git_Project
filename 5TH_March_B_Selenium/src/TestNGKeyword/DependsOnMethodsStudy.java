package TestNGKeyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodsStudy 
{
	@Test
	  public void A() 
	  {
		  Assert.fail();
		  Reporter.log("A method is Running", true);
	  }
	@Test(dependsOnMethods = {"A"})
	  public void B() 
	  {
		  Reporter.log("B method is Running", true);
	  }
	@Test
	  public void D() 
	  {
		  Reporter.log("D method is Running", true);
	  }
	@Test
	  public void C() 
	  {
		  Reporter.log("C method is Running", true);
	  }
}
