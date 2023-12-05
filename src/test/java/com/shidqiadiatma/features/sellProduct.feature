@sell
Feature: Update Profile

  @sell @positive
  Scenario: As a user, I should be able to update profile
    Given user navigate to url "https://secondhand.binaracademy.org/users/sign_in"
    When user login using "correct registered credential"
    * user click jual button
    * user fills in all product data
    Then user verify product uploaded successfully