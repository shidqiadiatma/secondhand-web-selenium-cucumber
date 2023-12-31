package com.shidqiadiatma.runners;

import com.shidqiadiatma.factories.browserFactory;
import com.shidqiadiatma.factories.driverManager;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

/**
 * @author Shidqi Adiatma a.k.a. hipstertester on 07/12/23
 * @project secondhand-web-selenium-cucumber
 */

@CucumberOptions(features = "src/test/java/com/shidqiadiatma/features",
        glue = "com.shidqiadiatma.steps",
        tags = "",
        plugin = {
                "pretty",
                "html:reports/cucumber-result/cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "json:reports/cucumber-result/cucumber-reports.json"
        }, monochrome = true)

public class testRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @BeforeMethod
    public void setupBrowser() {
        WebDriver webDriver = new browserFactory().launchBrowser("chrome");
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driverManager.getInstance().setDriver(webDriver);
    }

    @AfterMethod
    public void teardownBrowser() {
        driverManager.getInstance().getDriver().close();
    }
}
