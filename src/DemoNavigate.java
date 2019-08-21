import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNavigate {
 static{
	 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
 }
 public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://demo.actitime.com/login.do");
	driver.navigate().back();
	Thread.sleep(1000);
	driver.close();
	
}
}
