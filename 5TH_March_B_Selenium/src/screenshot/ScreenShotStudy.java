package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotStudy 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File destination=new File("E:\\Automation Testing\\ScreenShot\\MyScreenShot123.jpg");
		
		FileHandler.copy(source, destination);
		
	}

}
