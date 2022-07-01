package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledStudy 
{
	@Test(enabled = false) //ignore
	  public void A() 
	  {
		  Reporter.log("A method is Running", true);
	  }
	@Test
	  public void B() 
	  {
		  Reporter.log("B method is Running", true);
	  }
	@Test(enabled = true)
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
