import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class Login
{
	@FindBy(id="username")
	private WebElement unTN;
	@FindBy(name="pwd")
	private WebElement pwdTN;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	public Login(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		unTN.sendKeys(un);
	}
	public void setPasswordName(String pwd)
	{
		pwdTN.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
}
class Logout1{
	@FindBy(id="logoutLink")
	private WebElement logOutBTN;
	
	public Logout1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clicklogout()
	{
		logOutBTN.click();
	}
}
public class DemoActitimePOM {
	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
	Login l=new Login(driver);
	l.setUserName("admin");
	l.setPasswordName("manager");
	l.clickLogin();
     Thread.sleep(1000);
     Logout1 l1=new Logout1(driver);
     l1.clicklogout();
     
	

}
}