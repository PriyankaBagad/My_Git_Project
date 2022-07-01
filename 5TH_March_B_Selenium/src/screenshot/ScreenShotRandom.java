package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenShotRandom 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(2);
		
		File Destination=new File("E:\\Automation Testing\\ScreenShot\\ScreenShot"+random+".jpg");
		
		FileHandler.copy(Source, Destination);
		
		
	}

}
