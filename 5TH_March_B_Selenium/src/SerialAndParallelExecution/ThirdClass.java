package SerialAndParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdClass 
{
	@Test
	  public void MyMethod3() 
	  {
		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com/");
		  System.out.println("Method3 is Running...");
	  }
}
