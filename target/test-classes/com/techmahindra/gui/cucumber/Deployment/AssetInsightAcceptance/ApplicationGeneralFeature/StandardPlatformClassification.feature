@Feature_Technology_StandrPltfrm_Clariftn
Feature: I verify a new field "StandrPltfrm_Clariftn" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Technology_StandrPltfrm_Clariftn_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Technology_StandrPltfrm_Clariftn_02
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I check "Standard Platform Classification" is present in product
    Then I check "Platform Classification" is present in product
    Then I check "Platform Classification" is manadtory in product
#   Then I Select Platform Classification subitem in product
#   |Please select|
#    Then I click on "Save/Validate" button
#    Then I verify the validation message for Platform Classification in product
#    |Platform Classification is a required field.|
#    Then I Select Platform Classification subitem in product
#      |No Intent to Migrate|
#    Then I verify subquestions are should not be displayed
#    Then I Select Platform Classification subitem in product
#      |Awaiting Standard|
#    Then I verify subquestions are should not be displayed
#    Then I Select Platform Classification subitem in product
#     |Out of Scope|
#    Then I verify subquestions are should not be displayed
#    Then I Select Platform Classification subitem in product
#    |Aspire to Migrate|
#   Then I verify 2 subquestions are should be displayed
#   Then I Select Platform Classification subitem in product
#    |Migrating to Standard|
#    Then I verify 2 subquestions are should be displayed
#    Then I Select Platform Classification subitem in product
#    |At Standard|
#    Then I verify 2 subquestions are should be displayed
#     Then I Select Platform Classification subitem in product
#    |Retiring|
#    Then I verify 2 subquestions are should be displayed
#    Then I Select Platform Classification subitem in product
#      |At Standard|
#
#    And I Select Migration Date subquestion item in product
#    |10|
#    Then I click on "Save/Validate" button
#   Then I verify the validation message for Migration Date in product
#   |Migration Date has to be in the past|
#    And I Select Standard Platform subquestion item in product
#    |Please select|
#      Then I click on "Save/Validate" button
#    Then I verify the validation message for Standard Platform in product
#    |Standard Platform is a required field.|
#    Then I Select Platform Classification subitem in product
#      |Migrating to Standard|
#    And I Select Standard Platform subquestion item in product
#      |MAF|
#
#    And I Select Migration Date subquestion item in product
#    |-10|
#    Then I click on "Save/Validate" button
#
#================
# --   Then I verify the validation message for Migration Date in product
# --   |Migration Date has to be in the future |

#   -- |Please change the Migration date to a future date or change the classification type|
#    ========


#    And I Select Standard Platform subquestion item in product
#      |Optimus|
#    Then I Select Platform Classification subitem in product
#      |Aspire to Migrate|
#        And I Select Standard Platform subquestion item in product
#      |Please select|
#    Then I click on "Save/Validate" button
#    Then I verify the validation message for Standard Platform in product
#      |Standard Platform is a required field.|
#    And I Select Standard Platform subquestion item in product
#      |Optimus|
#
#    Then I click on "Save/Validate" button
#    Then I Select Platform Classification subitem in product
#      |At Standard|
#    And I Select Standard Platform subquestion item in product
#      |MAF|
#    Then I select empty date for Migration Date
#    Then I click on "Save/Validate" button
#   Then I verify Migartion Date validation message
#    |Migration Date is a required field|
#
#    Then I Select Platform Classification subitem in product
#      |Migrating to Standard|
#    And I Select Standard Platform subquestion item in product
#      |Please select|
#    Then I click on "Save/Validate" button
#    Then I verify the validation message for Standard Platform in product
#      |Standard Platform is a required field.|
#    Then I Select Platform Classification subitem in product
#      |Aspire to Migrate|
#    And I Select Standard Platform subquestion item in product
#      |Please select|
#    Then I click on "Save/Validate" button
#   Then I verify the validation message for Standard Platform in product
#      |Standard Platform is a required field.|
    Then I Select Platform Classification subitem in product
      |Migrating to Standard|
    And I Select Standard Platform subquestion item in product
      |MAF|
    Then I click on "Save/Validate" button


    And I Select Migration Date subquestion item in product
      |-10|
    Then I click on "Save/Validate" button
#  --  Then I verify the validation message for Migration Date in product
#----    |Migration Date has to be in the future |
#     -- |Please change the Migration date to a future date or change the classification type|

    Then I Select Platform Classification subitem in product
      |Retiring|
    And I Select Migration Date subquestion item in product
      |-10|
    Then I click on "Save/Validate" button
    Then I verify the validation message for Migration Date in product

      |Migration Date has to be in the future |

        Then I Select Platform Classification subitem in product
    |At Standard|
    And I Select Standard Platform subquestion item in product
      |MAF|
    And I Select Migration Date subquestion item in product
      |-10|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |At Standard|
      |MAF|

    Then I click on "Back to detail" button respective application details page should be displayed
    Then Validate each item of present in detail page in product
      |At Standard|
#      |MAF|








    Examples:
    |NewfieldName|
    |Standard Platform Classification|
