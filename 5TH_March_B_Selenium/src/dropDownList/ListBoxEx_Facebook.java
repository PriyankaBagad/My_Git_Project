package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxEx_Facebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Priyanka");
		
		driver.findElement(By.name("lastname")).sendKeys("Bagad");
		
		driver.findElement(By.name("reg_email__")).sendKeys("priyanka@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("888888888");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("priyanka@gmail.com");
		
		//Selecting Day
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(day);
		
		//3.By using one of the select class methods we can select values form list box like 
		//i. selectByVisibleText: selectByVisibleText(String arg0) 
		//ii.selectByIndex: selectByIndex(int arg0) 
		//iii. selectByValue: selectByValue(String arg0)
		
		s.selectByVisibleText("2");
		s.selectByIndex(3);
		s.selectByValue("6");
		
		for(int i=0;i<6;i++)
		{
			Thread.sleep(1000);
			s.selectByIndex(i);
		}
		boolean result = s.isMultiple();
		System.out.println("isMultiple Selection is :"+result);
		//Selecting month
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("6");
		
		//Selecting Year
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByIndex(35);
		
		//Select Gender
		driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		
		//Submit Button
		driver.findElement(By.name("websubmit")).click();
		
	}

}
