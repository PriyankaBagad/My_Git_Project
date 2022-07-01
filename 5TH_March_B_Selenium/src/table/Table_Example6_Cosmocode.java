package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example6_Cosmocode 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table//td"));
		
		int Noofrows = rows.size();
		int Noofcols = cols.size();
		
		System.out.println("No of Rows are : "+Noofrows);
		System.out.println("No.of Columns are : "+Noofcols);
		
		for(int i=1;i<=12;i++)
		{
			for(int j=1;j<=5;j++)
			{
				String text = driver.findElement(By.xpath("//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(text+" || ");

			}
			System.out.println();
		}
		

	}

}
