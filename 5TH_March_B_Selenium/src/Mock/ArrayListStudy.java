package Mock;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListStudy 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		String c1="//input[@name='checkBoxOption1']";
		String c2="//input[@name='checkBoxOption2']";
		String c3="//input[@name='checkBoxOption3']";
		
		ArrayList<String> as=new ArrayList<String>();
		as.add(c1);
		as.add(c2);
		as.add(c3);
		as.add(null);
		System.out.println(as);

		WebElement ch1 = driver.findElement(By.xpath(c1));
		ch1.click();
		WebElement ch2 = driver.findElement(By.xpath(c2));
		ch2.click();
		WebElement ch3 = driver.findElement(By.xpath(c3));
		ch3.click();
		
//		Dimension d=new Dimension(700, 400);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(20, 20);
//		driver.manage().window().setPosition(p);
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("arguments[0].signIntoView()"+ch3);
		
		
	}
}
