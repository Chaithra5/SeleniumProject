import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameSlider {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://jqueryui.com/");
driver.findElement(By.xpath("//a[text()='Slider']")).click();
driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
Actions action =new Actions(driver);
WebElement slider = driver.findElement(By.xpath("//div[@id='slider']/span"));
//int size = driver.findElement(By.id("slider")).getSize().getWidth();
//System.out.println(size);
for(int i=0;i<=20;i++)
{
	action.moveToElement(slider).clickAndHold(slider).moveByOffset(i, 0).perform();
}
for(int i=20;i>0;i--)
{
	action.moveToElement(slider).clickAndHold(slider).moveByOffset(-i, 0).perform();
}driver.close();
}
}