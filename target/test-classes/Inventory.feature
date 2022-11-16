@After
Feature: Vendor Inventory

  Background:
    Given user is on the vendor login page
    And the user login into the vendor with Admin credentials
      | Email     | Password   |
      |testsalon | testsalon1o |

  Scenario: User should be able to access to the inventory section
    When the user clicks on the inventory icon
    Then the user has access to the inventory section

  Scenario: User should be able to access to the inventory section
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button
    Then the Add Product form is displayed

  Scenario: Verify required fields on Add Brand form
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button

  Scenario: Verify ADD BRAND button works properly
    When the user clicks on the inventory icon
    And the user clicks on the ADD BRAND button
    Then the Add Brand form is displayed