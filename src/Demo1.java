import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}

	public static void main(String[] args) {
       WebDriver driver=new ChromeDriver();
//        //driver.get("https://www.facebook.com/public/Fb-Login");
//      driver.get("https://demo.actitime.com/login.do");
//       //driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
////       String title= driver.getTitle();
////       System.out.println(title);
                  driver.close();
//      
//    WebElement  logintxt=driver.findElement(By.name("username"));
//    logintxt.sendKeys("admin");
//    WebElement pwdtxt=driver.findElement(By.name("pwd"));
//    pwdtxt.sendKeys("manager");
//    WebElement login=driver.findElement(By.id("loginButton"));
//    login.click();
//    System.out.println(driver.getTitle());
//    
    
	}

}
