package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotByDate 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//String random=RandomString.make(2);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 
		LocalDateTime now = LocalDateTime.now();  
		 
		String result = dtf.format(now);
		 
		System.out.println(result); 
		Thread.sleep(100);
		File Destination=new File("E:\\Automation Testing\\ScreenShot\\Image"+result+".jpg");
		
		FileHandler.copy(Source, Destination);
		
		
		
		
		  
	}

}
