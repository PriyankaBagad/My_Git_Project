package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FourthClass 
{
	@Test
	  public void MyMethod4() 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  System.out.println("Method4 is Running...");
	  }
}
