import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DEmoCustomWait {

	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		//////1st method
	/*	while(true)
		{
			try {
				driver.findElement(By.linkText("Logout")).click();
				System.out.println("LOgout succesfully");
				break;
			}catch(Exception e)
			{
				System.out.println("Exception caught");
			}
		}*/
		
		//////2nd method
	/*	WebDriverWait wait =new WebDriverWait(driver,10);
		wait.until(new ExpectedCondition<WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.linkText("Logout"));
			}
		});*/
		///FluentWait
		FluentWait<WebDriver> wait=new FluentWait<WebDriver> (driver);
		wait.pollingEvery(Duration.ofMillis(600)).withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("logoutLink"))));
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

}
