package Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailDemo1 {
	static {
		//System.setProperty("webdriver.gecko.driver", "./Software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");

	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		  driver.manage().window().maximize();
driver.get("https://accounts.google.com/AccountChooser/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&rm=false&ltmpl=default&scc=1&ss=1&osid=1&emr=1&flowName=GlifWebSignIn&flowEntry=AddSession");	
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("chaithra.k@testyantra.com");
	driver.findElement(By.xpath("//span[text()='Next']")).click();	
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("chaithra@1994");
	driver.findElement(By.xpath("//span[@class=\"RveJvd snByac\"][text()='Next']")).click();
	String tittle = driver.getTitle();
	System.out.println(tittle);
	if(tittle.equals("Gmail"))
			{
		System.out.println("Gmail logged successfully ");
			}
	driver.findElement(By.xpath("//div[@role='button'][text()='Compose']")).click();
	}
}
