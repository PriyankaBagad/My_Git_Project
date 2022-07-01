package TestNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest3 
{
  @Test(groups = "Sanity")
  public void myMethod1() 
  {
	  Reporter.log("Method1 Sanity is Running",true);
  }
  @Test(groups = "Regression")
  public void myMethod2() 
  {
	  Reporter.log("Method2 Regression is Running",true);
  }
  @Test
  public void myMethod3() 
  {
	  Reporter.log("Method3 is Running",true);
  }
  @Test(groups = "Sanity")
  public void myMethod4() 
  {
	  Reporter.log("Method4 Sanity is Running",true);
  }
  @Test(groups = "Regression")
  public void myMethod5() 
  {
	  Reporter.log("Method5 Regression is Running",true);
  }
}
