import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoGoogleLink {

	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 List<WebElement> link = driver.findElements(By.tagName("a"));
		 int count = link.size();
		 System.out.println(count);
		 for(int i=0;i<count;i++)
		 {
			 WebElement text = link.get(i);
			 System.out.println(text.getText());
		 }
		
		
}
}