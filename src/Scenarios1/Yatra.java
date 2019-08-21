package Scenarios1;

import java.awt.AWTException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yatra {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
   WebDriver driver= new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           driver.manage().window().maximize();
            driver.get("https://www.yatra.com");
            driver.findElement(By.name("flight_origin")).click();
            Actions action=new Actions(driver);
	       WebElement m1 = driver.findElement(By.xpath("//p[text()='Bangalore ']"));
	       action.moveToElement(m1).click().perform();
	       driver.findElement(By.name("flight_destination")).click();
	      WebElement m2 = driver.findElement(By.xpath("//p[text()='Chennai ']"));
	          action.moveToElement(m2).click().perform();
	              driver.findElement(By.id("BE_flight_origin_date")).click();
	              LocalDate date = LocalDate.now();
	              int month = date.getMonthValue();                  
	              int year = date.getYear();
	             int date1 = date.getDayOfMonth();
	             String str=date1+"/0"+month+"/"+year;
	             System.out.println(str);
	             driver.findElement(By.id(str)).click();
	              LocalDate rdate = date.plusDays(15);
	              int rmonth = rdate.getMonthValue();                  
	              int ryear = rdate.getYear();
	             int rdate1 = rdate.getDayOfMonth();
	             String rstr="0"+rdate1+"/0"+rmonth+"/"+ryear;
	             System.out.println(rstr);
	             driver.findElement(By.id("BE_flight_arrival_date")).click();
	             driver.findElement(By.id(rstr)).click();
	            
	             driver.findElement(By.xpath("//i[@class=\"icon icon-angle-right arrowpassengerBox\"]")).click();
	             Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[@class='ddSpinnerPlus']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//span[@id='childPax']/../..//span[@class='ddSpinnerPlus']")).click();
	     driver.findElement(By.xpath("//span[@id='infantPax']/../..//span[@class='ddSpinnerPlus']")).click();
	driver.findElement(By.xpath("//span[text()='Premium Economy']")).click();
	driver.findElement(By.id("BE_flight_flsearch_btn")).click();
	}

}
