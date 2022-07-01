package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Selenium_Code 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
			
		//driver.close();
		
		//driver.quit();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.w3schools.com/sql/sql_in.asp");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.quit();
	}

}