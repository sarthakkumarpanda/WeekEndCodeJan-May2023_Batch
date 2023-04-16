package com.automationcode_15thApr_2023;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {
	
	
	@Override
	public void onStart(ITestContext context) {
		System.out.println("Operation Started");
		
	}
	
	
	

	@Override
	public void onTestStart(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName  + " -> started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "-> passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "-> failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String testName = result.getName();
		System.out.println(testName + "-> skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}
	

	@Override
	public void onFinish(ITestContext context) {
	System.out.println("Operation finished");	
		
	}

}
