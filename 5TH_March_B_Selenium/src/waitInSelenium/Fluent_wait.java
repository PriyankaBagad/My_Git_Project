package waitInSelenium;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

class Fluent_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		Syntax of Fluent wait
//		Wait wait = new FluentWait(WebDriver reference)
//				.withTimeout(Duration.ofSeconds(SECONDS))
//				.pollingEvery(Duration.ofSeconds(SECONDS))
//				.ignoring(Exception.class);

		
		//Declare and Initialize Fluent wait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofMillis(5000))
		
		//Specify polling time
		.pollingEvery(Duration.ofMillis(500))
		
		//Specify what exceptions to ignore
		.ignoring(NoSuchElementException.class);
		
		driver.get("https://demoqa.com/checkbox");
		
		WebElement element=wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver)
			{
				return driver.findElement(By.xpath("//span[text()='Home']"));
			}	
		});
		element.click();

	}

}


