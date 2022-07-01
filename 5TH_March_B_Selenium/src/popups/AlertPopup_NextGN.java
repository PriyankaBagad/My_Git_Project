package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_NextGN 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("alertbox")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(1000);
		
		driver.findElement(By.name("confirmalertbox")).click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();
		System.out.println(alt1.getText());
		alt1.dismiss();
		Thread.sleep(1000);
		
		driver.findElement(By.name("promptalertbox1234")).click();
		Thread.sleep(1000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.accept();
		
		
		
		
		

	}

}
