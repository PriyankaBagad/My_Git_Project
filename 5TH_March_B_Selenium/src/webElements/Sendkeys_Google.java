package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(100);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("paw patrol games");
		
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();

	}

}
