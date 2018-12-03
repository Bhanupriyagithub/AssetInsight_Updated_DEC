@Feature_Business_Sub_Segment
Feature: I verify a new field "Business Sub Segment" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Business_Sub_Segment_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Business_Sub_Segment_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" is Mandatory for PRD
    Then I verify "<NewfieldName>" helptext for PRD
    Then I select item from dropdown list for Business Sub Segement for PRD
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Intellectual Property and Science|
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for Business Sub Segment

    Examples:
      |NewfieldName|
      |Business Sub Segment|