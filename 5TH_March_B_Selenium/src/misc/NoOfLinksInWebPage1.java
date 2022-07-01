package misc;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksInWebPage1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("=================================");
		System.out.println("No. of Links are Present on WebPage: "+links.size());
		
		//print all links using iterator
		System.out.println("==================================");
		System.out.println("Links name: ");
		Iterator<WebElement> it = links.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		
		
		
	}

}
