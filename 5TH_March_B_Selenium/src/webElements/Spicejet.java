package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spicejet {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		WebElement Radio1 = driver.findElement(By.xpath("//div[text()='Family & Friends']"));
		
		if(Radio1.isSelected())
		{
			System.out.println("Radio button is already Selected...");
		}
		else
		{
			System.out.println("Select Radio Button");
			Thread.sleep(1000);
			Radio1.click();
			Thread.sleep(1000);
			if(Radio1.isSelected())
			{
				System.out.println("Radio Button is Selected....");
			}
			else
			{
				System.out.println("Not Selected");
			}
		}
		
	}

}
