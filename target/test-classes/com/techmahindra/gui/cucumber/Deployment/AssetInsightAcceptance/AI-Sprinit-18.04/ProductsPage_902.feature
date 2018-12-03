@Feature_ProductsPage_902
Feature: If your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department?

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_902_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_902_02
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


  @AC_ProductPage_902_03
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" is present in the Data Governance page for PRODUCT
    Then I verify the information icon next to "<Newfield>" header
   Then I click on the information icon next to "<Newfield>" header
    Then I verify the "<Newfield>" external link to GDPR page should be displayed
   Then I click on the "<Newfield>" external link to GDPR page
    Then I click on "Back to detail" button respective application details page should be displayed
    #Then I check "<Newfield>" is present in the detail page



    Examples:
      | Newfield |
      |ADDITIONAL ARTICLE 30 QUESTIONS|
