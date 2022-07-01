package KiteAppUtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class UtilityClassUsingPropertyFileForListener 
{
	public static String readDataFromPropertyFile(String Key) throws IOException
	{
		Properties prop=new Properties();
		
		FileInputStream myProp=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\5TH_March_B_Selenium\\myPropertyFile.properties");
		
		prop.load(myProp);
		
		String value = prop.getProperty(Key);
		
		return value;	
	}
	
	public static void implicitWait(WebDriver driver, int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}

}
