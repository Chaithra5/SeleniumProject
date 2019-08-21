import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dEmoActitime {

	static{
		 System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	 }
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		           String title = driver.getTitle();
		         System.out.println(title);
		           Thread.sleep(1000);
		           if(title.equals("actiTIME - Login"))
			          {
			        	  System.out.println("Actitime login page");
			          } else
			          {
			        	  System.out.println("NOT Actitime login page");

			          }
		     WebElement user = driver.findElement(By.xpath("//Input[@name='username']"));
		      if(user.isDisplayed())
		      {
		    	  System.out.println("username is present");
		    	  user.sendKeys("admin");
		      }else {
		    	  System.out.println("username is present");
		      }
	           Thread.sleep(1000);
		      WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
		      
		                 if(pwd.isDisplayed())
		                 {
		                	 System.out.println("Password is present");
		                	 pwd.sendKeys("manager");
		                 }
	           Thread.sleep(1000);
		     WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		     if(login.isDisplayed())
		     {
		    	 System.out.println("login is available");
		    	 login.click();
		     }
	           Thread.sleep(1000);
		      String entrytitle = driver.getTitle();
		      System.out.println(entrytitle);
		   if(entrytitle.equals("actiTIME - Enter Time-Track"))
		   {
			   System.out.println("Entry login page");
		   }
		   else {
			   System.out.println("Not Entry login page");
		   }
		           
		         
}

}
