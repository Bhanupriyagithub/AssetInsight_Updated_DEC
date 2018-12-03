@Feature_Technology_Status
Feature: I verify a new field "Status" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Technology_Status_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Technology_Status_02
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" field is present in Product

    Then I verify I select items from  Status in Product

    |Active|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Active|

    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for Status for Product





    Examples:
    |NewfieldName|
    |Status|

