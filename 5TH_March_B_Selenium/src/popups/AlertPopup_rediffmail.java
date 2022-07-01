package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_rediffmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("login1")).sendKeys("abc@rediffmail.com");
		//driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.name("proceed")).click();
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		alt.accept();
		

	}

}
