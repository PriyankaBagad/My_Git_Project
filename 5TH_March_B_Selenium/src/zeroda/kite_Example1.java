package zeroda;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kite_Example1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserId.sendKeys("GP8097");
		Password.sendKeys("Swami@0110");
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement Pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Pin.sendKeys("449192");
		ContinueButton.click();
		
		WebElement UserID1 = driver.findElement(By.xpath("//span[text()='GP8097']"));
		String ActualResult = UserID1.getText();
		String ExpectedResult = "GP8097";
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Result is Matching and TC is Passed");
		}
		else
		{
			System.out.println("Result is not Matching and TC is Failed");
		}
		
		UserID1.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.quit();
		
	}

}
