@Feature_PAZ_ID
Feature: I verify a new field "PAZ_ID" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_PAZ_ID_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_PAZ_ID_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" helptext of the PRD
   Then I add data for PAZ ID of PRD
    |AFFGYHUUI!@$|
    Then I click on "Save/Validate" button
    Then I verify the validation message for PAZ ID of PRD
    Then I add data for PAZ ID of PRD
    |12345|
   Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |12345|
    Then I click on "Back to detail" button respective application details page should be displayed
   And Validate each item present in the detail page for PRD PAZ for Product


    Examples:
      |NewfieldName|
      |PAZ ID |