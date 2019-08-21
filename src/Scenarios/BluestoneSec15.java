package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSec15 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
       driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMI3ZWnipf64wIVzoBwCh0P6QcVEAAYASAAEgLNyPD_BwE");
       WebElement ele = driver.findElement(By.id("goldCoins"));
              Actions action=new Actions(driver);
              action.moveToElement(ele).perform();
       driver.findElement(By.xpath("//span[@data-p='gold-coins-weight-2gms,m']")).click();
         WebElement coinimg = driver.findElement(By.xpath("//img[@alt='2 gram 24 KT Gold Coin']"));
       if(coinimg.isDisplayed())
       {
    	   System.out.println("Coin is displaying");
       }
       Thread.sleep(1000);
       driver.close();
	}

}
