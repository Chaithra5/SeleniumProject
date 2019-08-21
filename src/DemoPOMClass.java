import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

class LoginPage
{
	//Declaration
	@FindBy(id="username")
	private WebElement unTB;
	@FindBy(id="pwd")
	private WebElement pwTB;
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginBTN;
	
	//Initialization
	public LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBTN.click();
	}
}
public class DemoPOMClass {

	static {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://demo.actitime.com/login.do");
LoginPage l=new LoginPage(driver);
l.setUserName("abcdd");
l.setPassword("abcd@123");
l.clickLogin();
Thread.sleep(1000);
l.setUserName("admin");
l.setPassword("manager");
l.clickLogin();

	}

}
