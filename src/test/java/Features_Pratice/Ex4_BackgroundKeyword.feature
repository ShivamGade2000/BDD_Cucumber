Feature: login to application

  Background:
    Given open browser
    When user enter username

  Scenario: S5-Login with valid credentials
    And user enter password
    And user click on login button
    Then homepage should be visible

    Scenario: S6-login with invalid credentials
      And user enter wrong password
      And user click on login button
      Then error msg should be visible