package com.wiremockThis.wiremockThis.reports;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportManager {

  private static ExtentReports extent;

  public static synchronized ExtentReports getReporter(){
    if(extent == null){
      //String workingDir = System.getProperty("user.dir");
      extent = new ExtentReports("target/index.html", false);
    }
    return extent;
  }

}
