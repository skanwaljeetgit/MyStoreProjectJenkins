package com.myamazon.utility;

import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static String dateName;

	public static void setExtent() {

		htmlReporter = new ExtentHtmlReporter(
				System.getProperty("user.dir") + "\\test-output\\extentreport\\" + "MyExtentReport.html");
		htmlReporter.loadXMLConfig(System.getProperty("user.dir") + "\\extent-config.xml");

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "MyAmazonV1");
		extent.setSystemInfo("Tester", "Vineet");
		extent.setSystemInfo("OS", "Win10");
	}

	public static void getExtent() {
		extent.getClass();

	}

	public static void endReport() {
		extent.flush();
	}
}
