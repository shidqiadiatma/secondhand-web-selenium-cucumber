package com.shidqiadiatma.steps;

import com.shidqiadiatma.factories.driverManager;
import com.shidqiadiatma.helpers.keyword;
import com.shidqiadiatma.helpers.randomData;
import com.shidqiadiatma.pages.homePage;
import com.shidqiadiatma.pages.loginPage;
import com.shidqiadiatma.pages.profilePage;
import com.shidqiadiatma.pages.registerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class commonStep {
    @Given("user navigate to url {string}")
    public void navigateToUrl(String url) {
        keyword.navigateToUrl(url);
    }

    public static class registerCommon{
        @When("user registration using {string}")
        public void userRegistrationUsing(String credentialData) {

            String userName = "";
            String email = "";
            String password = "";

            switch (credentialData) {
                case "correct unregistered data" -> {
                    userName = randomData.getFullName();
                    email    = randomData.getEmail();
                    password = "P@ssw0rd123";
                }
                case "registered data" -> {
                    userName = "Shidqi Ngetes";
                    email    = "udahdiregister@nihbang.com";
                    password = "passwordBinar";
                }
                default -> throw new RuntimeException("credential type doesn't exist");
            }
            registerPage RegisterPage = new registerPage(driverManager.getInstance().getDriver());
            RegisterPage.userRegister(userName, email, password);
        }

        @And("user take screenshot on dashboard screen {string}")
        public void userTakeScreenshotOnDashboardScreen (String screenshot_1) {
            keyword.takeScreenshot(screenshot_1);
        }
        @And("user take screenshot with inline error {string}")
        public void user_take_screenshot_with_inline_error (String screenshot_2) {
            keyword.takeScreenshot(screenshot_2);
        }

    }

    public static class loginCommon{
        @When("user login using {string}")
        public void loginAs(String credentialType) {

            String email;
            String password;

            switch (credentialType) {
                case "correct registered credential" -> {
                    email = "shidqiadiatma@mail.com";
                    password = "P@ssw0rd123";
                }
                case "wrong password" -> {
                    email = "shidqiadiatma@mail.com";
                    password = "wrong_password";
                }
                default -> throw new RuntimeException("credential type doesn't exist");
            }
            loginPage loginPage = new loginPage(driverManager.getInstance().getDriver());
            loginPage.userLogin(email, password);
        }

        @Then("current url should be {string}")
        public void currentUrlShouldBe(String expectedUrl) {
            keyword.assertCurrentUrl(expectedUrl);
        }

        @And("user take screenshot with snackbar error {string}")
        public void userTakeScreenshotWithSnackbarError (String screenshot_3) {
            keyword.takeScreenshot(screenshot_3);
        }


        @And("user take screenshot full page with name {string}")
        public void userTakeScreenshotFullPageWithName(String fileName) {
            keyword.takeScreenshot(fileName);
        }

    }

    public static class profileCommon{
        @And("user click profile icon")
        public void userClickProfileIcon(){
            new homePage(driverManager.getInstance().getDriver());
            homePage.verify_profile_user_exist();
            homePage.tap_username();
        }

        @And("user change user profile data")
        public void userChangeProfileData() {
            new profilePage(driverManager.getInstance().getDriver());
            profilePage.user_do_update_profile(randomData.getFirstName(), randomData.getStreetAddress(),randomData.getPhoneNumber());

        }




    }

}