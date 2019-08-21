package TestNGPROGRAMS;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoFail {
  @Test
  public void test() {
	  Reporter.log("testttt", true);
	  Assert.fail();
  }
}
