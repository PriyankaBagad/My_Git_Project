package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Example3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Personal Information.xlsx");
		
	    Workbook book = WorkbookFactory.create(MyFile);
	    Sheet sheet = book.getSheet("Sheet3");
	    Row row = sheet.getRow(0);
	    Cell col = row.getCell(0);
	    CellType type = col.getCellType();
	    System.out.println(type);
	    String value = col.getStringCellValue();
	    System.out.println(value);
	
	}

}
