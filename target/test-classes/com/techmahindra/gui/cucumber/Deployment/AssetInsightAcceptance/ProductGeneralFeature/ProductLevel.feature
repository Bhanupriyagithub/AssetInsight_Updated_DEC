@Feature_Product_Level
Feature: I verify a new field "Product Level" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_Product_Level_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_Product_Level_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    Then I click on "General" tab of product
    Then I verify "<NewfieldName>" is dispalyed for Product
    Then I verify "<NewfieldName>" is Mandatory for the Product
    Then I verify "<NewfieldName>" helptext for the Product
    Then I select item "<Newfielditem3>" from the drop down list for PRD level
    Then I click on "Save/Validate" button
    Then I verify "<NewfieldName>" validation should be displayed for PRD
    Then I select item "<Newfielditem1>" from the drop down list for PRD level
    Then I click on "Save/Validate" button
    Then I select item "<Newfielditem2>" from the drop down list for PRD level
   Then I click on "Save/Validate" button
   And  I click on "Data Governance" tab
   Then I verify all fields in Data Governance tab all fields have default values for PRD
      |ProductSpecialFactor_SensitivePIIData|
      |ProductSpecialFactor_StandardPIIData |
      |ProductSpecialFactor_SensitiveCustomerOrPartnerData|
      |ProductSpecialFactor_StandardCustomerOrPartnerData |
      |ProductSpecialFactor_SensitiveThomsonReutersData   |
      |ProductSpecialFactor_DataSensitiveToHostingContext|
      |SignOffInfo_NextSignOffDateinDB|
      |ProductGrouping                |
      |DescriptionOfPersonalDataUsage       |
      |ProductSpecialFactor_Notes                        |
      |PbDComplianceConfirmationcheck                    |
    Then I verify all fields in Data "Product Level" Governance tab all fields have default values for PRD with two radio buttons
      |PersonalDataHasTRPermission                       |
      |lblPersonalDataDoesRetentionPeriodVary            |
    Then I verify three radio buttons in Data Governance tab all fields have default values for PRD
      |lblPersonalDataCanTRDecideUsage                   |
      |lblPersonalDataIsJointDecision                    |
      |lblPersonalDataIsAvailableOutsideGeography        |
      |lblPersonalDataHasThirdPartyContract              |
    Then I verify textbox in Data Governance tab have default  for PRD
      |SignOffInfo_NextSignOffDateinDB|
      |ProductGrouping                |
      |DescriptionOfPersonalDataUsage       |
      |ProductSpecialFactor_Notes                        |
    Then I verify checkbox in Data Governance tab have default  for PRD
      |lblRegulatedDataList                 |
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      |Base|
    Then I click on "Back to detail" button respective application details page should be displayed
    And Validate each item present in the detail page for PRD Status for Product


    Examples:
    |NewfieldName|Newfielditem1|Newfielditem2|Newfielditem3|
    |Product Level|Family|Base|                            |
