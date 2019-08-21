import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeRobot {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
      WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.navigate().to("https://demo.actitime.com/login.do");
      driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
      Thread.sleep(1000);
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(1000);
      r.keyPress(KeyEvent.VK_ENTER);
      Thread.sleep(1000);
      driver.navigate().back();
	}

}
