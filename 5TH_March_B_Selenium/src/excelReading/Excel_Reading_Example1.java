package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Personal Information.xlsx");
		
		String name1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.print(name1+" ");
	
		String name2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(name2);
		
		boolean value1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(0).getBooleanCellValue();
		System.out.print(value1+" ");
		
		boolean value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getBooleanCellValue();
		System.out.println(value2);
		
		double num1 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
		System.out.print(num1+" ");
		
		double num2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		System.out.println(num2);
	
	}

}
