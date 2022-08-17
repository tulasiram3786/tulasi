package com.Dalvkot.vsshhms_GenericUtility;

import java.util.Calendar;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * 
 * @author Sudarshan Palla
 *
 */
public class ListenerImp implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	public void onFinish(ITestContext context) {
		report.flush();

	}

	public void onStart(ITestContext context) {

//step1:Extent Report Configurations
		String dateandtime = Calendar.getInstance().getTime().toString().replace(":", "_");
		ExtentSparkReporter htmlreporter = new ExtentSparkReporter("./ExtentReport" + dateandtime + ".html");
		htmlreporter.config().setDocumentTitle("Camcast Automation Execution Report");
		htmlreporter.config().setReportName("Regression Execution Report");
		htmlreporter.config().setTheme(Theme.DARK);

		// step2:attach the physical report and do the system
		report = new ExtentReports();
		report.attachReporter(htmlreporter);
		report.setSystemInfo("OS", "Windows 10");
		report.setSystemInfo("Environment", "TestEnvironment");
		report.setSystemInfo("URL", "http://localhost:8888");
		report.setSystemInfo("Reporter Name", "sudarshan");
	}

	public void onTestFailure(ITestResult result) {
//log fail method ,take screenshot ,attach screen shot to extent report,
//add exception logs
		test.log(Status.FAIL, result.getMethod().getMethodName());
		test.log(Status.FAIL, result.getThrowable());
		String path = null;
		WebDriverUtility wutil = new WebDriverUtility();
		try {
			path = wutil.takeScreenShot(BaseClass.sdriver, result.getMethod().getMethodName());

		} catch (Throwable e) {
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(path);

	}

	public void onTestSkipped(ITestResult result) {
//step 5:log the Skip method (test case name and Exception logs)
		test.log(Status.SKIP, result.getMethod().getMethodName());
		test.log(Status.SKIP, result.getThrowable());

	}

	public void onTestStart(ITestResult result) {
		test = report.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, result.getMethod().getMethodName());

	}

}
