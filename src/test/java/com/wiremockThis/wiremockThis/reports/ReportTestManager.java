package com.wiremockThis.wiremockThis.reports;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ReportTestManager {

  private static ExtentReports extent = ReportManager.getReporter();

  private static ExtentTest test;

  public static synchronized ExtentTest getTest() {
    return test;
  }

  public static synchronized void endTest() {
    extent.endTest(test);
  }

  public static synchronized ExtentTest startTest(String testName, String desc) {
     test = extent.startTest(testName, desc);
    return test;
  }
}
