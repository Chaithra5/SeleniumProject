package Scenarios;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSec23 {
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
  WebElement metal = driver.findElement(By.xpath("//section[@id='Metal-form']"));
	               Actions action=new Actions(driver);
	               action.moveToElement(metal).perform();
	             WebElement platinumcount = driver.findElement(By.xpath("//form[@id='metal']//span[text()='(47)']"));
                    System.out.println(platinumcount.getText());
	  driver.close();
	}
}