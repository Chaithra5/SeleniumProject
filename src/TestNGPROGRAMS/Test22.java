package TestNGPROGRAMS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test22 extends BaseTest {
  @Test
  public void test2() {
	  Reporter.log("TEST2", true);
  }
  @Test
  public void test3() {
	  Reporter.log("TEST3", true);
  }
}
