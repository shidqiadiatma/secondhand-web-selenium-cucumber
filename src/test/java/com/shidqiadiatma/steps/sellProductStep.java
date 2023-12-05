package com.shidqiadiatma.steps;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.pages.sellProductPage;
import io.cucumber.java.en.Then;

public class sellProductStep {
    @Then("user verify product uploaded successfully")
    public void userVerifyProductUploadedSuccessfully() {
        new sellProductPage(driverManager.getInstance().getDriver());
        sellProductPage.verifyProduct();
    }
}
