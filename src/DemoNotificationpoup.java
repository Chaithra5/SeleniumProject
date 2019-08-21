import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DemoNotificationpoup {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option =new ChromeOptions();
option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.manage().deleteAllCookies();
driver.get("https://www.irctc.co.in/nget/train-search");
}
}