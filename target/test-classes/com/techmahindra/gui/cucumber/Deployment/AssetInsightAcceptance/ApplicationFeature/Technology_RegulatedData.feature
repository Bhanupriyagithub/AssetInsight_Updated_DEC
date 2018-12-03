@Feature_TechnologyPage_Regulated_Data
Feature: I verify Regulated Data TR for Technology


  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_Regulated_Data_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_Regulated_Data_02
  Scenario: Creating a New Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I create New Application in the Technology page for below mandatory fields
      | Application Name                | Data Management System   |
      | Short Name                      | DM                      |
      | Launch Year                     | 1998                     |
      | Business Unit (BU)              | Financial & Risk         |
      | Application Type                | Software Sale            |
      | Description                     | Data Management System   |
      | Application Development Contact | Prashanthi Modium        |
      | AML Business Contact            | Beaumont, Stewart (TRGR) |
      | Platform Classification         | No Intent to Migrate     |
    Then I click on "SAVE/VALIDATE" button


  @AC_TechnologyPage_Regulated_Data_03
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" is displayed for applictn
    Then I verify "<NewfieldName>" is manadatory for applictn
    Then I check "<NewfieldName>" type for application
    Then I select "<NewfieldName>" for application below Items
    |Sarbanes-Oxley (SOX)|
     |Health (including data covered by HIPAA)|
    Then I select "<NewfieldName>" for application below Items
    |Other|
    Then I verify "<NewfieldName>" for other field is displayed
    Then I verify "<NewfieldName>" for other Textbox is manadatory
    Then I verify "<NewfieldName>" for other Textbox sholud be displayed
    Then I Verify if limit exceeds validation -message should get displayed for application
      |short description of use of personal data short description of the products use of personal data short descri short description of use of personal data short description of the products use of personal data short descri short description sproducts use of personal data short descri short description s|
    Then I select "<NewfieldName>" for application below Items
    |None|
    Then I select "<NewfieldName>" for application below Items
      |FISMA|
      |PCI DSS|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |FISMA|
      |PCI DSS|

    Then I click on "Back to detail" button respective application details page should be displayed
    And  I click on "DATA GOVERNANCE" in detail page
    And Validate each item present in the detail page for Regulated Data for applictn

    Examples:
    |NewfieldName|
    |Regulated Data|

