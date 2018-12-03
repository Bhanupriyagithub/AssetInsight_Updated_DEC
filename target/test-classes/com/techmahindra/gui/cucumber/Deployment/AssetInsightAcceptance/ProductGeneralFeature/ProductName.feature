@Feature_ProductName
Feature: I verify a new field "Product Name" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_ProductName_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_ProductName_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" is Mandatory for product
    Then I verify "<NewfieldName>" helptext for product
    Then I verify that if the limit exceeds validation -message should get displayed for product
     | Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible spe |
    Then I clear the textbox of description for Product Name
    Then I verify "<NewfieldName>" is blank field for Product
      Then I clear the textbox of description for Product Name
    Then I click on "Save/Validate" button
    Then I verify "<NewfieldName>" validation message for blank field
    Then I verify "<NewfieldName>" for product
   | Product Name         | Product                           |
    Then I clear the textbox of description for Product Name
    Then I verify "3E" enter valid data for Product

    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |3E|
    Then I click on "Back to detail" button respective application details page should be displayed


    Examples:
    |NewfieldName|
    |Product Name|
