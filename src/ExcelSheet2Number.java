import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet2Number {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
       FileInputStream fis= new FileInputStream("./Software/Test1.xlsx");
       Workbook wbook = WorkbookFactory.create(fis);
       Sheet sh = wbook.getSheet("Sheet2");
       for(int i=1;i<sh.getPhysicalNumberOfRows();i++)
       {
    	   double sum=0;double mul=1;float avg=0;
    	  int t = sh.getRow(0).getPhysicalNumberOfCells()/2;
    	   for(int j=0;j<sh.getRow(i).getPhysicalNumberOfCells()/2;j++)
    	   {
    	double n1 = sh.getRow(i).getCell(j).getNumericCellValue();
    	sum  =sum+n1;
    	mul=mul*n1;
    	System.out.println(sum+"****"+mul);
    	   }
   		sh.getRow(i).getCell(2).setCellValue(sum);
   		sh.getRow(i).getCell(3).setCellValue(mul);
   	sh.getRow(i).getCell(4).setCellValue(sum/2);
System.out.println();
       }
       FileOutputStream fos=new FileOutputStream("./Software/Test1.xlsx");
       wbook.write(fos);
       fos.close();
       fis.close();
      wbook.close();
	}

}
