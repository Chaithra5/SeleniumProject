import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DEmoStarhealthpopup {
	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args)  {
		 ChromeOptions option=new  ChromeOptions();
		 option.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.irctc.co.in/nget/train-search");
		/*driver.get("https://retail.starhealth.in/renewal");
		driver.findElement(By.xpath("//div[@class='spritimg dob-sprit-img']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='1']")).click();
		driver.findElement(By.xpath("//button[@id='proceed']")).click();*/
}
}
