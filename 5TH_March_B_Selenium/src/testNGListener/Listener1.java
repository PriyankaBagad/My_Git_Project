package testNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteAppBaseClass.BaseClassUsingPropertyForListener;

public class Listener1 implements ITestListener
{
	BaseClassUsingPropertyForListener b=new BaseClassUsingPropertyForListener();//created objectof base class
	
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Success TC is Running..",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Success TC Name is : "+result.getName(),true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String TCName = result.getName();
		try 
		{
			b.takeScreenShot(TCName);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Skipped TC is Running..",true);
		ITestListener.super.onTestSkipped(result);
		Reporter.log("Skipped TC Name is : "+result.getName(),true);
	}
}
