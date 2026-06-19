@Regression     #this tag is comman in all Senario so we can write it above Feature
Feature: Place order feature

  Background:
    Given user should get logged in
    When user should be at orders page

  @Sanity  @Stability #Regression
  Scenario: S1 - fetch currently placed order
    And user click on current orders
    Then user should see currently placed orders

  @Smoke   #Regression
  Scenario: S2 - fetch previously placed order
    And user click on previous orders
    Then user should see previously placed orders

  @Performance   #Regression
  Scenario: S3 - fetch canceled order info
    And user click on cancel orders
    Then user should see canceled orders info