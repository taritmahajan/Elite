package com.ecomm.cukes.StepDefs;

import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.Status;
import com.ecomm.page.AP.HomePage;
import com.ecomm.page.AP.ProductListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Search_Steps {

    HomePage homePage;
    ProductListPage productListPage;

    @Given("search for a product")
    public void search_for_a_product() throws ClassNotFoundException {
        homePage = new HomePage();
        homePage.navigatToTShirtsPage();
    }
    @Then("search page gets opened")
    public void search_page_gets_opened() throws ClassNotFoundException {
        productListPage= new ProductListPage();
        productListPage.addProductToCart();
    }

    @Then("verify search page components")
    public void verify_search_page_components() throws ClassNotFoundException {

        productListPage= new ProductListPage();
        productListPage.verifyProductAddedToCart();
        productListPage.validateProductAddedPageElements();
    }
}
