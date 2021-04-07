package com.ecomm.page.AP;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import com.ecomm.util.Support.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase{
    
    //WebDriver driver;
    //ExtentTest test;
    //TestBase testBase;

    @FindBy(css = "li>a[title=Women]")
    public WebElement LINK_WOMEN;

    @FindBy(xpath = "(//a[text()='T-shirts'])[1]")
    public WebElement LINK_WOMEN_TSHIRTS;

    public HomePage() {
        //this.driver = driver;
        //this.test = test;
        PageFactory.initElements(DriverManager.driver,this);
    }


    public void navigatToTShirtsPage(){
        //testBase = new TestBase();
        mouseOver(LINK_WOMEN,"Women Link");
        click(LINK_WOMEN_TSHIRTS,"TShirt Link");
        if(DriverManager.driver.getTitle().contains("T-sirts")){
            ExtentManager.test.log(Status.PASS,"TShirt page opened");
        }else{
            ExtentManager.test.log(Status.FAIL,"Failed to open TShirt page , Title is  " +
                    DriverManager.driver.getTitle());
            captureScreenShot("TShirtPageNotOpened");
            System.out.println(screenShotMap.get("TShirtPageNotOpened"));
            ExtentManager.test.addScreenCaptureFromPath(screenShotMap.get("TShirtPageNotOpened"));
        }
    }
}
