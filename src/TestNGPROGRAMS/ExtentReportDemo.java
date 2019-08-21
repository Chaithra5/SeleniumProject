package TestNGPROGRAMS;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {
	///create a report object
	ExtentReports reports=new ExtentReports();

	//creating the report                           
	ExtentTest test= reports.createTest("Test report");
  @Test
  public void demo() {
	  //storing the test report in the given path
	  ExtentHtmlReporter rep=new  ExtentHtmlReporter("C:\\Users\\User\\Documents\\chaithra_pgm\\Selenium_Project\\Report");
	  
	  //setting the document details
	  rep.config().setDocumentTitle("Automation");
	  rep.config().setReportName("Testing");
	  rep.config().setTheme(Theme.STANDARD);
	  
	  //setting the s/m information
	  reports.attachReporter(rep);
	  reports.setSystemInfo("hostname", "chaithra");
	  reports.setSystemInfo("envname", "windows");
	  reports.setSystemInfo("projectname", "demoproject");
  }
}
