package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_Selenium_Code 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");

		driver.navigate().to("https://www.google.com/");
		
		String title = driver.getTitle();
		
		System.out.println("Title is: "+title);
		
		System.out.println(driver.getTitle());
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL is: "+url);
		
		System.out.println(driver.getCurrentUrl());
	}

}
