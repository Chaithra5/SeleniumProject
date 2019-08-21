package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSec25 {
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
  WebElement gen = driver.findElement(By.id("Gender-form"));
	               Actions action=new Actions(driver);
	               action.moveToElement(gen).perform();
	             WebElement women = driver.findElement(By.xpath("//span[text()=' Women ']"));
                  women.click();
                  WebElement womencount = driver.findElement(By.xpath("//span[@class='total-designs']"));
	  System.out.println(womencount.getText());
                  driver.close();
	}
}
