package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeSample1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		
		driver.switchTo().frame("courses-iframe");
		Thread.sleep(100);
		
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		
		driver.switchTo().parentFrame();
		Thread.sleep(200);
		driver.findElement(By.id("checkBoxOption1")).click();
	}

}
