package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Reading_Example2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File MyFile=new File("E:\\Software Testing\\Personal Information.xlsx");
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String result = WorkbookFactory.create(MyFile).getSheet("Sheet2").getRow(i).getCell(j).getStringCellValue();
				System.out.print(result+" || ");
			}
			System.out.println();
		}
	

	}

}
