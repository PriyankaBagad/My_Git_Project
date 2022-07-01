package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_Demoqa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Switch to frame1
		driver.switchTo().frame("frame1");
		
		//switch to frame2
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		
		//Get Text of frame2
		WebElement FrameText2 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
	    String text2 = FrameText2.getText();
		System.out.println("Frame2 Text is: "+text2);
		
		//Switch to frame1
		driver.switchTo().parentFrame();
		WebElement FrameText1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String text1 = FrameText1.getText();
		System.out.println("Frame1 Text is: "+text1);
		
		//Switch to main page
		driver.switchTo().defaultContent();
		WebElement maintext = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
		String text = maintext.getText();
		System.out.println("Main Page Text is: "+text);
		
	}

}
