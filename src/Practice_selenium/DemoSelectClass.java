package Practice_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DemoSelectClass {
	static {
	   	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    }
	  WebDriver driver;
  @Test
  public void main() throws InterruptedException {
	  driver.get("file:///C:/Users/User/Documents/multiselect.html");
		 Select sel= new Select(driver.findElement(By.id("Vehicle")));
		 sel.selectByIndex(1);
		 sel.selectByIndex(3);
		 sel.selectByIndex(4);
		// sel.selectByValue("r");
		 sel.selectByVisibleText("Bus");
		 Thread.sleep(1000);
		 //sel.deselectByIndex(1);
		// sel.deselectByVisibleText("Tractor");
		// sel.deselectAll();
            List<WebElement> all = sel.getAllSelectedOptions();
            for(WebElement nall:all)
            {
            	System.out.println(nall.getText());
            	String ele = nall.getText();
//            	if(ele.equals("Bike"))
//            	{
//            		sel.deselectByVisibleText("Bike");
//            	}
            }
            if(sel.isMultiple())
            {
            	System.out.println("Multiple option slected");
            	sel.deselectAll();
            }
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
