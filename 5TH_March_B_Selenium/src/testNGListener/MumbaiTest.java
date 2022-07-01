package testNGListener;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MumbaiTest 
{
  @Test
  public void Thane() 
  {
	  Reporter.log("Thane TC is Running",true);
  }
  
  @Test
  public void kalyan()
  {
	  Reporter.log("Kalyan TC is Running",true);
  }
}
