package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionStudy 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(8000));

		Actions act=new Actions(driver);
		WebElement textbox = driver.findElement(By.name("q"));
		
		//act.sendKeys(textbox, "Selenium").perform();
		
		//act.keyDown(textbox, Keys.SHIFT).sendKeys("selenium").build().perform();

		act.keyDown(textbox, Keys.SHIFT).sendKeys("s").keyUp(Keys.SHIFT).sendKeys("elenium").build().perform();
		
		//act.keyDown(textbox, Keys.SHIFT).sendKeys("SELENIUM").build().perform();
				
		
		
		
	}

}
