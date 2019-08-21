package TestNGPROGRAMS;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class DemoTestNGGroups {
  @BeforeClass(alwaysRun=true)//
  public void login() {
	  Reporter.log("login", true);
  }
  
  @Test(priority =1,groups={"user","smoke"})
 // @Test(priority =1,groups={"user","smoke"},dependsOnGroups={"product"})
  public void createuser() {
	  Reporter.log("create user", true);
  }
  @Test(priority =2,groups={"user"},enabled =false)
  public void edituser() {
	  Reporter.log("edituser", true);
  }
  
  @Test(priority =3,groups={"user"})
  public void deleteuser() {
	  Reporter.log("deleteuser", true);
  }
  
  @Test(priority =4,groups={"product","smoke"})
  public void createproduct() {
	  Reporter.log("create product", true);
  }
  
  @Test(priority =5,groups={"product"})
  public void deleteproduct() {
	  Reporter.log("delete product", true);
  }

}
