package TestNGPROGRAMS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityDemo extends BaseTest{
  @Test(priority=2)
  public void Test1() {
	  Reporter.log("Test1", true);
  }
  @Test(priority=-1)
  public void Test2() {
	  Reporter.log("Test2", true);
  }
  @Test(priority=0,invocationCount=2)
  public void Test3() {
	  Reporter.log("Test3", true);
  }
  @Test(priority=1)
  public void Test4() {
	  Reporter.log("Test4", true);
  }
  
}
