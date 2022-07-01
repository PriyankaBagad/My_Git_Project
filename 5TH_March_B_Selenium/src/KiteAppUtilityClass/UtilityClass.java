package KiteAppUtilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilityClass 
{
	public static String readDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File myFile=new File("E:\\Selenium\\KiteZerodaLogin.xlsx");
		
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		
		String myValue = mySheet.getRow(row).getCell(cell).getStringCellValue();
		
		return myValue;		
	}
	
	public static void takeScreenShot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String random=RandomString.make(3);
		
		File dest=new File("E:\\Automation Testing\\ScreenShot\\POMScreenShot"+random+".jpg");
		
		FileHandler.copy(source, dest);
		
		
	}

}
