package Practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoFileupload {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/User/Documents/fileupload.html");
	  String path="C:\\Users\\User\\Pictures\\image.png";
	  driver.findElement(By.id("f1")).sendKeys(path);
  }
  
}
