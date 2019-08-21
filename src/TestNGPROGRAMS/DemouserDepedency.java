package TestNGPROGRAMS;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemouserDepedency {
  @Test(priority=-1,dependsOnMethods = {"deleteuser"})
  public void createuser() {
	  Reporter.log("createuser", true);
  }
  
  @Test
  public void deleteuser() {
	  Reporter.log("deleteuser", true);
  }
  
  
}
