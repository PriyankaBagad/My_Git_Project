package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Contains_Attribute 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");

		
		// Xpath by Contains Attribute method
		
		driver.findElement(By.xpath("(//input[contains(@type,'checkbox')])[2]")).click();
		

	}

}
