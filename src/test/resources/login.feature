Feature: Vendor Login

  Scenario: User should be able to login with valid credentials
    Given user is on the vendor login page
    When the user enters credentials
      | Email     | Password    |
      | testsalon | testsalon1o |
    And hits SIGN IN
    Then the user should be logged successfully
    And Close browser

  Scenario: User should not be able to login with invalid credentials
    Given user is on the vendor login page
    When the user enters credentials
      | Email | Password |
      | testx | secretx  |
    And hits SIGN IN
    Then An error message is displayed
    And Close browser

  Scenario: Email credential is required
    Given user is on the vendor login page
    When the user enters credentials
      | Email | Password |
      |       | secretx  |
    And hits SIGN IN
    Then error message username address is required is displayed
    And Close browser

  Scenario: Password credential is required
    Given user is on the vendor login page
    When the user enters credentials
      | Email | Password |
      | testx |          |
    And hits SIGN IN
    Then error message Password is required displayed
    And Close browser

  Scenario: Email and password credentials are required
    Given user is on the vendor login page
    When the user left credentials empty
    And hits SIGN IN
    Then error messages are displayed
    And Close browser

