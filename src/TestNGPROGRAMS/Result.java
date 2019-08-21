package TestNGPROGRAMS;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
///Listener  class
public class Result implements ITestListener
	{
        int passcount;
        int failcount;
	@Override
	public void onTestStart(ITestResult result) {
		String name = result.getName();	
		Reporter.log("test "+name+" is started ",true);		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name = result.getName();	
		Reporter.log("test "+name+" is passed ",true);		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();	
		Reporter.log("test "+name+" is fail ",true);			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		String name = context.getClass().toString();
		Reporter.log(name+" started ", true);		
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("pass : "+passcount,true);	
		Reporter.log("fail :"+failcount,true);		
	}

}
