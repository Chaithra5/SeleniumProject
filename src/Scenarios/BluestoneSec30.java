package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSec30 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI3ZWnipf64wIVzoBwCh0P6QcVEAAYASAAEgLNyPD_BwE");
     driver.findElement(By.xpath("//a[text()='10+1 Monthly Plan']")).click();
      driver.findElement(By.xpath("//input[@value='Start Now']")).click();
     WebElement amterror = driver.findElement(By.id("amount_error"));
	        System.out.println(amterror.getText());
	    WebElement emailerr = driver.findElement(By.id("Email_error"));
	           System.out.println(emailerr.getText());
	        if(amterror.isDisplayed()&&emailerr.isDisplayed())
	        {
	        	System.out.println("Error msg is displayed in both fields");
	        	driver.close();
	        }
	
	}
}