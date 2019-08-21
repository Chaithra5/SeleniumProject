import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFileUpload {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///home/tyss/Documents/fileupload.html");
Thread.sleep(1000);
String path="/home/tyss/Pictures/Screenshot from 2019-07-17 14-53-02.png";
driver.findElement(By.id("f1")).sendKeys(path);

}
}