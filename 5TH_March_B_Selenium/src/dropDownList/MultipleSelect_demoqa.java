package dropDownList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect_demoqa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(100);
		//driver.manage().window().maximize();
		
		WebElement multiselect = driver.findElement(By.name("cars"));
		
		//1. create object of select class
		Select s=new Select(multiselect);
		
		//2. check is Multiple
		s.isMultiple();
		boolean result = s.isMultiple();
		System.out.println("isMultiple result is: "+result);
		
		s.selectByIndex(0);
		Thread.sleep(100);
		
		s.selectByValue("saab");
		//s.selectByIndex(1);
		Thread.sleep(100);
		
		s.selectByVisibleText("Opel");
		//s.selectByIndex(2);
		//Thread.sleep(100);
		s.selectByIndex(3);
		Thread.sleep(500);
		
		//how to de-select
		//s.deselectAll();	// can be used only for multiple selectable
		
		//s.deselectByIndex(2);
		//s.deselectByValue("saab");
		//s.deselectByVisibleText("Volvo");
		
		Thread.sleep(500);
		System.out.println(s.getFirstSelectedOption().getText());
		
		WebElement FirstWebElement = s.getFirstSelectedOption();
		String FirstText = FirstWebElement.getText();
		System.out.println("First Selected option is: "+FirstText);
		
		
		System.out.println(s.getAllSelectedOptions().size());
		
		for(int i=0;i<=s.getAllSelectedOptions().size()-1;i++)
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
		

	}

}
