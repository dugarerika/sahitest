Feature: Vendor Login

  Scenario: User should be able to login with valid credentials
    Given user is on the vendor login page
    When the user enters credentials
      | Email     | Password    |
      | testsalon | testsalon1o |
    And hits SIGN IN
    Then the user should be logged successfully
    And Close browser