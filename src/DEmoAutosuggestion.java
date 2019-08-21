import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoAutosuggestion {
	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("JAVA");
		Thread.sleep(1000);
		List<WebElement> link= driver.findElements(By.xpath("//li[@class='sbct']"));
		         int count = link.size();
		         System.out.println(count);
		         driver.findElement(By.xpath("//ul/li[1]")).click();
}
}