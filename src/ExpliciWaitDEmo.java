import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciWaitDEmo {

		static{
			 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//it throws exception if not giving
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//div[text()='Login '] ")).click();
			WebElement logout = driver.findElement(By.id("logoutLink"));
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(logout));//checking condition
			driver.findElement(By.id("logoutLink")).click();
	}

}
