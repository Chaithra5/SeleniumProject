import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetMethods {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
      FileInputStream fis=new FileInputStream("./Software/Test1.xlsx");
       Workbook wb = WorkbookFactory.create(fis);
       
       System.out.println("Number of sheets : "+wb.getNumberOfSheets());
         /*     for(int i=0;i<wb.getNumberOfSheets();i++)
              {
            	  System.out.println(wb.getSheetName(i));
            	 Sheet sh = wb.getSheetAt(i);
             for(int j=0;j<sh.getPhysicalNumberOfRows();j++)
             {
            	 for(int k=0;k<sh.getRow(j).getPhysicalNumberOfCells();k++)
            	 {
            		 System.out.print(sh.getRow(j).getCell(k).getStringCellValue()+"\t");
            		// System.out.println(sh.getRow(j).getCell(k).getNumericCellValue());

            	 }
            	 System.out.println();
             }
             System.out.println("**************");
	}*/
       
       ///reverse sheet name
       for(int i=wb.getNumberOfSheets()-1;i>=0;i--)
       {
    	   System.out.println(wb.getSheetName(i));
       }
	}
}
