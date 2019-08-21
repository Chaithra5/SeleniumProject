import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
class LoginPage1{
	@FindBy(id="txtUsername")
	private WebElement unTB;
	@FindBy(id="txtPassword")
	private WebElement pwdTB;
	@FindBy(id="btnLogin")
	private WebElement loginBTN;
	
	public LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPasswordName(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
	
}

class Logout
{
	@FindBy(id="welcome")
	private WebElement welcomeBTN;
	@FindBy(xpath="[text()='Logout']")
	private WebElement logoutBTN;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickWelcome()
	{
		welcomeBTN.click();
	}
	public void clickLogout()
	{
		logoutBTN.click();
	}
}


public class OrangeHRM_POM {

	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://opensource-demo.orangehrmlive.com");
LoginPage1 l=new LoginPage1(driver);
l.setUserName("Admin");
l.setPasswordName("admin123");
l.clickLogin();
Thread.sleep(1000);

Logout l1=new Logout(driver);
l1.clickWelcome();
l1.clickLogout();

	}

}
