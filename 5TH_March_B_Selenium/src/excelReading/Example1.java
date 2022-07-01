package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Group A Mock Result.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
				
		int TotalRowCount = MySheet.getLastRowNum();
		System.out.println(TotalRowCount);
		
		int TotalCellCount = MySheet.getRow(0).getLastCellNum()-1;
		System.out.println(TotalCellCount);
		
		for(int i=0;i<=TotalRowCount;i++)
		{
			for(int j=0;j<=TotalCellCount;j++)
			{
				Cell Cell = MySheet.getRow(i).getCell(j);
				CellType type = Cell.getCellType();
				switch (type) 
				{
					case STRING : 	System.out.print(Cell.getStringCellValue()+" | ");
							 		break;
					case NUMERIC :	System.out.print(Cell.getNumericCellValue()+" | ");	
									break;
					case BOOLEAN :	System.out.print(Cell.getBooleanCellValue()+" | ");
									break;
					case BLANK : 	System.out.print("=="+" | ");
									break;
					default:		break;
				}
			}
			System.out.println();
		}	
	}
}
