package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionStudy1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));
		
		Actions act=new Actions(driver);
		WebElement sale = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		//1st way
		//act.moveToElement(sale).perform(); //Click on link
		
		//2nd way
		//act.moveToElement(sale).click().build().perform();
		
		//3rd way
		act.click(sale).perform();
		
		WebElement Sel = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		//act.click(Sel).perform();		
		
		act.contextClick(Sel).perform(); //right click on link		

	}

}
