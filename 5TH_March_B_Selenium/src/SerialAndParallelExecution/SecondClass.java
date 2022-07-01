package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondClass 
{
	@Test
	  public void MyMethod2() 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.rediff.com/");
		  System.out.println("Method2 is Running...");
	  }
}
