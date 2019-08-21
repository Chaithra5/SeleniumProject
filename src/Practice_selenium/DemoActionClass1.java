package Practice_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoActionClass1 {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) {
          WebDriver driver= new ChromeDriver();
          driver.get("http://demoqa.com/menu/");
         WebElement m1 = driver.findElement(By.xpath("//div[text()='Music']"));
         WebElement m2 = driver.findElement(By.xpath("//div[text()='Rock']"));
         WebElement m3 = driver.findElement(By.xpath("//div[text()='Alternative']"));
          Actions act= new Actions(driver);
          act.moveToElement(m1).moveToElement(m2).moveToElement(m3).build().perform();
	}

}
