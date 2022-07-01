package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains_Text 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(100);
		
		// Xpath by contains text
		
		driver.findElement(By.xpath("//h1[contains(text(),'Welcome To')]")).click();
		
		Thread.sleep(100);
		
		driver.close();
	}

}
