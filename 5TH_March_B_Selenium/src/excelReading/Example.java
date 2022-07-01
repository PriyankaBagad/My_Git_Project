package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example 
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
				
				if(type==CellType.STRING)
				{
					System.out.print(Cell.getStringCellValue()+" || ");
				}
				else if(type==CellType.BOOLEAN)
				{
					System.out.print(Cell.getBooleanCellValue()+" || ");
				}
				else if(type==CellType.NUMERIC)
				{
					System.out.print(Cell.getNumericCellValue()+" || ");
				}
				else if(type==CellType.BLANK)
				{
					System.out.print("NULL"+" || ");
				}			
			}
			System.out.println();
		}
		
		
				
	}

}
