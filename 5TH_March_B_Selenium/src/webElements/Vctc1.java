package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vctc1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		 
		WebElement RadioButton = driver.findElement(By.xpath("//input[@value='Radio1']"));
		RadioButton.click();
		
		if(RadioButton.isSelected())
		{
			System.out.println("Radio Button is Already Selected..........");
		}
		else
		{
			System.out.println("Select the Radio button");
			RadioButton.click();
			if(RadioButton.isSelected())
			{
				System.out.println("Radio Button is Selected.");
			}
			else
			{
				System.out.println("Not Selected");
			}
		}
		
		
		
		
		
	}

}
