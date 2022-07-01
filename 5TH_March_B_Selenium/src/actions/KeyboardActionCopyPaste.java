package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionCopyPaste 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60));
		driver.get("https://textcompare.org/");
		
		WebElement textbox1 = driver.findElement(By.xpath("(//div[@class='view-line'])[1]"));
		WebElement textbox2 = driver.findElement(By.xpath("(//div[@class='view-line'])[2]"));
	
		//Input text/Select text/Copy text/Paste text
		Actions act=new Actions(driver);
		act.moveToElement(textbox1).sendKeys(textbox1, "This is random Text to Compare!!").click().build().perform(); //Input Text
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //Select Text
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform(); //Copy Text
		Thread.sleep(1000);
		act.moveToElement(textbox2).click().keyDown(Keys.CONTROL).sendKeys("v").build().perform();//Paste Text
	
	
	
	}

}
