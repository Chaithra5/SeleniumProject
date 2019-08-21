package Practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DemoActionClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.urbanladder.com/");
	  driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
      WebElement m1 = driver.findElement(By.xpath("//li[@class=\"topnav_item bedroomunit\"]"));
	 WebElement m2 = driver.findElement(By.xpath("//a[text()='Mattresses']"));
      WebElement m3 = driver.findElement(By.xpath("//li[@class=\"subnav_item 3005\"]//span[text()='Mattress Beds']"));
	 WebElement context = driver.findElement(By.xpath("//a[text()=' Furniture Exchange ']"));
      Actions action=new Actions(driver);
	 Thread.sleep(1000);
      action.moveToElement(m1).moveToElement(m2).click().build().perform();
     //action.contextClick(context).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.RETURN).perform();
  
  
  }
}
