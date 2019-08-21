package Practice_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoNotificationpoup {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
  @Test
  public void f() {
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(option);
	   Navigation nav = driver.navigate();
	  // nav.to("https://www.irctc.co.in/nget/train-search");
		nav.to("https://www.myntra.com");  
	  }
  }
