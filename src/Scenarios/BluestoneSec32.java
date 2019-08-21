package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSec32 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI3ZWnipf64wIVzoBwCh0P6QcVEAAYASAAEgLNyPD_BwE");
          driver.findElement(By.xpath("//a[text()='Visit Our Stores']")).click();
          List<WebElement> location = driver.findElements(By.xpath("//div[@class='store-location']"));
	 int count=0;
          for(WebElement newloc:location)
	  {
		  System.out.println(newloc.getText());
		  count++;
	  }
          System.out.println();
          System.out.println("Total location : "+count);
          driver.close();
	
	}
}