

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class AvoidNPE_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis= new FileInputStream("./Software/Test1.xlsx");
	       Workbook wbook = WorkbookFactory.create(fis);
	       Sheet sh = wbook.getSheet("Sheet5");
	       sh.getRow(16);
	       
	       System.out.println(sh.getPhysicalNumberOfRows());
	      
	       FileOutputStream fos=new FileOutputStream("./Software/Test1.xlsx");
	       wbook.write(fos);
	       fos.close();
	       fis.close();
	      wbook.close();
	}

}
