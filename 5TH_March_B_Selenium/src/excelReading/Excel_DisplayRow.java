package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_DisplayRow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Group A Mock Result.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet2");
				
		int TotalRowCount = MySheet.getLastRowNum();
		System.out.println(TotalRowCount);
		
		

	}

}
