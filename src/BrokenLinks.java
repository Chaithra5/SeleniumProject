import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/User/Documents/brokenlinks.html");
	List<WebElement> ele1 = driver.findElements(By.tagName("a"));
		for(WebElement e: ele1)
		{
			URL u =new URL(e.getAttribute("href"));
			HttpURLConnection connection=(HttpURLConnection)u.openConnection();
			int i=connection.getResponseCode();
		     
		if(i==200)
		{
			System.out.println("Link is not broken :"+i);
			System.out.println(connection.getResponseMessage());
		}else {
			System.out.println("Link is broken :"+i);
			System.out.println(connection.getResponseMessage());
		}
		}
		driver.close();
}
}
