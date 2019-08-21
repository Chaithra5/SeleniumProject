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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoDataDriven1 {

	public static void main(String[] args)
			throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException {
		System.out.println(System.getProperty("user.dir"));//entire path is taking
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"/Test1.xlsx");
		Workbook wbook = WorkbookFactory.create(fis);
		/*Sheet sh = wbook.getSheet("Sheet1");
		   
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < sh.getRow(i).getPhysicalNumberOfCells(); j++) {
				System.out.print(sh.getRow(i).getCell(j).getStringCellValue() + "\t");
			}
			System.out.println();
		}
		Row row = sh.createRow(2);
		row.createCell(0).setCellValue("tc02");
		row.createCell(1).setCellValue("fail");*/
		Sheet sh1 = wbook.createSheet("sheet5");
		FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"/Test1.xlsx");
		wbook.write(fos);
		fos.flush();
		fos.close();
		fis.close();
		wbook.close();
	}
}