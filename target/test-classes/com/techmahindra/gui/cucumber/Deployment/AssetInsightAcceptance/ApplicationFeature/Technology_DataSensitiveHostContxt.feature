@Feature_TechnologyPage_DataSensitiveHostContxt
Feature: I verify DataSensitiveHostContxt TR for Technology


  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_DataSensitiveHostContxt_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_DataSensitiveHostContxt_02
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


  @AC_TechnologyPage_DataSensitiveHostContxt_03
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab

    Then I verify "<NewfieldName>" is displayed in DataGovernance for applictn
    Then I verify "<NewfieldName>" is displayed in DataGovernance is mandatory for applictn
    Then I verify type of "<NewfieldName>" for applict
    Then I verify helptext of "<NewfieldName>" for applictn
    Then I click on NO radio button of "<NewfieldName>" for applict
    Then I verify "<NewfieldName>" subquestions are should not be displayed
    Then I click on YES radio button of "<NewfieldName>" for appliction
    Then I verify "<NewfieldName>" subquestions are should be displayed
    Then I verify "<NewfieldName>" subquestion1 is mandatory
    Then I clear "<NewfieldName>" subquestion1 textbox
    Then I Verify if limit -exceed validation message should be displayed for DataSensitiveHost
    | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period mk;owlk'wlw|
    Then I clear "<NewfieldName>" subquestion1 textbox
    Then I Verify by adding valid data for field for DataSensitiveHost for SubQuestn1 for application
    | Thomson Reuters personnel123 && ** NNN  |
    Then I Verify by adding valid data for field for DataSensitiveHost for SubQuestn2
    |https://assetsqa.int.thomsonreuters.com|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Thomson Reuters personnel123 && ** NNN |
      |https://assetsqa.int.thomsonreuters.com|

    Examples:
      |NewfieldName|
      |Data Sensitive to Hosting Context|

