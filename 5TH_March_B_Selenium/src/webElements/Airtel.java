package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airtel 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airtel.in/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Login")).click();
		
		WebElement MobileNo = driver.findElement(By.id("number-one"));
		MobileNo.sendKeys("8888888888");
		
/*		if(MobileNo)
		{
			
			Thread.sleep(1000);
			System.out.println("Generate OTP..");
		}
		else
		{
			System.out.println("Not Generated OTP");
		}
	*/	
		Thread.sleep(1000);
		
		driver.findElement(By.id("getOTPSpan")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("LOGIN")).click();

	}

}
