package screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotNumber 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Date d1=new Date(7);
		boolean res = d1.before(d1);
		System.out.println(res);
		System.out.println(d1);
		
		File destination=new File("E:\\Automation Testing\\ScreenShot\\Image.png");
		
		FileHandler.copy(source, destination);

	}

}
