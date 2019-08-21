package Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneSec10 {
	 static {
    	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
     }
	public static void main(String[] args) throws InterruptedException {
          WebDriver driver =new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIzr-0pu_14wIVww0rCh30igTlEAAYASAAEgL-6vD_BwE");
	    Thread.sleep(2000);
          driver.findElement(By.xpath("//div[@dir=\"ltr\"]//p[text()='CHAT with our experts !']")).click();
	driver.findElement(By.id("name")).sendKeys("supritha");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chaithra.t.kota@gmail.com");
	driver.findElement(By.id("name_146917605549304831")).sendKeys("6573874593");
}
}