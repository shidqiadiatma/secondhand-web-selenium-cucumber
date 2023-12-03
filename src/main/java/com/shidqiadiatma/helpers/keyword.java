package com.shidqiadiatma.helpers;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.helpers.enums.fileType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;

public class keyword {

    public static void navigateToUrl(String url) {
        driverManager.getInstance().getDriver().get(url);
    }

    public static void tapElement(WebElement webElement) {
        waitElementToBeDisplayed(webElement);
        webElement.click();
    }

    public static void inputText(WebElement webElement, String value) {
        waitElementToBeDisplayed(webElement);
        webElement.sendKeys(value);
    }

    public static void validate_element_is_visible_and_enabled(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(driverManager.getInstance().getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(webElement));

        if (!webElement.isDisplayed() || !webElement.isEnabled()) {
            System.out.println("element not visible or enabled");
            throw new ElementNotInteractableException(webElement.toString());
        }
    }

    public static void waitElementToBeDisplayed(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driverManager.getInstance().getDriver(), Duration.ofSeconds(25));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void assertCurrentUrl(String expectedUrl) {
        String actualUrl = driverManager.getInstance().getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    public static void assertWording(String expectedUrl) {
        String actualUrl = driverManager.getInstance().getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }
    public static void takeScreenshot(String fileName) {
        try {
            TakesScreenshot screenshot = ((TakesScreenshot) driverManager.getInstance().getDriver());
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File("reports/screenshots" + File.separator + fileName + "." + fileType.PNG.name());

            FileUtils.copyFile(sourceFile, destinationFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}