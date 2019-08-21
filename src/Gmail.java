import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	static {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/chromedriver");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chaithra.k@testyantra");
		driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class=\"whsOnd zHQkBf\"]")).sendKeys("chaithra@1994");
		driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"]")).click();
		Thread.sleep(1000);
		driver.switchTo().activeElement();
		//driver.findElement(By.xpath("//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")).click();
		driver.findElement(By.xpath("//textarea[@rows='1']")).sendKeys("chaithra.t.kota@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"subjectbox\"]")).sendKeys("Test yantra");
		driver.findElement(By.xpath("//div[@class=\"Am Al editable LW-avf\"]")).sendKeys("Hi hello,HOw r u?");
		driver.findElement(By.xpath("//div[@jslog=\"32601; u014N:cOuCgd,Kr2w4b; dYFj7e:true; 11:WyIjbXNnLWE6ci01NjUxMDM1Mzc1NTMyMTk1MTU5IixudWxsLG51bGwsbnVsbCwxLG51bGwsWyIjdGhyZWFkLWE6cjM2MTUxNjYwNzg2NzQ4MzczMjMiXSxmYWxzZV0.\"]")).click();
	//	driver.close();

	}
}
