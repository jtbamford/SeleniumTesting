package com.qa.Tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:")
public class testRunner {
	
	static ExtentReports extentreport;
	static ExtentTest test;
	
	@BeforeClass
	public static void setup() {
		extentreport = new ExtentReports("C://Users//Admin//report.html",true);
		test=extentreport.startTest("verify application title");
		test.log(LogStatus.INFO, "browser started");
	}
	
	@AfterClass
	public static void tearDown() {
		extentreport.flush();
	}
	

}
