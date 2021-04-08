package com.ecomm.cukes.runner;


import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

@CucumberOptions(
        features="src/test/java/com/ecomm/cukes/Features/ProductSearch.feature",
        glue={"com/ecomm/cukes/StepDefs"},
        //tags = "@Smoke",
        plugin= {
                //"json:target/cucumber-reports/CucumberTestReport.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        monochrome=true
)
public class Home_TestRunner extends AbstractTestNGCucumberTests{
}
