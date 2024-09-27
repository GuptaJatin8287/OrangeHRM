package com.orange.utilities;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtendListenerClass implements ITestListener {
	ExtentSparkReporter htmlreport;
	ExtentReports report;
	ExtentTest test;
	
	public void configreport() {
		String timestamp = new SimpleDateFormat("yyyy.mm.dd hh.mm.ss").format(new Date());
		String reportname = "OrangeTestReport"+timestamp+".html";
		htmlreport = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\"+reportname);
		report = new ExtentReports();
		report.attachReporter(htmlreport);
		
		//add system info
		report.setSystemInfo("Platform", "Windows");
		report.setSystemInfo("Ram", "8");
		report.setSystemInfo("Browser", "Chrome");
		
		
		//Configration to change look and feel of report
		htmlreport.config().setDocumentTitle("ExtendReport");
		htmlreport.config().setTheme(Theme.DARK);
		htmlreport.config().setTimeStampFormat(ARRAY_MISMATCH_TEMPLATE);
	}
	
	
	public void onStart(ITestContext Result) {
		System.out.println("Name of onstartmethond :"+Result.getName());
		configreport();
	}
	public void onFinish(ITestContext Result) {
		System.out.println("Name of onFinish :"+Result.getName());
		report.flush();
	}
	
	public void onTestFailure(ITestResult Result) {
		System.out.println("Name of onTestFailure :"+Result.getName());
		test = report.createTest(Result.getName());
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of onTestFailure :"+Result.getName(), ExtentColor.RED));
	}
	public void onTestSkipped(ITestResult Result) {
		System.out.println("Name of onTestSkipped :"+Result.getName());
		report.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of onTestSkipped :"+Result.getName(), ExtentColor.YELLOW));
	}
	
	public void onTestSuccess(ITestResult Result) {
		System.out.println("Name of onTestSuccess :"+Result.getName());
		test = report.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of onTestSuccess :"+Result.getName(), ExtentColor.GREEN));
	}
	
	public void onTestStart(ITestResult Result) {
		System.out.println("Name of onTestStart :"+Result.getName());
	}
	public void onTestFailedButWithinSuccessPercentage(ITestContext Result) {
		
	}

}
