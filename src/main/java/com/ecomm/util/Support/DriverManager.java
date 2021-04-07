package com.ecomm.util.Support;

import com.ecomm.util.FileReaders.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;
    String browser;
    public long implicitWait;
    ReadProperties envProp = new ReadProperties("environment");


    @BeforeClass
    public void setUp(){

        System.out.println("before class drivermanager");

        browser = envProp.getPropValue("browser");
        implicitWait = (long) Integer.parseInt(envProp.getPropValue("implicitWait"));

        switch (browser){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+
                        "\\src\\test\\resources\\Drivers\\chromedriver_89.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                break;
            case "ie":
                break;
            case "headless":
                break;
        }

        driver.get(envProp.getPropValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
    }

    @AfterClass
    public static void tearDown(){

        if(!driver.equals(null)){
            driver.quit();
        }

    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterSuite
    public void flush(){
        System.out.println("after suite");
    }
}
