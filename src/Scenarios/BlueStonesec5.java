package Scenarios;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStonesec5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
      WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://www.bluestone.com/?utm_campaign=&utm_medium=cpc&utm_source=google&gclid=EAIaIQobChMIs_m2j5vx4wIVVwQrCh1V1Q_WEAAYASAAEgIo0_D_BwE");
      driver.manage().window().maximize();
    WebElement ele = driver.findElement(By.xpath("//a[@href='https://www.bluestone.com/jewellery/rings.html'][text()='Rings ']"));
      Actions action = new Actions(driver);
      action.moveToElement(ele).perform();
      driver.findElement(By.xpath("//a[@title='Diamond Rings'][text()='Diamond']")).click();
      driver.findElement(By.xpath("//span[text()='Price']")).click();
      
}
}