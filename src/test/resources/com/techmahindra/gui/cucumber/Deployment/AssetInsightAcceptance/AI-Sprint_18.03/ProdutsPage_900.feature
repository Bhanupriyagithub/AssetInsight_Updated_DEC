@Feature_ProductsPage_900
Feature: I verify Please provide a short description of the product's use of personal data in the DataGovernance Tab Present in the Products Page

  Background:
    Given Asset Insight Home page should be displayed

  @AC_HomePage_900_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_900_02
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


  @AC_ProductPage_900_03
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" should present in the DataGovernance page
    And  I Check the type of the "<fieldName>" field
    Then I verify that Help text should be displayed for the "<fieldName>"
    And  I click on information box present next to General section
    Then I verify the "<fieldName>" and help text should be displayed in information textbox
    And  I verify that "<fieldName>" should be mandatory field
    Then I Verify if limit exceeds validation -message should get displayed
      | short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I Verify the updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated fields should get displayed in the Data Governance tab present in the Details page

    Examples:
      | fieldName                                                                |
      | Please provide a short description of the product's use of personal data |


