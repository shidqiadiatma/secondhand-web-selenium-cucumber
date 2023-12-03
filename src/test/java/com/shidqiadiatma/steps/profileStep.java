package com.shidqiadiatma.steps;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.pages.homePage;
import com.shidqiadiatma.pages.loginPage;
import io.cucumber.java.en.Then;

public class profileStep {

    @Then("user verify profile data is changes")
    public void  userVerifyProfileDataIsChanges() {
        new homePage(driverManager.getInstance().getDriver());
        homePage.do_verify_profile_data_is_changes();

    }
}
