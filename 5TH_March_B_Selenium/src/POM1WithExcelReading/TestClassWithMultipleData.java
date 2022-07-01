package POM1WithExcelReading;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassWithMultipleData 
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
		
		ArrayList<String> al=new ArrayList<String>();
		
		int TotalRow = MySheet.getLastRowNum();
		int TotalCell = MySheet.getRow(TotalRow).getLastCellNum();
						
		for(int i=1;i<=TotalRow;i++)
		{
			for(int j=0;j<=TotalCell-1;j++)
			{
				String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				al.add(value);
			}
			
			KiteLoginPage Login = new KiteLoginPage(driver);
			Login.sendUserID(al.get(0));
			Login.sendPassword(al.get(1));
			Login.ClickOnLoginButton();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
			KitePinPage Pin = new KitePinPage(driver);
			Pin.sendPin(al.get(2));
			Pin.ClickOnContinueButton();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			KiteHomePage Home = new KiteHomePage(driver);
			Home.ClickOnUserID(al.get(0),i);
			Home.ClickOnLogoutButton();
		
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
			
			KiteChangePage Change=new KiteChangePage(driver);
			Change.ClickOnChangeUser();
		}
		driver.quit();
	}
}
