import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame1 {

	static {
		System.setProperty("webdriver.chrome.driver",  "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("file:///C:/Users/User/Documents/s1.html");
WebElement t1 = driver.findElement(By.id("t1"));
Thread.sleep(1000);
t1.sendKeys("TestYantra");
driver.switchTo().frame(driver.findElement(By.id("f1")));///switch to child
WebElement t2 = driver.findElement(By.id("t2"));
Thread.sleep(1000);
t2.sendKeys("TY");
driver.switchTo().parentFrame();///switch to immediate frame
//driver.switchTo().defaultContent();///switch to descendant to grand parent
Thread.sleep(1000);
t1.clear();
Thread.sleep(1000);
t1.sendKeys("Software");

	}

}
