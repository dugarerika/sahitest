Feature: Vendor Inventory
 Background:
   Given user is on the vendor login page
   And the user login into the vendor with Admin credentials
     | Email     | Password   |
     |testsalon | testsalon1o |

  Scenario: User should be able to access to the inventory section
    When the user clicks on the inventory icon
    Then the user has access to the inventory section
    And clicks on close form

  Scenario: Verify ADD PRODUCT button works properly
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button
    Then the Add Product form is displayed
    And clicks on close form

  Scenario: Verify ADD BRAND button works properly
    When the user clicks on the inventory icon
    And the user clicks on the ADD BRAND button
    Then the Add Brand form is displayed
    And clicks on close form

  Scenario Outline: Verify required fields on Add Brand form
    When the user clicks on the inventory icon
    And the user clicks on the ADD PRODUCT button
    And the user enters <ProductName> and <ProductBrand> and <ProductCategory> and <ProductQuantity> and <ProductSKU> and <Price> info
    And click on the Submit button
    Then The <ExpectedMessage> is displayed
    And clicks on close form
    Examples:
    | ProductName | ProductSKU | ProductQuantity | Price | ProductBrand | ProductCategory | ExpectedMessage                |
    |             | ABC        | 2               | 12.4  | Inecto       | Uncategorized   | Please enter product name      |
    | AV          | ABC        | 2               | 12.4  | Inecto       | Uncategorized   | Product name must be at least 3 character |
    | Coconut Oil |            | 2               | 12.4  | Inecto       | Uncategorized   | Please enter product sku       |
    | Coconut Oil | ABC        |                 | 12.4  | Inecto       | Uncategorized   | Quantity must be a number      |
    | Coconut Oil | ABC        | A               |       | Inecto       | Uncategorized   | Quantity must be a number      |
    | Coconut Oil | ABC        | 2               |       | Inecto       | Uncategorized   | Price must be a number         |
    | Coconut Oil | ABC        | 2               | .     | Inecto       | Uncategorized   | Price must be a number         |
    | Coconut Oil | ABC        | 2               | 12.4  |              | Uncategorized   | Please select product brand    |
    | Coconut Oil | ABC        | 2               | 12.4  | Inecto       |                 | Please select product category |
    | Coconut Shampoo | 1234        | 2               | 10.4  | Inecto       | Uncategorized   | Created successfully           |
