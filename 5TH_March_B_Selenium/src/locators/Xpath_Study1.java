package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Study1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
				
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//button[@name='login']")).click(); //Xpath by Attribute
		
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click(); //Xpath by Text()
		
		//driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));  //Xpath using Text(), if path is big so we use Contains() method
		
		//driver.findElement(By.xpath("//h2[contains(text(),'connect and')]"));
		
		driver.findElement(By.xpath("//a[contains(@rel,'async')]")).click();
		
		
		

	}

}
