import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenshotDemo {
	 static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }

	public static void main(String[] args) throws IOException {
            WebDriver driver=new ChromeDriver();
    		driver.manage().window().maximize();
            driver.get("https://www.google.com");
            TakesScreenshot image=(TakesScreenshot) driver;
            File src =image.getScreenshotAs(OutputType.FILE);
            File dest=new File("./photo/a.png");
            FileUtils.copyFile(src, dest);
            driver.close();
                                                                                                                                                                                                                                                              		
            
	}

}
