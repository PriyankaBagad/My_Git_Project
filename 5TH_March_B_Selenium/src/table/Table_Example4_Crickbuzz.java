package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example4_Crickbuzz 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		
		List<WebElement> row = driver.findElements(By.xpath("//table//tbody"));
		List<WebElement> cols = driver.findElements(By.xpath("//table//thead"));
		
		int NoofRow = row.size();
		int NoOfCol = cols.size();
		
		System.out.println("No. of Rows: "+NoofRow);
		System.out.println("No. of Cols: "+NoOfCol);

		for(WebElement c:cols)
		{
			System.out.println(c.getText());
		}
		for(WebElement r:row)
		{
			System.out.println(r.getText());
		}

	}

}
