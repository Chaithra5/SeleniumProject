package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSec8 {
     static {
    	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
     }
	public static void main(String[] args) {
          WebDriver driver =new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIzr-0pu_14wIVww0rCh30igTlEAAYASAAEgL-6vD_BwE");
	        WebElement ele1 = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
          Actions action =new Actions(driver);
	        action.moveToElement(ele1).perform();
	        driver.findElement(By.xpath("//span[text()='Kadas']")).click();
	        driver.findElement(By.xpath("//img[@alt='The Alok Kada For Him']")).click();
	        driver.findElement(By.xpath(" //span[@class='size-box-overlay']")).click();
	     WebElement balsize = driver.findElement(By.xpath(" //span[text()='2-2(2 2/16\")']"));
	                     String sizetxt = balsize.getText();
	                     System.out.println("banglw size : "+sizetxt);
	                     balsize.click();
	      driver.findElement(By.id("buy-now")).click();   
	      WebElement cartsize = driver.findElement(By.xpath("//span[@class='size-box-overlay']"));
	        String sizetxt1 = cartsize.getText();
	        System.out.println("Cart page size : "+sizetxt1);
	        cartsize.click();
	            if(sizetxt.equals(sizetxt1))  
	            {
	            	System.out.println("selected size and cart page bangle size equal ");
	            }
	}

}
