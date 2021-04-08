package com.ecomm.cukes.StepDefs;

import com.ecomm.util.Support.DriverManager;
import com.ecomm.util.Support.ExtentManager;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @AfterStep
    public void captureScreenshot(Scenario scenario){

        try {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            //    if (scenario.isFailed()) {
            scenario.log(screenshotName + "  Step Failed");
            TakesScreenshot ts = (TakesScreenshot) DriverManager.driver;
            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", screenshotName);
            //  }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Before
    public void beforeScenario(Scenario scenario){
        ExtentManager.test = ExtentManager.report.createTest(scenario.getName().replace(" ",""));
    }
}
