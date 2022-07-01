package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup_skpatro 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewWindow")).click();
		String IDofMainPage = driver.getWindowHandle();  
		System.out.println("Main Page is: "+IDofMainPage);

		//all ids are received in set
		Set<String> Allids = driver.getWindowHandles();
		
		//set need to convert into ArrayList
		ArrayList<String> ar=new ArrayList<>(Allids);
		
		System.out.println("*******All Page ids are as follow*******");
		for(int i=0;i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		
		String MainPageID = ar.get(0);
		String ChildPageID = ar.get(1);
		
		//to switch to child page
		driver.switchTo().window(ChildPageID);   //here selenium focus switched to child page
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("the7-search")).sendKeys("Selenium");
		driver.findElement(By.xpath("//a[@class='submit']")).click();
		Thread.sleep(1000);
		driver.close(); // will close only current open tab
		//driver.quit(); // will close all windows open by selenuim in current session
		
		driver.switchTo().window(MainPageID); //Here Selenium Focus Switched to Main Page
		//driver.switchTo().window(ar.get(0));
		Thread.sleep(1000);
		
		driver.findElement(By.name("NewTab")).click();
		
		
		
		
		Thread.sleep(1000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
