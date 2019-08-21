import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoUrban {

	static{
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> count = driver.findElements(By.xpath("//span[@class='topnav_itemname']"));
		int tcount = count.size();
		System.out.println(tcount);
		for(int i=0;i<tcount;i++)
		{
			WebElement text = count.get(i);
			System.out.println(text.getText());
		}
		
	}

}
