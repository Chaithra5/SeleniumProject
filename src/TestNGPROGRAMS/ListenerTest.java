package TestNGPROGRAMS;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Listener Test class
@Listeners(Result.class)
public class ListenerTest {
	  @Test
	  public void Demo1() {
		  Reporter.log("Demo1", true);
		 // Assert.fail();
	  }
	  
	  @Test
	  public void Demo2() {
		  Reporter.log("Demo2", true);
	  
	}
}