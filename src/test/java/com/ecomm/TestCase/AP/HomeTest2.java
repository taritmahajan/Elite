package com.ecomm.TestCase.AP;

import com.aventstack.extentreports.Status;
import com.ecomm.page.AP.HomePage;
import com.ecomm.page.AP.ProductListPage;
import com.ecomm.util.FileReaders.ReadProperties;
import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import com.ecomm.util.Support.TestBase;
import org.testng.annotations.Test;

public class HomeTest2 {

    HomePage homePage;
    ProductListPage productListPage;
    ReadProperties envProp;
    TestBase base;

    @Test(priority = 0)
    public void homePageVerify(){

        ExtentManager.test.log(Status.INFO,"Verify Home Page!!");
        //base = new TestBase();
        homePage = new HomePage();
        homePage.navigatToTShirtsPage();
    }

    @Test(priority = 1)
    public void addFirstProductToCart(){

        ExtentManager.test.log(Status.INFO,"Add product to cart!!");
        //base = new TestBase();
        productListPage = new ProductListPage();
        productListPage.addProductToCart();
        productListPage.verifyProductAddedToCart();
    }

    @Test(priority = 2)
    public void verifyProductAddedPageLayout(){

        ExtentManager.test.log(Status.INFO,"Verify Add product page layout!!");
        productListPage = new ProductListPage();
        productListPage.validateProductAddedPageElements();
    }
}
