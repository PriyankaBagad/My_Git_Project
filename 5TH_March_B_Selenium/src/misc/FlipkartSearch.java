package misc;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Assignment: Visit flipkart and find reviews and rating for any mobile/laptop
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("sony tv 32 smart android full hd");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement RatingReview = driver.findElement(By.xpath("((//div[@class='_3pLy-c row'])[1]//div)[3]"));
		System.out.println(RatingReview.getText());
		RatingReview.click();
	
	}

}
