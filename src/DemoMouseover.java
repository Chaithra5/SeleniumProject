import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseover {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
   WebDriver driver= new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.urbanladder.com");
driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
WebElement m = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
Actions action =new Actions(driver);
Thread.sleep(1000);
action.moveToElement(m).perform();
Thread.sleep(1000);
String text = m.getText();
System.out.println(text);

}
}