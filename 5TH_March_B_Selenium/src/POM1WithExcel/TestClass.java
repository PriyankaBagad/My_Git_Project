package POM1WithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File MyFile=new File("E:\\Software Testing\\Group A Mock Result.xlsx");
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		String UserName = MySheet.getRow(1).getCell(0).getStringCellValue();
		String Password = MySheet.getRow(1).getCell(1).getStringCellValue();
		String Pin1 = MySheet.getRow(1).getCell(2).getStringCellValue();
		
		KiteLoginPage Login = new KiteLoginPage(driver);
		Login.sendUserID(UserName);
		Login.sendPassword(Password);
		Login.ClickOnLoginButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage Pin = new KitePinPage(driver);
		Pin.sendPin(Pin1);
		Pin.ClickOnContinueButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		KiteHomePage Home = new KiteHomePage(driver);
		Home.ClickOnUserID(UserName);
		Home.ClickOnLogoutButton();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.quit();
		
		
		
		
	}

}
