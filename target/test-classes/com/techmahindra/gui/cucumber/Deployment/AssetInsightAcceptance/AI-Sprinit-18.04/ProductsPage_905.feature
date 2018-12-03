@Feature_ProductsPage_905
Feature: If your product involves Does Thomson Reuters jointly decide how to use personal data in your product with any other party?
#  the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department?

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_905_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_905_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" is present in the Data Governance page for PRD
    And  I Check the type of "<Newfield>" Type field in the Data Governance page for PRD
   And  I verify that 'Help text' displayed for "<Newfield>" is displayed for PRD
   And  I verify that "<Newfield>" should be a mandatory field for PRD
    When I click on No radio button "<Newfield>" subquestion should not be displayed
   When I click on I don't know radio button "<Newfield>" subquestion should not be displayed
    When I click on Yes radio button "<Newfield>" subquestion should be displayed
    And I verify subquestion textfield is mandatory for PRDJNT
    And I verify subquestion textfield is mandatory for PRDJNT for Contract
   Then I verify help text of "<Newfield>" for contract number and/or TR personnel
   Then I Verify if limit -exceed validation message should be displayed for description for PRD DESCRP
      | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period mk;owlk'wlw|
   Then I Verify if limit -exceed validation message should be displayed for contract number and/or TR personnel
     | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period mk;owlk'wlw|

    Then I Verify by adding valid data for field for TR jointly decides use of Pdata for PersonalDataJointDecisionDescription
   |Thomson Reuters personnel123 && ** NNN|


    Then I click on "Save/Validate" button
    And  I click on "Audit history"

    And Validate each item of present in Audit History values
      |Thomson Reuters personnel123 && ** NNN |


    Then I click on "Back to detail" button respective application details page should be displayed

    And Validate item present in detail page for TR Jointly decides field

    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    When I click on I don't know radio button "<Newfield>" subquestion should not be displayed
    Then I click on "Save/Validate" button


    Examples:
      | Newfield |
    |Does Thomson Reuters jointly decide how to use personal data in your product with any other party? |
