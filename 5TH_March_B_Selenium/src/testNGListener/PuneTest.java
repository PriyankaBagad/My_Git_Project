package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PuneTest 
{
  @Test
  public void ShivajiNagar() 
  {
	  Assert.fail();
	  Reporter.log("Shivaji Nagar TC is Running",true);
  }
  
  @Test
  public void Swargate()
  {
	  Reporter.log("Swargate TC is Running",true);
  }
}
