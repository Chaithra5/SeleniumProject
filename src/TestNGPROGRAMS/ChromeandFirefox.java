package TestNGPROGRAMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class ChromeandFirefox {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	WebDriver driver;
//	@Parameter({"browser"})
	@BeforeMethod
	public void openBrowser(String browser)
	{
	   if(browser.equalsIgnoreCase("firefox")) {
		driver = new FirefoxDriver();
		driver.get("");
	}
	
	else if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		driver.get("");
	}
	}
@org.testng.annotations.Test
public void test()
{
	Reporter.log("from test");
}
@AfterMethod
public void closeBrowser()
{
	driver.close();
}
}