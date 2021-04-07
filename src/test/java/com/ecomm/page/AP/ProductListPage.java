package com.ecomm.page.AP;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import com.ecomm.util.Support.TestBase;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage extends TestBase {

    //WebDriver driver;
    //ExtentTest test;

    @FindBy(xpath = "//a[@class='product_img_link']/img")
    public WebElement IMG_PRODUCT_FIRST;

    @FindBy(xpath = "//a[@title='Add to cart']")
    public WebElement BUTTON_ADD_TO_CART;

    @FindBy(xpath = "//h2/i[@class='icon-ok']")
    public WebElement ICON_PRODUCT_ADDED_SUCCESS;

    @FindBy(xpath = "//h2/i[@class='icon-ok']/..")
    public WebElement MSG_PRODUCT_ADDED_SUCCESS;

    @FindBy(xpath = "//div[@class='product-image-container layer_cart_img']/img")
    public WebElement IMG_PRODUCT_ADDED_SUCCESS;

    @FindBy(xpath = "//h1[contains(text(),'Search')]")
    public WebElement HEADER_SEARCH_RESULTS;

    public ProductListPage() {
        //this.driver = driver;
        //this.test = test;
        PageFactory.initElements(DriverManager.driver,this);
    }

    public void addProductToCart(){

        mouseOver(IMG_PRODUCT_FIRST,"FirstProductImage");
        click(BUTTON_ADD_TO_CART,"ATC Button");
    }

    public void verifyProductAddedToCart(){

        if(isElementDisplayed(ICON_PRODUCT_ADDED_SUCCESS)){
            ExtentManager.test.log(Status.PASS,"Product added to cart");
        }else{
            ExtentManager.test.log(Status.FAIL,"Not able to add product to cart");
        }
    }

    public void validateProductAddedPageElements(){
        verifyElementExistsOnPage(HEADER_SEARCH_RESULTS,"HeaderSearchProduct");
        verifyElementExistsOnPage(IMG_PRODUCT_ADDED_SUCCESS,"ImageProductAdded");

    }

}
