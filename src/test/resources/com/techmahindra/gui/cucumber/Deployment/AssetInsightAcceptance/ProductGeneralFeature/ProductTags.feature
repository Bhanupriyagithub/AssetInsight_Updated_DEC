@Feature_Product_Tags
Feature: I verify a new field "Product Tags" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Product_Tags_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Product_Tags_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
#    Then I verify "<NewfieldName>" is present for PRD
    Then I check "<NewfieldName>" Type of Product
    Then I add below tags to the Product tag field
    |1<>%*|
    |23&+:|
    Then check for validation message in the popup window
    Then I click on OK Button of popup window
    Then I add below tags to the Product tag field
    |12345|
    |nnnnn|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |12345|
      |nnnnn|
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for EnterpriseOwner for Product
      |12345|
      |nnnnn|
    Then click on below tag of product
      |12345|
    Then i valid the tagged product page should be displayed
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I remove below tags to the Product tag field
      |12345|
      |nnnnn|
    Then I click on "Save/Validate" button





    Examples:
    |NewfieldName|
    |Tags|