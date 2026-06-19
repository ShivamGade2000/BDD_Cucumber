Feature: Place order feature

  Background:
    Given user should get logged in
    When user should be at orders page

  Scenario: S1 - fetch currently placed order
    And user click on current orders
    Then user should see currently placed orders

  Scenario: S2 - fetch previously placed order
    And user click on previous orders
    Then user should see previously placed orders

  Scenario: S3 - fetch canceled order info
    And user click on cancel orders
    Then user should see canceled orders info