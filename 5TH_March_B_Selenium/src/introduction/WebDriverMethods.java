package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//driver.quit();
		
		driver.manage().window().maximize();
		
		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(500);
		
		driver.navigate().back();
		
		driver.navigate().forward();

		driver.navigate().refresh();
		
		String Title = driver.getTitle();
		System.out.println(Title);

		System.out.println(driver.getCurrentUrl());
		
		//driver.close();

	}

}
