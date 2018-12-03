@Feature_TechnologyPage_DataDependencyOn
Feature: I verify DataDependencyOn TR for Technology


  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_DataDependencyOn_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_DataDependencyOn_02
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


  @AC_TechnologyPage_DataDependencyOn_03
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" is displayed in Data Dependencies for applictn
    Then I verify helptext of "<NewfieldName>" in Data Dependencies for applictn
    Then I search for "<Searchfield>" field in searchbox in Data Dependencies for applictn
    And only search item in Recipients of PData should be displayed in Data Dependencies for applictn
    Then clear the search "<Searchfield>" field in searchbox
   And I Select the below list of values under the "<NewfieldName>" in Data Dependencies for applictn
     |Abeledo Perrot|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"

    And Validate each item of present in Audit History values
      |Abeledo Perrot|

    Then I click on "Back to detail" button respective application details page should be displayed
    And  I click on "DATA GOVERNANCE" in detail page
    And Validare each item present in the detail page for Data Dependencies for applictn



    Examples:
      |NewfieldName|Searchfield|
      |Data Dependency On|ADI/ADE|
