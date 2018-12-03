@Feature_TechnologyPage_873
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_873_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage__873_02
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


  @AC_TechnologyPage_873_03
  Scenario Outline: I Verify new New field in the Existing Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    When I click Yes radio button "<NewfieldName1>" if not selected then "<NewfieldName>" should be displayed in app
    Then I check "<NewfieldName>" is manadatory for SENSIPIISUB
    Then I verify subquestion "<NewfieldName>" of helpTXT for SENSIPIISUB
    Then I verify below list of values should be present under "Sensitive PII Data Subjects " sub field
      |Client(s) of Corporate Individual Consumer of Thomson Reuters Product |
      |Client(s) of Private Individual Consumer of Thomson Reuters Product    |
      |Staff of Corporate Individual Consumer of Thomson Reuters Product      |
      |Staff of Private Individual Consumer of Thomson Reuters Product        |
      |Thomson Reuters service providers                                      |
      |Thomson Reuters partners                                               |
    And I Select the below list of values under the "<Newfield>" product sub field SENSIPIISUB
      |Client(s) of Corporate Individual Consumer of Thomson Reuters Product |
      |Client(s) of Private Individual Consumer of Thomson Reuters Product    |
      |Staff of Corporate Individual Consumer of Thomson Reuters Product      |
      |Staff of Private Individual Consumer of Thomson Reuters Product        |
      |Thomson Reuters service providers                                      |
      |Thomson Reuters partners                                               |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Client(s) of Corporate Individual Consumer of Thomson Reuters Product |
      |Client(s) of Private Individual Consumer of Thomson Reuters Product    |
      |Staff of Corporate Individual Consumer of Thomson Reuters Product      |
      |Staff of Private Individual Consumer of Thomson Reuters Product        |
      |Thomson Reuters service providers                                      |
      |Thomson Reuters partners                                               |
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item of present in detail page
      | Client(s) of Corporate Individual Consumer of Thomson Reuters Product |
      |Client(s) of Private Individual Consumer of Thomson Reuters Product    |
      |Staff of Corporate Individual Consumer of Thomson Reuters Product      |
      |Staff of Private Individual Consumer of Thomson Reuters Product        |
      |Thomson Reuters service providers                                      |
      |Thomson Reuters partners                                               |


    Examples:
      | NewfieldName                                 | NewfieldName1              |
      | Sensitive PII Data Subjects  |Sensitive PII Data |



