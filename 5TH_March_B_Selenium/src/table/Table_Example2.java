package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		//to know how many rows are there in table
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNumberRows = rows.size();
		System.out.println("Total number of rows: "+TotalNumberRows);
		
		for(WebElement r:rows)
		{
			System.out.println(r.getText()+" || ");
		}
		
		//to know how many columns are there in table
		List<WebElement> columns = driver.findElements(By.xpath("//th"));
		int TotalNumberColumns = columns.size();
		System.out.println("Total number of column: "+TotalNumberColumns);

		for(WebElement c:columns)
		{
			System.out.println(c.getText()+" || ");
		}
		
		

	}

}
