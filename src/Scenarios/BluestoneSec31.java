package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSec31 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI3ZWnipf64wIVzoBwCh0P6QcVEAAYASAAEgLNyPD_BwE");
     driver.findElement(By.xpath("//a[text()='10+1 Monthly Plan']")).click();
      driver.findElement(By.id("amount")).sendKeys("1000");
      driver.findElement(By.id("Email")).sendKeys("chaithra.t.kota@gmail.com");
     driver.findElement(By.xpath("//input[@value='Start Now']")).click();
     driver.findElement(By.xpath("//label[text()='Mobile']")).click();
     driver.findElement(By.xpath("//label[text()='Mobile']")).sendKeys("9741421714");
     driver.findElement(By.id("fullname")).sendKeys("Supritha");
     driver.findElement(By.id("address")).sendKeys("BTM Layout");
     driver.findElement(By.xpath("postcode_delivery")).sendKeys("576029");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@type='submit']")).click();
     // driver.close();

}
}