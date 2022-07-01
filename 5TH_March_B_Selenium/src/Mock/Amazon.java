package Mock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.get("https://www.amazon.in/");
	 
	 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mrf bat");
	 driver.findElement(By.id("nav-search-submit-button")).click();
 
	 driver.findElement(By.id("low-price")).sendKeys("500");
	 driver.findElement(By.id("high-price")).sendKeys("1000");
	 
	 driver.findElement(By.xpath("//span[@id='a-autoid-1']")).click();

	 WebElement value = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	 
	 System.out.println("Rs."+value.getText());
	 
	 
	}

}
