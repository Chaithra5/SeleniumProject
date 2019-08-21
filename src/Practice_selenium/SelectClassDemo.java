package Practice_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class SelectClassDemo {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	@Test
	public void select()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");
		Select sel=new Select(driver.findElement(By.id("testingDropdown")));
		//sel.selectByVisibleText("Database Testing");
		//sel.selectByIndex(1);
	}
}
