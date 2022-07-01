package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		

	}

}
