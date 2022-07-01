package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vodafone 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myvi.in/");
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("9527812485");
		
		WebElement OTPButton = driver.findElement(By.xpath("//button[text()='send OTP']"));
		//OTPButton.click();
	    boolean result = OTPButton.isEnabled(); 
		System.out.println(result);
		if(OTPButton.isEnabled())
		{
			System.out.println("Button is Enabled"+result);
		}
		else
		{
			System.out.println("Enter Correct Number"+result);
		}
		
	}

}
