package com.qa.tiatros.testcase;

import org.testng.TestNG;

import com.qa.tiatros.report.ExtentReportListner;

public class MyRunner {

	static TestNG testNG;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		ExtentReportListner ex  = new ExtentReportListner();
		
		testNG = new TestNG();
		testNG.setTestClasses(new Class[] {DashboardTest.class});
		testNG.addListener(ex);
		testNG.run();	

	}

}
