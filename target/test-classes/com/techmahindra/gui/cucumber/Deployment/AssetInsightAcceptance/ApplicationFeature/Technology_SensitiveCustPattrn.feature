@Feature_TechnologyPage_SensitiveCust
Feature: I verify Sensitive Customer Pattern for Technology


  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_SensitiveCust_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_SensitiveCust_02
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


  @AC_TechnologyPage_SensitiveCust_03
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" is displayed in DataGovernance for application
    Then I verify "<NewfieldName>" is displayed in DataGovernance is mandatory for appl
    Then I verify type of "<NewfieldName>" for app
    Then I click on NO radio button of "<NewfieldName>" for app
   Then I verify "<NewfieldName1>" and "<NewfieldName2>" of "<NewfieldName>" for app should not be displayed
    Then I click on YES radio button of "<NewfieldName>" for app
   Then I verify "<NewfieldName1>" and "<NewfieldName2>" of "<NewfieldName>" for app should be displayed
   Then I verify "<NewfieldName1>" is manadatory for app
   Then I verify "<NewfieldName2>" is manadatory for application
  Then I search for "<Searchfield>" field in searchbox for app
    And only search item in Recipients of Sensitive Customer should be displayed
    Then clear the search "<Searchfield>" field in searchbox
  Then I search for "<Searchfield1>" field in searchbox for application
    And only search item in Recipients of Sensitive Customer Pattern Data should be displayed
    Then clear the search "<Searchfield1>" field in searchbox
    And I Select the below list of values under the "<NewfieldName1>" product sub field for app
      |Customer behavioral data|
    And I Select the below list of values under the "<NewfieldName2>" product sub field for app for Purpose
   |Customer Onboarding|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Customer behavioral data|
      |Customer Onboarding|
    Then I click on "Back to detail" button respective application details page should be displayed


    Examples:
    |NewfieldName|NewfieldName1|NewfieldName2|Searchfield|Searchfield1|
    |Sensitive Customer or Partner Data|Sensitive PII Data Type|Sensitive PII Data Context|Customer input data|Customer Support|