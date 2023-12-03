package com.shidqiadiatma.steps;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.pages.homePage;
import com.shidqiadiatma.pages.registerPage;
import io.cucumber.java.en.Then;

public class registerStep {

    @Then("user direct to dashboard screen")
    public void userDirectToDashboardScreen() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.verify_telusuri_kategori_exist();
        homePage.verify_profile_user_exist();
    }
    @Then("user verify inline error with value {string}")
    public void userVerifyInlineErrorWithValue(String value) {
        new registerPage(driverManager.getInstance().getDriver());
                registerPage.verifyErrorMessage(value);
    }
}
