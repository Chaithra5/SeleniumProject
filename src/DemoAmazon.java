import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAmazon {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=usflex&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Flogin%2Fs%3Fk%3Dlogin%26page%3D4%26ref_%3Dnav_ya_signin&prevRID=R4Z6B9K6A7MNDQEJH12T&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&ubid=134-5088198-5043630");
	driver.switchTo().activeElement().sendKeys("Supritha");
	driver.findElement(By.xpath("//Input[@type='email']")).sendKeys("sonimbtm@gmail.com");
driver.findElement(By.xpath("//Input[@type='password']")).sendKeys("Test@123");
driver.findElement(By.xpath("//Input[@id='ap_password_check']")).sendKeys("Test@123");
driver.findElement(By.xpath("//input[@id='continue']")).click();
	
	}
}
