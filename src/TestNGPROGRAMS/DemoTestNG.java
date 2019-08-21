package TestNGPROGRAMS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTestNG {
  @Test
  public void test() {
	  Reporter.log("from test",true);
  }
}
