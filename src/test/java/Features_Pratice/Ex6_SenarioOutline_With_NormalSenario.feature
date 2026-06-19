Feature: Login feature with senario outline

  Scenario Outline: S8- login to application
    Given user in at signup pager
    When user enters "<Name>" inside form
    And user enters age as <Age>
    And user confirms gender as "<Gender>"
    Then user gets created

    Examples:
      | Name   | Age  | Gender |
      | Shivam | 24   | Male   |
      | Mahesh | 23   | Male   |
      | Abhi   | 25   | Male   |


  Scenario: S9-login to application
    Given user in at signup pager
    When user enters "Shivam" inside form
    And user enters age as 24
    And user confirms gender as "Male"
    Then user gets created
