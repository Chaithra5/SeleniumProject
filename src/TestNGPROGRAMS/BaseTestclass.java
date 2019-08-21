package TestNGPROGRAMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BaseTestclass {
  
  @BeforeMethod
  public void login() {
	  Reporter.log("login", true);
  }

  @AfterMethod
  public void logout() {
	  Reporter.log("logout", true);
  }
}
