import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedownload {

static {
	System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
}
	public static void main(String[] args) throws AWTException, InterruptedException {
      WebDriver driver= new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.seleniumhq.org/download");
      driver.findElement(By.xpath("//a[@href='https://bit.ly/2TlkRyu']")).click();
      Robot r= new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      Thread.sleep(1000);
      r.keyPress(KeyEvent.VK_ENTER);
	}

}
