package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example5_W3Schools 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table//tbody//th"));
		
		int NoofRows = rows.size();
		int NoOfCols = cols.size();
		
		System.out.println("Number of rows  in a Table : "+NoofRows);
		System.out.println("Number of Colums in a Table : "+NoOfCols);
		
		for(int i=1;i<=NoofRows;i++)
		{
			for(int j=1;j<=NoOfCols;j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" || ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" || ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
