package Sampleletshop;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends Screenshots implements ITestListener  {

	@Override
	public void onFinish(ITestContext context) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestStart(ITestResult result) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		try {
			takeScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	

}
