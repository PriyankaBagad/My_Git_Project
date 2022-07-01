package Mock;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollingAndScreenShot 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(100);
		
		//Scrolling Down
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("window.scrollBy(10,200)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(10,1000)");
		Thread.sleep(1000);
		
		//Taking Screenshot
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Destination=new File("E:\\Automation Testing\\ScreenShot\\MockExmaple.jpg");
		FileHandler.copy(Source, Destination);
	}

}
