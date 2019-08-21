package Scenarios1;

import java.awt.AWTException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruCaledar {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
  /*  WebDriver driver= new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   driver.manage().window().maximize();
    driver.get("http://demo.guru99.com/test/");
   WebElement datetime = driver.findElement(By.xpath("//input[@name='bdaytime']"));*/
     
     /* datetime.sendKeys("19102019");
       datetime.sendKeys(Keys.TAB);
       datetime.sendKeys("0335");
       driver.close();*/
		
        
  /*   LocalDate date = LocalDate.now();
         int month = date.getMonthValue();                  //printing date
         int year = date.getYear();
        int date1 = date.getDayOfMonth();
         System.out.println(year +" "+month +" "+date1);
         
         Date d= new Date();
        System.out.println("Date :"+d);                     //printing time
     DateFormat   h = new SimpleDateFormat("hh:mm");
    String t = h.format(d);
    
    System.out.println("time :"+t);
   datetime.sendKeys(date1+""+0+""+month+""+year);
        datetime.sendKeys(Keys.TAB);
        datetime.sendKeys(t);
         System.out.println("today+20 days :"+date.plusDays(20));*/
       
		 Date d= new Date();
	        System.out.println("Date :"+d);                     //printing time
	   SimpleDateFormat h = new SimpleDateFormat("hh:mm");
	    String t = h.format(d);
	    System.out.println(t);
        Calendar cal = Calendar.getInstance();
         cal.setTime(d);
         cal.add(Calendar.HOUR, 5);
       cal.add(Calendar.MINUTE,30);
       System.out.println(h.format(cal.getTime()));
	}
}
