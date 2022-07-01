package zeroda;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite_WithExcel_Example2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		File MyFile=new File("E:\\Software Testing\\Group A Mock Result.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String UN = MySheet.getRow(1).getCell(0).getStringCellValue();		
		String PWD = MySheet.getRow(1).getCell(1).getStringCellValue();
		String PIN = MySheet.getRow(1).getCell(2).getStringCellValue();
		
		WebElement UserId = driver.findElement(By.id("userid"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UserId.sendKeys(UN);
		Password.sendKeys(PWD);
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		WebElement Pin = driver.findElement(By.id("pin"));
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		Pin.sendKeys(PIN);
		ContinueButton.click();
		
		WebElement UserID1 = driver.findElement(By.xpath("//span[text()='GP8097']"));
		String ActualResult = UserID1.getText();
		String ExpectedResult = UN;
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Userid is Matching and TC is Passed");
		}
		else
		{
			System.out.println("Userid is not Matching and TC is Failed");
		}
		
		UserID1.click();
		driver.findElement(By.xpath("//a[@target='_self']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		
		driver.quit();


	}

}
