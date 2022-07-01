package TestNGXMLStudy;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest4 
{
  @Test
  public void myMethod6() 
  {
	 // Assert.fail();
	  Reporter.log("Method6 is Running",true);
  }
  @Test(groups = "Sanity")
  public void myMethod7() 
  {
	  Reporter.log("Method7 Sanity is Running",true);
  }
  @Test
  public void myMethod8() 
  {
	  Reporter.log("Method8 is Running",true);
  }
  @Test(groups = "Regression")
  public void myMethod9() 
  {
	  Reporter.log("Method9 Regression is Running",true);
  }
  @Test
  public void myMethod10() 
  {
	  Reporter.log("Method10 is Running",true);
  }
}
