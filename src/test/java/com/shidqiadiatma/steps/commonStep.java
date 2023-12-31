package com.shidqiadiatma.steps;

import com.shidqiadiatma.helpers.keyword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

/**
 * @author Shidqi Adiatma a.k.a. hipstertester on 07/12/23
 * @project secondhand-web-selenium-cucumber
 */

public class commonStep {

    @Given("user navigate to url {string}")
    public void navigateToUrl(String url) {
        keyword.navigateToUrl(url);
    }
    @And("user take screenshot {string}")
    public void user_take_screenshot (String screenshot) {
        keyword.take_screenshot(screenshot);
    }
}