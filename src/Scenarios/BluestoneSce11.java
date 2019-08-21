package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSce11 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIs_m2j5vx4wIVVwQrCh1V1Q_WEAAYASAAEgIo0_D_BwE");
      driver.manage().window().maximize();
      WebElement offer = driver.findElement(By.xpath("//a[@title='Jewellery'][text()='Offers ']"));
             Actions action = new Actions(driver);
             action.moveToElement(offer).perform();
      driver.findElement(By.xpath("//span[@data-p='offers-flat5off,m']")).click();
     List<WebElement> ele = driver.findElements(By.xpath("//img[@class='hc img-responsive center-block']|//video[@class='bpvideo video-loaded']"));
         // System.out.println(ele.getClass().getName());
     if(ele.isEmpty())
          {
        	  System.out.println("Product list is NOT displayed");
          }else
          {
        	  System.out.println("Product list is  displayed");
          }
          driver.close();
	}
}
