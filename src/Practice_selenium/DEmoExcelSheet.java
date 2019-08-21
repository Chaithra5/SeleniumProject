package Practice_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DEmoExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream  fis=new FileInputStream("./photo/Test2.xlsx");
		   Workbook wbook = WorkbookFactory.create(fis);
		 Sheet sheet = wbook.getSheet("Sheet1");
//               for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
//               {
//            	   for(int j=0;j<sheet.getRow(i).getPhysicalNumberOfCells();j++)
//            	   {
//            		   System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
//            	   }
//            	   System.out.println();
//               }
               Sheet sh1 = wbook.createSheet("chaithra");
	                 sh1.createRow(0).createCell(0).setCellValue("jhdfjj");
	   FileOutputStream fos= new   FileOutputStream("./photo/Test2.xlsx");
	  wbook.write(fos);
	  fos.close();
	  fis.close();
	  wbook.close();
	}
}
