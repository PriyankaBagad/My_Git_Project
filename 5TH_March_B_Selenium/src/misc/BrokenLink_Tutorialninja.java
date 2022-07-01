package misc;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink_Tutorialninja 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tutorialsninja.com/demo/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int NoofLinks = links.size();
		System.out.println("Number of Links are present: "+NoofLinks);
		
		for(int i=0;i<=NoofLinks-1;i++)
		{
			WebElement lin = links.get(i);
			String url = lin.getAttribute("href");
			URL link=new URL(url);
			
			//Create a connection using URL object link
			HttpURLConnection httpconn=(HttpURLConnection)link.openConnection();
			Thread.sleep(1000);
			
			httpconn.connect(); //Establish connection
			
			int code = httpconn.getResponseCode(); //return response code
										//if response code => 400 -- Link is broken
			if(code>=400)
			{
				System.out.println(url+"=> "+"is broken link");
			}
			else
			{
				System.out.println(url+"=>"+"is valid link");
			}
			
			
			
			
		}

	}

}
