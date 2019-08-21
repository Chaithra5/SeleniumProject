import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoJavascriptExecutor2 {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.urbanladder.com");
driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(1000);
js.executeScript("window.scrollBy(0,-500)");
Thread.sleep(1000);
}
}