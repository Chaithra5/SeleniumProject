package TestNGPROGRAMS;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterAnnotation {
@Parameters({"un","pwd"})
	
  @Test
  public void test(@Optional("hello")String s1,String s2) {
	  Reporter.log(s1,true);
	  Reporter.log(s2,true);
  }
}
