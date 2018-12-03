@Feature_Technology_Tags
Feature: I verify a new field "Product Tags" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Technology_Tags_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Technology_Tags_02
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I check "<NewfieldName>" Type of Technology
    Then I verify helpText of Tags of Technology
    Then I add below tags to the Technology tag field
      |1<>%*&+:|
   Then check for validation message in the popup window
    Then I add below tags to the Technology tag field
      |123456|

   Then I click on "Save/Validate" button
    And  I click on "Audit history"
   And Validate each item of present in Audit History values
      |123456|

   Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for Tags for Product
      |123456|

    Then click on below tag of Technology
      |123456|
    Then i valid the tagged Technology page should be displayed
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
   Then I remove below tags to the Technology tag field
      |123456|

    Then I click on "Save/Validate" button


    Examples:
      |NewfieldName|
      |Tags|