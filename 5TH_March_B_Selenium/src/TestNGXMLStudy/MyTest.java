package TestNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest 
{
	//I want to run 1,3,5
	//I dont want 2,4
	
  @Test
  public void myMethod1() 
  {
	  Reporter.log("Method1 is Running",true);
  }
  @Test
  public void myMethod2() 
  {
	  Reporter.log("Method2 is Running",true);
  }
  @Test
  public void myMethod3() 
  {
	  Reporter.log("Method3 is Running",true);
  }
  @Test
  public void myMethod4() 
  {
	  Reporter.log("Method4 is Running",true);
  }
  @Test
  public void myMethod5() 
  {
	  Reporter.log("Method5 is Running",true);
  }
}
