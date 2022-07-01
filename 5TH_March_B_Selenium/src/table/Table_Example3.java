package table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_Example3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");

		List<WebElement> NoOfRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> NoOfCols = driver.findElements(By.xpath("//th"));
		
		int TotalNoOfRows = NoOfRows.size();
		int TotalNoOfCols = NoOfCols.size();
		
		System.out.println("Total No of Rows are : "+TotalNoOfRows);
		System.out.println("Total No of Cols are : "+TotalNoOfCols);
		
		for(int i=1;i<=TotalNoOfRows;i++)
		{
			for(int j=1;j<=TotalNoOfCols;j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();
					System.out.print(text+" || ");
				}
				else
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();
					System.out.print(text+" || ");	
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
