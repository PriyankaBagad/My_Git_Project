package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.findElement(By.name("q")).sendKeys("Bangalore places to visit");
		
		List<WebElement> SearchResult = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement Search:SearchResult)
		{
			System.out.println(Search.getText());
		}
		
		String ExpectedResult = "bangalore places to visit in one day";
		
		for(WebElement Result:SearchResult)
		{
			String ActualResult = Result.getText();
			if(ActualResult.equals(ExpectedResult))
			{
				Result.click();
				break;
			}		
		}
		
		//driver.findElement(By.linkText("News")).click();
		driver.findElement(By.partialLinkText("Ne")).click();
	
		

	}

}
