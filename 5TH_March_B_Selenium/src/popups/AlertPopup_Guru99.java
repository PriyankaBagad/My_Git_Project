package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_Guru99 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("cusid")).sendKeys("123456");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.accept();
		Thread.sleep(5000);
		
		driver.findElement(By.name("res")).click();
		Thread.sleep(1000);
		
		
		
		

	}

}
