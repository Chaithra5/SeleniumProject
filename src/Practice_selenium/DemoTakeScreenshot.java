package Practice_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class DemoTakeScreenshot {
	static {
	   	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    }
	  WebDriver driver;
  @Test
  public void main() throws IOException {
	  driver.get("https://www.easemytrip.com/railways/");
	  driver.findElement(By.xpath("//div[@class='emt_nav']//a[text()='Bus']")).click();
	  TakesScreenshot ts =(TakesScreenshot)driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
  File dst = new File("./photo/screenshot.png");
  FileUtils.copyFile(src, dst);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
