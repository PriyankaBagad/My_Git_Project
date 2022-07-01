package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInView 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
		
		WebElement textboxfield = driver.findElement(By.name("ex1"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		
		textboxfield.sendKeys("SELECT");
		
		j.executeScript("arguments[0].scrollIntoView(true);",textboxfield);
		
		
		

	}

}
