package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutStudy 
{
	@Test
	  public void A() 
	  {
		  Reporter.log("A method is Running", true);
	  }
	@Test(timeOut = 1000)
	  public void B() throws InterruptedException 
	  {
		  Thread.sleep(1200);
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
