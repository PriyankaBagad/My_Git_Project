package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		WebElement text = driver.findElement(By.xpath("(//td[text()='Velocity Trainers'])[1]"));
		System.out.println(text.getText());
		
		List<WebElement> tableheader = driver.findElements(By.xpath("//table//th"));
		for(WebElement header:tableheader)
		{
			System.out.print(header.getText()+" || ");
		}
		
		System.out.println();
		List<WebElement> row7 = driver.findElements(By.xpath("//table//tr[7]"));
		for(WebElement r:row7)
		{
			System.out.println(r.getText()+" || ");
		}

	}

}
