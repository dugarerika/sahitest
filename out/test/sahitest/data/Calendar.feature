Feature: Vendor Calendar
 Background:
   Given user is on the vendor login page
   And the user login into the vendor with Admin credentials
     | Email     | Password   |
     |testsalon  | testsalon1o |

  Scenario: User should be able to access to the calendar section
    When the user clicks on the calendar icon
    Then the user has access to the inventory section
    And Close

