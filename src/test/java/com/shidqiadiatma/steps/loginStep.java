package com.shidqiadiatma.steps;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.pages.loginPage;
import io.cucumber.java.en.Then;

public class loginStep {

    @Then("user verify snackbar error with value {string}")
    public void  userVerifySnackbarErrorWithValue(String value) {
        new loginPage(driverManager.getInstance().getDriver()).
                verify_snackbar_error_exist(value);
    }
    @Then("user verify title page with value {string}")
    public void userVerifyTitlePageWithValue(String value) {
        new loginPage(driverManager.getInstance().getDriver()).
                verifyTitlePage(value);
    }
}
