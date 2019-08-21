package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
      driver.manage().window().maximize();
         driver.get("https://in.bookmyshow.com/mumbai");
         driver.findElement(By.id("spnSelectedRegion")).click();
         driver.findElement(By.xpath("//a[@onclick=\"BMS.Region.fnSTopReg('BANG','Bengaluru');\"]										")).click();;
	    driver.findElement(By.xpath("//img[@alt='Kurukshetra (Kannada)']")).click();
	    driver.findElement(By.xpath("//a[text()='Book Tickets']")).click();
	    driver.findElement(By.xpath("//a[text()='3D']")).click();
	    driver.findElement(By.xpath("//a[@data-date-time=\"04:15 PM\"]			")).click();
	   driver.findElement(By.id("btnPopupAccept")).click();
	driver.findElement(By.id("pop_3")).click();
	driver.findElement(By.id("proceed-Qty")).click();
	driver.findElement(By.id("A_12_11")).click();
	driver.findElement(By.id("btmcntbook")).click();
	}

}
