import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEmoChildPOpup {
	static{
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	 }
	 public static void main(String[] args) throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com");
		Set<String> whs = driver.getWindowHandles();
		int count = whs.size();
		System.out.println(count);
	String parent = driver.getWindowHandle();
	whs.remove(parent);
		Thread.sleep(1000);
		for(String wh:whs)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
				driver.close();
		}
		
		////close only particular child window
//		for(String wh:whs)
//		{
//			driver.switchTo().window(wh);
//			String title1 = driver.getTitle();
//			if(title1.equals("Cognizant"))
//			{
//				driver.close();
//			}
//		}
}
}