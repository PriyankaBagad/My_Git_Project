package actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickStudy 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		
		Actions act=new Actions(driver);
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(button).perform();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
				
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(rightclick).perform();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[text()='Quit']")).click();
		alt.accept();
		
		
	}

}
