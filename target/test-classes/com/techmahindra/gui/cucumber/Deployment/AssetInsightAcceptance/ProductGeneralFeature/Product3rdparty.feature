@Feature_Prd3rdparty
Feature: I verify a new field "3rd Party" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Prd3rdparty_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Prd3rdparty_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" field helptext for prod
    Then I verify "<NewfieldName>" type for prod
    Then I click on "No" button for Product
    Then I click on "Yes" button for Product for 3rd Party

    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Yes|
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for Product3rd paryt for Product




    Examples:
    |NewfieldName|
    |3rd party|
