package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup_demoqa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
		Alert alt = driver.switchTo().alert();
		
		//2.Alert is an interface which contains abstract methods like
		System.out.println(alt.getText()); 	//use to get text present in a alert popup.
		Thread.sleep(1000);
		alt.accept();	//use to click on ok button.
		
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		Alert alt1 = driver.switchTo().alert();
		
		System.out.println(alt1.getText());
		Thread.sleep(1000);
		alt.dismiss();	//use to click on cancel button
		
		
		
		
		
		

	}

}
