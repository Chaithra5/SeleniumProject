import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demosql {

	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("file:///home/tyss/Documents/java1.html/sql.html");
		driver.manage().window().maximize();
		String text1 = driver.findElement(By.xpath("//td[text()='sql']/../td[2]")).getText();
		System.out.println(text1);
		driver.close();
}
}