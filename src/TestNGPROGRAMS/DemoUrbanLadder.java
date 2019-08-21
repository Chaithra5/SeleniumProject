package TestNGPROGRAMS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoUrbanLadder {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
  @Test
  public void Test() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.urbanladder.com/chest-of-drawers?src=slide4_homepage_02082019");
	  driver.findElement(By.xpath("//a[@data-gaaction='popup.auth.close']")).click();
	  List<WebElement> count = driver.findElements(By.xpath("//div[@id='topnav_wrapper']//span[@class='topnav_itemname']"));
	  FileInputStream fis= new FileInputStream("./Software/Test2.xlsx");
	   Workbook wbook = WorkbookFactory.create(fis);
	   Sheet sh = wbook.getSheet("Sheet1");
	   Actions action = new Actions(driver);
	   int t=0;
	   for(int i=0;i<count.size();i++)
	   {
		  WebElement move = count.get(i);
		  Thread.sleep(1000);
		  action.moveToElement(move).perform();
		  String text1 = count.get(i).getText();
		  System.out.println(text1);
		  Thread.sleep(1000);
	List<WebElement> sub = driver.findElements(By.xpath("//div[@id='topnav_wrapper']//li/span[contains(text(),'"+count.get(i).getText()+"')]/..//div[@class='subnavlist_wrapper clearfix']//span"));
		for(int k=0;k<sub.size();k++)
		{
			String stext = sub.get(k).getText();
			System.out.println(stext);
			sh.createRow(t).createCell(0).setCellValue(stext);
			String actual = sh.getRow(t).getCell(0).getStringCellValue();
			sh.createRow(t).createCell(1).setCellValue(actual);
			String expected = sh.getRow(t).getCell(1).getStringCellValue();
			System.out.println("PASSSSSSSSSS");
			  Thread.sleep(1000);
			t++;
		}
	   }
	  
	 FileOutputStream fos=new FileOutputStream("./Software/Test2.xlsx");
	  wbook.write(fos);
	  fos.close();
	  fis.close();
	  wbook.close();
  }
  }

