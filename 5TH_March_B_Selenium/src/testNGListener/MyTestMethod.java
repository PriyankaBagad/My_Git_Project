package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class MyTestMethod 
{
  @Test	
  public void myTest()
  {
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = {"myTest"})
  public void myMethod() 
  {
	  Reporter.log("Hello..Good morning",true);
  }
}
