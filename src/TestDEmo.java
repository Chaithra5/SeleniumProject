import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestDEmo {
	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///home/tyss/Documents/TEST.html");
		
		 WebElement text = driver.findElement(By.id("t1"));
		  text.sendKeys("TEST YANTRA");
		  String value = text.getAttribute("value");
		  System.out.println(value);
		 Thread.sleep(1000);
		 System.out.println(text);
		WebDriverWait wait =new WebDriverWait(driver,10);
			wait.until(new ExpectedCondition<WebElement>() {

				@Override
				public WebElement apply(WebDriver driver) {
					if(value.equals("TEST YANTRA")) {
					return driver.findElement(By.id("s1"));
					}else
					return null;
					
				}
			});
	driver.findElement(By.id("s1")).sendKeys("TY");
}
}
