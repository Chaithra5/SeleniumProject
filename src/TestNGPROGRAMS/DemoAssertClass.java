package TestNGPROGRAMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssertClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
  @Test
  public void test1() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  String actual = driver.getTitle();
	  String expected="Invalid";
	  Assert.assertEquals(actual, expected);
	  driver.close();
  }
  @Test
  public void test2() {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  String actual = driver.getTitle();
	  String expected="Invalid";
	  SoftAssert soft=new SoftAssert();
	  Assert.assertEquals(actual, expected);
	  driver.close();
	  
  }
}
