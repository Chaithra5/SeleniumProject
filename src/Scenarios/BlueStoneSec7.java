package Scenarios;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class BlueStoneSec7 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIs_m2j5vx4wIVVwQrCh1V1Q_WEAAYASAAEgIo0_D_BwE");
      driver.manage().window().maximize();
      WebElement ele = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        driver.findElement(By.xpath("//a[text()='Kadas']")).click();
        driver.findElement(By.xpath("//img[@alt='The Alok Kada For Him']")).click();
        driver.findElement(By.id("buy-now")).click();
        WebElement txt = driver.findElement(By.xpath("//div[text()='* This field is required']"));       
       if(txt.isDisplayed())
       {
    	   System.out.println("Error msg is displayed ");
       }
       else {
    	   System.out.println("Error msg not displayed");
    	   Assert.fail();
       }
       Thread.sleep(500);
       driver.close();
	}
}