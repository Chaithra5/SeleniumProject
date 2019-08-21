import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragDRop {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
WebElement src = driver.findElement(By.xpath("//h1[text()='Block 3']"));
WebElement dst = driver.findElement(By.xpath("//h1[text()='Block 2']"));
Actions action =new Actions(driver);
Thread.sleep(1000);
action.dragAndDrop(src, dst).perform();
}
}