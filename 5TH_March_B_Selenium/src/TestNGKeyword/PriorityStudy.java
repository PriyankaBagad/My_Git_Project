package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityStudy 
{
	@Test(priority = 4)
	  public void A() 
	  {
		  Reporter.log("A method is Running", true);
	  }
	@Test(priority = -3)
	  public void B() 
	  {
		  Reporter.log("B method is Running", true);
	  }
	@Test(priority = 1)
	  public void D() 
	  {
		  Reporter.log("D method is Running", true);
	  }
	@Test(priority = 0)
	  public void C() 
	  {
		  Reporter.log("C method is Running", true);
	  }
}
