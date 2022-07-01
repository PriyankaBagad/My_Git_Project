package popups;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopupUsingIterator 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		 driver.findElements(By.tagName("input"));
		
		Set<String> allids = driver.getWindowHandles();	
		
		for(String al:allids)
		{
			System.out.println(al);
		}
		
		
//		Iterator<String> it = allids.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		
	}

}
