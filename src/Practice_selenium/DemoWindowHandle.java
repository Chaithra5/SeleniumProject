package Practice_selenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;

public class DemoWindowHandle {
	static {
	   	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    }
	  
	  @Test
	  public void test() throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
		  driver.navigate().to("https://www.naukri.com");
		   Set<String> wins = driver.getWindowHandles();
		   System.out.println(wins.size());
		   //only child window closing
		  // String parent = driver.getWindowHandle();
		  driver.close();
		 // wins.remove(parent);
//		  System.out.println("new size: "+wins.size());
//		   for(String twins:wins)
//		   {
//			   driver.switchTo().window(twins);
//			   String tittle = driver.getTitle();
//			   if(tittle.equals("Sierra Cedar")) {
//			   driver.close();}
//			   Thread.sleep(1000);
//		   }
//		   
		  // driver.quit();
	  }


}