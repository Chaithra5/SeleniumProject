package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSec26 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI3ZWnipf64wIVzoBwCh0P6QcVEAAYASAAEgLNyPD_BwE");
     driver.findElement(By.xpath("//input[@type='text']")).click();
     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rings");
     driver.findElement(By.xpath("//input[@value='Search']")).click();
            JavascriptExecutor js=(JavascriptExecutor)driver;
           for(int i=0;i<10;i++)
           {
        	   js.executeScript("window.scrollBy(0,500)");
        	   Thread.sleep(1000);
           }
          WebElement toparrow = driver.findElement(By.xpath("//a[@title='Back to Top']"));
	     if(toparrow.isDisplayed())
	     {
	    	 System.out.println("Top icon is displayed ");
	    	 toparrow.click();
	     }
	   Thread.sleep(1000);
	   driver.close();
	}
}