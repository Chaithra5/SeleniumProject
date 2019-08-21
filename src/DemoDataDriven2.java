import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoDataDriven2 {
	public static void main(String[] args)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		//System.out.println(System.getProperty("user.dir"));//entire path is taking
		FileInputStream fis = new FileInputStream("./software/Test1.xls");
		Workbook wbook = WorkbookFactory.create(fis);
		Sheet sh1 = wbook.createSheet("sheet5");
		//System.out.println(sh1.getSheetName());
		FileOutputStream fos=new FileOutputStream("./software/Test1.xls");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
}
}