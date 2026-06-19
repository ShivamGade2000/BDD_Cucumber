Feature: Logibn to app with test data

  Scenario: S4-login with valid data
    Given open browser
    When user enter username as "abc"
    And user enter password as "xyz"
    And user click on login button
    Then homepage should be visible as "Swag Lab" logo text