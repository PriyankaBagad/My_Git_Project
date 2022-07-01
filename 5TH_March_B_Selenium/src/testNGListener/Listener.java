package testNGListener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
	//ontestPass
	//ontestFail
	//ontestSkipped
	//ontestSucess
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("TC is Failed...Screenshot taken", true);
		ITestListener.super.onTestFailure(result);
		Reporter.log("Failed TC Name is "+result.getName(),true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC is Success...",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC Name is "+result.getName(),true);
	}
	
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC is Skipped...Please check dependent TC",true);
		Reporter.log("Skipped TC Name is "+result.getName(),true);
		ITestListener.super.onTestSkipped(result);
	}

}
