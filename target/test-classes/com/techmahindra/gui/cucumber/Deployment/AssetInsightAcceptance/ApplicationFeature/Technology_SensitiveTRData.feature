@Feature_TechnologyPage_SensitiveTRData
Feature: I verify Sensitive TR data for Technology


  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_SensitiveTRData_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_SensitiveTRData_02
  Scenario: Creating a New Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I create New Application in the Technology page for below mandatory fields
      | Application Name                | Data Management System   |
      | Short Name                      | DM                       |
      | Launch Year                     | 1998                     |
      | Business Unit (BU)              | Financial & Risk         |
      | Application Type                | Software Sale            |
      | Description                     | Data Management System   |
      | Application Development Contact | Prashanthi Modium        |
      | AML Business Contact            | Beaumont, Stewart (TRGR) |
      | Platform Classification         | No Intent to Migrate     |
    Then I click on "SAVE/VALIDATE" button


  @AC_TechnologyPage_SensitiveTRData_03
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" is displayed in DataGovernance for appl
    Then I verify "<NewfieldName>" is displayed in DataGovernance is mandatory for application
    Then I verify type of "<NewfieldName>" for application
    Then I click on NO radio button of "<NewfieldName>" for application
    Then I click on YES radio button of "<NewfieldName>" for application
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
     |Yes|
    Then I click on "Back to detail" button respective application details page should be displayed
    And  I click on "DATA GOVERNANCE" in detail page
    And verify each item in detail page


    Examples:
    |NewfieldName|
    |Sensitive Thomson Reuters Data|
