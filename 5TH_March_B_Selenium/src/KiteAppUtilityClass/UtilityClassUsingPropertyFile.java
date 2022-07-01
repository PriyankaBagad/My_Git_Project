package KiteAppUtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClassUsingPropertyFile 
{
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(3);
		
		File dest=new File("E:\\Automation Testing\\ScreenShot\\PropertyFileScreenShot"+random+".jpg");
		
		FileHandler.copy(source, dest);		
	}	

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
