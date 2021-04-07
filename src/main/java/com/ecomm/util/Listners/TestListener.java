package com.ecomm.util.Listners;

import com.aventstack.extentreports.gherkin.model.Feature;
import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {


    @Override
    public void onFinish(ITestContext context) {

        ExtentManager.report.flush();
        DriverManager.tearDown();
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentManager extentManager = new ExtentManager(context.getCurrentXmlTest().getName());
        DriverManager driverManager = new DriverManager();
        driverManager.setUp();
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentManager.test = ExtentManager.report.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // TODO Auto-generated method stub
    }

}
