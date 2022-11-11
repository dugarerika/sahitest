Feature: Vendor Inventory

  Scenario: User should be able to access to the inventory section
    Given the user login into the vendor with Admin credentials
      | Email     | Password   |
      |testsalon | testsalon1o |
    When the user clicks on the inventory icon
    And hits SIGN IN
    Then the user has access to the inventory section
    And Close browser