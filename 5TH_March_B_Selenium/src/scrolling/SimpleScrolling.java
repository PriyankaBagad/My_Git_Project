package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScrolling 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/sql/");
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		Thread.sleep(1000);
		
		// +ve x value--> right hand side, Y value +ve --> down 
		// +ve x value--> right hand side, Y value -ve --> up 
		// -ve x value--> left hand side, Y value +ve --> down 
		// -ve x value--> left hand side, Y value -ve --> up 

		
		j.executeScript("window.scrollBy(10,900)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(100,3000)");
		Thread.sleep(1000);
		
		j.executeScript("window.scrollBy(100,-2000)");
		Thread.sleep(100);
		
		j.executeScript("window.scrollBy(-50,-100)");
	
	}
	

}
