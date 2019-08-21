import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoselenium {
//	private static String tiltle;
	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().window().maximize();
           String title = driver.findElement(By.xpath("//td[text()='Java']/../td[2]")).getText();
           System.out.println(title);
           
	 }
	
}
