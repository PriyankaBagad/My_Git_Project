package waitInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit_Wait 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(5000));
		
		WebElement SignInButton = driver.findElement(By.name("login"));
		w.until(ExpectedConditions.visibilityOf(SignInButton));
		SignInButton.click();

		//driver.close();

	}

}
