package TestNGPROGRAMS;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class DemoA {
  @Test
  public void usercreate() {
	  Reporter.log("create user",true);
  }
  @Test
  public void userdelete() {
	  Reporter.log("create delete",true);
  }
  @BeforeMethod
  public void login() {
	  Reporter.log("login", true);
  }

  @AfterMethod
  public void logout() {
	  Reporter.log("logout",true);
  }

}
