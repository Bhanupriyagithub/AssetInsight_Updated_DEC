#@Feature_Technology_ASSET_Ownership
#Feature: I verify a new field "ASSET_Ownership" for Product
#
#  Background: Given Asset Insight Home page should be displayed
#
#  @AC_HomePage_Technology_ASSET_Ownership_01
#  Scenario: Given Asset Insight Home page should be displayed
#    When I click on the "Home" in the homepage
#    Then I verify the respective "Home" page is displayed
#    When I click on the "Content" in the homepage
#    Then I verify the respective "Content" page is displayed
#    When I click on the "Technology" in the homepage
#    Then I verify the respective "Technology" page is displayed
#    When I click on the "Products" in the homepage
#    Then I verify the respective "Products" page is displayed
#
#  @AC_ProductPage_Technology_ASSET_Ownership_02
#  Scenario Outline: I Verify new New field in the Existing Application
#    Then I click on the "Technology" in the homepage
#    Then I verify the respective "Technology" page is displayed
#    Then I click on the "Applications" present in the Technology page
#    And  I select any Existing Application present in the Result Page
#    And  I click on "Edit This Record" Details Page
#    Then I click on "General" tab of product
#    Then I verify "<NewfieldName>" field is present in Produc
#    Then I verify "<NewfieldName>" field is SubField1 is present in PrD
#    |TRGR Owns or Licenses |
#    Then I verify "<NewfieldName>" field is SubField2 is present in PrD
#    |TR Statutory Owner |
#    And I Select "<NewfieldName>" SubField1 item product
#      |Please select an option|
#    Then I verify "<NewfieldName>" SubField2 item in product
#    |Select TR Entity|
#    And I Select "<NewfieldName>" SubField1 item product
#      |None|
#    Then I verify "<NewfieldName>" SubField2 item in product
#      |Select TR Entity|
#    And I Select "<NewfieldName>" SubField1 item product
#      |Part|
#    Then I verify "<NewfieldName>" SubField2 item in product
#      |0105-TR Global Resources|
#    And I Select "<NewfieldName>" SubField1 item product
#      |All|
#    Then I verify "<NewfieldName>" SubField2 item in product
#      |0105-TR Global Resources|
#
#
#
#
#
#
#    Examples:
#    |NewfieldName|
#    |ASSET Ownership|