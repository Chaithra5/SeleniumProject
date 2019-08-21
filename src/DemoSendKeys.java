import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSendKeys {
	
	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }

	public static void main(String[] args) {
          WebDriver driver= new  ChromeDriver();
          driver.get("https://demo.actitime.com/login.do");
          driver.switchTo().activeElement().sendKeys("admin");
          driver.close();
	}

}
