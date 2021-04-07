package com.ecomm.TestCase.AP;

import com.aventstack.extentreports.Status;
import com.ecomm.util.Listners.TestListener;
import com.ecomm.util.Support.ExtentManager;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class RoughTest {

    @Test(testName = "Test One")
    public void testOne(){
        ExtentManager.test.log(Status.INFO,"First test started");
    }

    @Test(testName = "Test two")
    public void testTwo(){
        ExtentManager.test.log(Status.INFO,"second test started");
    }

    @Test(testName = "Test three")
    public void testThree(){
        ExtentManager.test.log(Status.INFO,"third test started");
    }

    @Test(testName = "Test four")
    public void testFour(){
        ExtentManager.test.log(Status.INFO,"Fourth test started");
    }

}
