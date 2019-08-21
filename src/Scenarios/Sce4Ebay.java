package Scenarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sce4Ebay {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("https://in.ebay.com");
		  driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).click();
		  driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("dolls");
		  driver.findElement(By.id("gh-cat-box")).click();
		  driver.findElement(By.xpath("//option[text()='Dolls & Bears']")).click();
		  driver.findElement(By.xpath("//input[@value='Search']")).click();
           System.out.println(driver.getTitle());
           int count =0;
           List<WebElement> text = driver.findElements(By.xpath("//h3[@class='s-item__title s-item__title--has-tags']"));
              for(WebElement var:text)
              {
            	  System.out.println(var.getText());
            	  count++;
            	  
              }
	}
}