package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Youtube 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Paw Patrol games");

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//button[@aria-label='Search'])[1]")).click();
	}

}
