package KiteAppBaseClass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import KiteAppUtilityClass.UtilityClassUsingPropertyFile;

public class BaseClassUsingProperty 
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
	
}
