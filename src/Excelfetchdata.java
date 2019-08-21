import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelfetchdata {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
   FileInputStream fis=new FileInputStream("./Software/Test1.xlsx");
   Workbook wb = WorkbookFactory.create(fis);
 // Sheet sh = wb.getSheet("Sheet1");
 /* Row row = sh.getRow(0);
  Cell cell = row.getCell(0);
  System.out.println(cell.getStringCellValue());*/
 /* System.out.println(sh.getPhysicalNumberOfRows());
  for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		for (int j = 0; j < sh.getRow(i).getPhysicalNumberOfCells(); j++) {
			System.out.print(sh.getRow(i).getCell(j).getStringCellValue() + "\t");
		}
		System.out.println();
		}*/
  Sheet sh = wb.createSheet("Sheet3");
   Row row = sh.createRow(4);
   row.createCell(0).setCellValue("chaithra");
   FileOutputStream fos=new FileOutputStream("./Software/Test1.xlsx");
   wb.write(fos);
   fos.close();
   fis.close();
  wb.close();
  
	}

}
