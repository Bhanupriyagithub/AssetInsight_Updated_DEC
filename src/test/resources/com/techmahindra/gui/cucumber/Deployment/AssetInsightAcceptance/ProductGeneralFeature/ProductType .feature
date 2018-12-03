@Feature_Product_Type
Feature: I verify a new field "Product Type" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Product_Type_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Product_Type_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" helptext for the PROD
    Then I select item from dropdown list for Product Type
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Platform|
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for PRD Type for Product


    Examples:
      |NewfieldName|
      |Product Type|