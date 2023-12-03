@register
Feature: Register

  @register @positive
  Scenario: As a user, I should be able to register with an unregistered email on secondhand-binaracademy.
    Given user navigate to url "https://secondhand.binaracademy.org/users/sign_up"
    When user registration using "correct unregistered data"
    Then user direct to dashboard screen
    * user take screenshot on dashboard screen "user_register_successfully"

  @register @negative
  Scenario Outline: As a user, I shouldn't be able to register with a registered email on secondhand-binaracademy.
    Given user navigate to url "https://secondhand.binaracademy.org/users/sign_up"
    When user registration using "registered data"
    Then user verify inline error with value "<errorMessage>"
    * user take screenshot with inline error "user_failed_register_with_registered_email"

    Examples:
      | errorMessage                                                       |
      | Email has already been taken |