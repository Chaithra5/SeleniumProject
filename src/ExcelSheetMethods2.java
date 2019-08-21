import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetMethods2 {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis= new FileInputStream("./Software/Test1.xlsx");
	       Workbook wbook = WorkbookFactory.create(fis);
	       Sheet sh = wbook.getSheet("Sheet4");
	       int val=10;
	       Row r=null;
	       if(sh!=null)
	       {
	    	 r= sh.getRow(16);
	    	   System.out.println(sh.getRow(16));
	    	   if(r==null)
	    	   {
	    		   System.out.println(sh.createRow(16));;
	    	   }
	    	   Cell c=null;
	    	   for(int i=0;i<5;i++)
	    	   {
	    		  c= r.getCell(i);
	    		   if(c==null)
	    			   r.createCell(i);
	    		   c.setCellValue(val);
	    		   val++;
	    	   }
	       }
	       
	       
	       FileOutputStream fos= new FileOutputStream("./Software/Test1.xlsx");
         wbook.write(fos);
         fos.close();
         fis.close();
         wbook.close();
}
}