Feature: products feature

  Background:
    Given user is on Swag lab login
    When user enter username on swaglab login page "standard_user"
    And wait for 2 seconds
    And user enter password on swaglab login page "secret_sauce"
    And wait for 3 seconds
    And user click on login btn on swaglab login page
    And wait for 3 seconds


  Scenario Outline: TC7- purchase multiple product E2E
    When user click on backpack products add to cart btn
    And user click on cartlink
    And user click on checkout button
    And wait for 3 seconds
    And user enter FN as "<firstname>"
    And wait for 3 seconds
    And user enter LN as "<lastname>"
    And wait for 3 seconds
    And user enter zip code as "<zipcode>"
    And wait for 3 seconds
    And user click on continue button
    And wait for 3 seconds
    And user click on Finish button
    Then order success message should be visible with message "Thank you for your order!"

    Examples:
    | firstname | lastname  | zipcode  |
    | abc1      | xyz1      | 111111  |
    | abc2      | xyz2      | 222222  |
    | abc3      | xyz3      | 333333  |



