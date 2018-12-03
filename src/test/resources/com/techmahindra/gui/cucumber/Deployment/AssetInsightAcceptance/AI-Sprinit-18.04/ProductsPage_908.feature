@Feature_ProductsPage_908
Feature: If your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department?

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_908_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_908_02
  Scenario: Creating a New Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    Then I create New Product in the product page for below mandatory fields
      | Product Name         | Product                           |
      | Business Unit        | Intellectual Property and Science |
      | Business Sub Segment | EBS                               |
      | Product Status       | Not Yet Launched                  |
      | Product Level        | Base                              |
      | Marketing Contact    | Modium, Prashanthi                |
    Then I click on "SAVE/VALIDATE" button


  @AC_ProductPage_908_03
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" is present in the Data Governance page
    And  I Check the type of "<Newfield>" Type field in the Data Governance page
    And  I verify that 'Help text' displayed for "<Newfield>" is displayed
    And  I verify that "<Newfield>" should be a mandatory field
#    When I click on No radio button "third party, contract number and/or Thomson Reuters personnel" subquestion should not be displayed
#
#    When I click on I don't know radio button "third party, contract number and/or Thomson Reuters personnel" subquestion should not be displayed
#
#    When I click on Yes radio button "third party, contract number and/or Thomson Reuters personnel" subquestion should be displayed

    When I click on No radio button "personal data to a third party (e.g. vendor, service provider, customer)" of Product subquestion should not be displayed
    When I click on I don't know radio button "personal data to a third party (e.g. vendor, service provider, customer)" of Product subquestion should not be displayed
    When I click on Yes radio button "personal data to a third party (e.g. vendor, service provider, customer)" of Product subquestion should be displayed
    And I verify subquestion textfield is mandatory
    Then I Verify if limit -exceed validation message should be displayed for THRD PRTY
      | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period mk;owlk'wlw|
    Then I click on "Save/Validate" button
#     Then I Verify if value is validation message should be displayed
     Then clear the THRD PRTY textbox value
#    Then I Verify by adding valid data for field for THRDPRTY
#    ||
    Then I Verify by adding valid data for field for THRDPRTY
     |Thomson Reuters personnel123 && ** NNN |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Thomson Reuters personnel123 && ** NNN |

   Then I click on "Back to detail" button respective application details page should be displayed

   Examples:
      | Newfield |
      |If your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department? |
