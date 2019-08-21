import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeContextClick {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
WebElement p = driver.findElement(By.linkText("actiTIME Inc."));
Actions action =new Actions(driver);
Thread.sleep(1000);
action.contextClick(p).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
}
}