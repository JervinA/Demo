package com.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import SeleniumAutomation.SeleniumAutomation.Testutils;

public class TestNGListeners extends Testutils implements ITestListener {

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
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

	
	
	

}
