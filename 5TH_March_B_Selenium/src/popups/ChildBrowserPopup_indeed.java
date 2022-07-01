package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup_indeed 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://secure.indeed.com/auth");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("login-google-button")).click();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.close();
		
		String IDofMainPage = driver.getWindowHandle();
		System.out.println("Main Page ID is: "+IDofMainPage);
		
		Set<String> Allids = driver.getWindowHandles();
		
		ArrayList<String> arr=new ArrayList<>(Allids);
		
		for(int i=0;i<=arr.size()-1;i++)
		{
			System.out.println(arr.get(i));
		}
	
		String MainID = arr.get(0);
		String ChildID=arr.get(1);
		
		driver.switchTo().window(ChildID);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		driver.findElement(By.partialLinkText("Help")).click();
		Thread.sleep(1000);
		driver.quit();
	
		driver.switchTo().window(MainID);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}
	
	

}
