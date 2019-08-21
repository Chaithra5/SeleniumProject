import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDEmodragdrop {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://jqueryui.com/");
driver.findElement(By.xpath("//a[text()='Droppable']")).click();
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
WebElement src = driver.findElement(By.id("draggable"));
WebElement dst = driver.findElement(By.id("droppable"));
Actions action=new Actions(driver);
action.dragAndDrop(src, dst).perform();
}
}