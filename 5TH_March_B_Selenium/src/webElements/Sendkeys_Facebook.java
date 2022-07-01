package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Priyankabagad6@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123456");

		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
