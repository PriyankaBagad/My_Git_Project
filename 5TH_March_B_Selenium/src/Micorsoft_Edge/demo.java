package Micorsoft_Edge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class demo 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "E:\\Selenium\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		

	}

}
