@Feature_ProductsPage_904
Feature: Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used?

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_904_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed


  @AC_ProductPage_904_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" is present in the Data Governance page for PROD
    Then I verify the "<Newfield>" is manadatory
    And  I Check the type of "<Newfield>" Type field in the Data Governance page for PROD
    When I click on Yes radio button "<Newfield>" subquestion should not be displayed
    When I click on No radio button "<Newfield>" subquestion should be displayed
    Then I verify the "<Newfield>" subquestion is manadatory
    When I click on I don't know radio button "<Newfield>" subquestion should be displayed
    Then I verify the "<Newfield>" subquestion is manadatory
    When I click on No radio button "<Newfield>" Yes No and I don't know subquestion radio button should be displayed
    And  I Check the type of radio button "<Newfield>" for subquestion Yes No and I don't know subquestion type
    Then I check for the help text of "<Newfield>" of subquestion
    Then I click on No button of "<Newfield>" of subquestion
    Then I verify subquestion of "<Newfield>" name and contact details should not be displayed
    Then I click on I don't know button of "<Newfield>" of subquestion
    Then I verify subquestion of "<Newfield>" name and contact details should not be displayed
    Then I click on Yes button of "<Newfield>" of subquestion
    Then I verify subquestion name and contact details should be displayed
   Then I verify subquestion name and contact details should be manadatory
    Then I verify subquestion name and contact details of helpTXT

    Then I Verify if limit -exceed validation message should be displayed for description for name and contact details
    | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period mk;owlk'wlw|
    Then I clear the textbox of description for name and contact details
    Then I verify by adding valid data for field for Personal data subcontract
      |Thomson Reuters personnel123 && ** NNN |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Thomson Reuters personnel123 && ** NNN |
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I validatr each item present in Back to detail values
      |Thomson Reuters personnel123 && ** NNN |




    Examples:
      | Newfield |
    | Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used?   |