package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_NoBrokerage
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.nobroker.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[text()='Mumbai']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kalyan west,kalyan,maharashtra,india");
		
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();

	}

}
