package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import KiteAppUtilityClass.UtilityClassUsingPropertyFile;

public class BaseClassUsingPropertyForListener 
{
	protected static WebDriver driver;
	//browser Setup
	
	public void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityClassUsingPropertyFile.readDataFromPropertyFile("URL"));
		UtilityClassUsingPropertyFile.implicitWait(driver, 1000);
	}
	
	public void takeScreenShot(String TCName) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("E:\\Automation Testing\\ScreenShot\\ListenerScreenShot"+TCName+".jpg");
		
		FileHandler.copy(source, dest);		
	}	

	
}
