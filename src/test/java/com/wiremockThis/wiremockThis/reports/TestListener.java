//package com.wiremockThis.wiremockThis.reports;
//
//import com.codeborne.selenide.WebDriverRunner;
//import com.relevantcodes.extentreports.LogStatus;
//import com.wiremockThis.wiremockThis.base.DriverBase;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class TestListener implements ITestListener{
//
//  private static String getTestMethodName(ITestResult iTestResult) {
//    return iTestResult.getMethod().getConstructorOrMethod().getName();
//  }
//
//  private static Object getTestingUrl(ITestResult iTestResult) {
//    return iTestResult.getTestContext().getCurrentXmlTest().getParameter("testingURL");
//  }
//
//  @Override
//  public void onTestStart(ITestResult result) {
//    System.out.println("\nMethod --> " +  getTestMethodName(result) + "() start");
//    ReportTestManager.startTest(result.getMethod().getMethodName(), "Executed test: " + result.getTestClass().getName() + " > " + result.getMethod().getMethodName() + "()");
//  }
//
//  @Override
//  public void onTestSuccess(ITestResult result) {
//    System.out.println("Method: " +  getTestMethodName(result) + "() SUCCESS!\n");
//    ReportTestManager.getTest().log(LogStatus.PASS, result.getMethod().getMethodName() + " > PASSED!", "Testing URL: " + getTestingUrl(result));
//    //((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript("sauce:job-result=passed");
//  }
//
//  @Override
//  public void onTestFailure(ITestResult result) {
//    System.out.println("Method: " +  getTestMethodName(result) + "() FAILED!\n");
//
//    //Get driver from base
//    Object testClass = result.getInstance();
//    WebDriver webDriver = ((DriverBase) testClass).getDriver();
//
//    //Take screenshot
//    String base64Screenshot = "data:image/png;base64,"+((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BASE64);
//
//    //log and screenshot operations for failed tests.
//    ReportTestManager.getTest().log(LogStatus.FAIL,result.getMethod().getMethodName() + " > FAILED!",
//        ReportTestManager.getTest().addBase64ScreenShot(base64Screenshot));
//    //((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript("sauce:job-result=failed");
//  }
//
//  @Override
//  public void onTestSkipped(ITestResult result) {
//    System.out.println("\nTest was skipped --> " + result.getTestName()+"\n");
//  }
//
//  @Override
//  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//    //
//  }
//
//  @Override
//  public void onStart(ITestContext context) {
//    System.out.println("\nPERFORMING START ACTIONS FOR -----------------------> " + context.getName().toUpperCase()+"\n");
//  }
//
//  @Override
//  public void onFinish(ITestContext context) {
//    System.out.println("\nPERFORMING CLEANUP ACTIONS FOR ---------------------> " + context.getName().toUpperCase()+"\n");
//    ReportTestManager.endTest();
//    ReportManager.getReporter().flush();
//  }
//}
