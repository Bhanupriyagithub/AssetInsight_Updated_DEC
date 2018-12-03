@Feature_TechnologyPage_885
Feature: I verify Common Validation for application and its basis is added.

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_885_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_885_02
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


  @AC_TechnologyPage_885_03
  Scenario Outline: I Verify new New field in the Existing Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab

    Then I click on "Sensitive PII Data" NO radio button
    Then I click on "Standard PII Data" NO radio button of app
    Then I click on NO radio button of Is TR able to view, edit, delete, share, change or use the personal data
    Then I click on NO radio button of Is TR free to decide PD is viewed edited deleted shared changed or used for appl
    Then I click on NO radio button of subquestion share any personal data from your application with any sub-contractor/service
    Then I click on NO radio button of Does Thomson Reuters jointly decide how to use personal data in your application
    Then I click on NO radion button please confirm if you share any personal data from your application with any sub-contractor/service provider used by TR
    Then I click on NO radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected
    Then I click on NO radio button of If your application involves the transfer of personal data to a third party
    Then I click on NO radio button of Does the retention period vary according to the types of data stored
    Then I click on "Save/Validate" button


    Then I click on YES radio button of Is TR able to view, edit, delete, share, change or use the personal data
    Then I click on YES radio button of Is TR free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used
    Then I click on YES radio button of Does Thomson Reuters jointly decide how to use personal data in your application with any other party
    Then I click on YES radion button please confirm if you share any personal data from your application with any sub-contractor/service provider used by TR
    Then I click on YES radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected
    Then I click on YES radio button of If your application involves the transfer of personal data to a third party is there a contract in place with the third party
    Then I click on YES radio button of Does the retention period vary according to the types of data stored
    Then I click on "Save/Validate" button
    Then I check there should be common validation message displayed


    Then I click on IDNK radio button of Is TR free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used
    Then I click on IDNK radio button of Does Thomson Reuters jointly decide how to use personal data in your application with any other party
    Then I click on NO radion button please confirm if you share any personal data from your application with any sub-contractor/service provider used by TR
    Then I click on IDNK radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected
    Then I click on IDNK radio button of If your application involves the transfer of personal data to a third party  is there a contract in place with the third party

    Then I click on "Save/Validate" button
   Then I check there should be common validation message displayed

    Examples:
      | NewfieldName                                            |
      | Sensitive PII Data Subjects  |








