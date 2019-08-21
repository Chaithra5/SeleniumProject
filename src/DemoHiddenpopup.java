import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoHiddenpopup
{
	static {
	   	 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login '] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='topMenuButton preventPanelsHiding'][2]")).click();

}
}