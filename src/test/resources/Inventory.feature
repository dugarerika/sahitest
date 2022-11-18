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

  Scenario: Verify ADD PRODUCT button works properly
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button
    Then the Add Product form is displayed

  Scenario: Verify ADD BRAND button works properly
    When the user clicks on the inventory icon
    And the user clicks on the ADD BRAND button
    Then the Add Brand form is displayed

  Scenario Outline: Verify required fields on Add Brand form
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button
    And the user enters <ProductName> and <ProductBrand> and <ProductCategory> and <ProductQuantity> and <ProductSKU> and <Price> info
    And click on the Submit button
    Examples:
    | ProductName | ProductSKU | ProductQuantity | Price | ProductBrand | ProductCategory | ExpectedMessage                |
    |             | ABC        | 2               | 12.4  | Inecto       | Uncategorized   | Please enter product Name      |
    | Coconut Oil |            | 2               | 12.4  | Inecto       | Uncategorized   | Please enter product SKU       |
    | Coconut Oil | ABC        |                 | 12.4  | Inecto       | Uncategorized   | Quantity must be a number      |
    | Coconut Oil | ABC        | 2               |       | Inecto       | Uncategorized   | Price must be a number         |
    | Coconut Oil | ABC        | 2               | 12.4  |              | Uncategorized   | Please select a Product Brand  |
    | Coconut Oil | ABC        | 2               | 12.4  | Inecto       |                 | Please select product Category |