package com.ecomm.TestCase.AP;

import com.aventstack.extentreports.Status;
import com.ecomm.page.AP.HomePage;
import com.ecomm.page.AP.ProductListPage;
import com.ecomm.util.FileReaders.ReadProperties;
import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import com.ecomm.util.Support.TestBase;
import org.testng.annotations.Test;

public class CartTest2 {

    HomePage homePage;
    ProductListPage productListPage;
    ReadProperties envProp;
    TestBase base;

    @Test
    public void firstTest(){

        ExtentManager.test.log(Status.INFO,"Cart First new test started !!");
        base = new TestBase();
        homePage = new HomePage();
        productListPage = new ProductListPage();
        homePage.navigatToTShirtsPage();
    }

    @Test
    public void secondTest(){

        ExtentManager.test.log(Status.INFO,"Cart Second new test started !!");
        base = new TestBase();
        homePage = new HomePage();
        productListPage = new ProductListPage();
        homePage.navigatToTShirtsPage();
    }
}
