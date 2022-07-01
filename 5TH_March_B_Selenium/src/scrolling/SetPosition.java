package scrolling;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/");
		
		System.out.println(driver.manage().window().getSize());
		
		//To set Position--> use Point class and create object of Point class
		Point p=new Point(500, 500);
		
		driver.manage().window().setPosition(p);
		
		

	}

}
