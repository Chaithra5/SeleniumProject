package Practice_selenium;

import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class TrainSelectClass {
	static {
   	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
    }
  
  @Test
  public void test() {
	  WebDriver driver=new ChromeDriver();
	  driver.navigate().to("https://www.easemytrip.com/railways/");
	  Select sel=new Select(driver.findElement(By.id("txtfromcity")));
	  sel.selectByVisibleText("Bengaluru- All Stations(SBC)");
	  
  }


}
