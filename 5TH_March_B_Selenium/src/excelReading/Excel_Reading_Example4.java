package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Example4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Personal Information.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		int TotalNumofRow = MySheet.getLastRowNum();
		System.out.println("Total No. of Rows are : "+TotalNumofRow);
		
		short NoofCol = MySheet.getRow(0).getLastCellNum();
		int TotalNumofcol = NoofCol-1;
		System.out.println("Total No. of Colums are : "+TotalNumofcol);

		//Static coding Display Whole Table
		System.out.println("===========================");
		System.out.println("********Static coding*********");
		for(int i=0;i<=7;i++)
		{
			for(int j=0;j<=6;j++)
			{
			   String value = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" || ");	
			}
			System.out.println();
		}
		
		//Dynamic coding Display Whole Table
		System.out.println("============================");
		System.out.println("*********Dynamic Coding********");
		for(int i=0;i<=TotalNumofRow;i++)
		{
			for(int j=0;j<=TotalNumofcol;j++)
			{
				String value1 = MySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+" || ");
			}
			System.out.println();
		}
		

	}

}
