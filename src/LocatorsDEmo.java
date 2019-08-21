import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDEmo {

	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	public static void main(String[] args) throws InterruptedException {
  WebDriver driver =new ChromeDriver();
      driver.get("file:///home/tyss/Documents/java/Google.html");
     Thread.sleep(1000);
      driver.findElement(By.id("a1")).click();
      Thread.sleep(1000);
      driver.navigate().back();
   //   Thread.sleep(1000);
      
	}

}
