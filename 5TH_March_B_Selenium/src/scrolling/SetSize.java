package scrolling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/");
		
		System.out.println(driver.manage().window().getSize());

		//To set size--> use Dimension class and create object of Dimension class
		
		Dimension d=new Dimension(1200, 600);
		
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
	}

}
