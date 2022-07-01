package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstClass 
{
	@Test
	  public void MyMethod1() 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  System.out.println("Method1 is Running...");
	  }
}
