package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.cucumber.listener.Reporter;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DataGovernance11Page;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.TechnologyPage;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.cs.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class DataGovernanceTab11StepDef extends PageInstances {

    DataGovernance11Page dataGovernance11Page = PageFactory.initElements(driver, DataGovernance11Page.class);
    TechnologyPage technologyPage = PageFactory.initElements(driver, TechnologyPage.class);


    @Then("^I verify the \"([^\"]*)\" present in the Data Governance page$")
    public void iVerifyThePresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNewField());
    }


    @And("^I Check the type of the \"([^\"]*)\" in the Data Governance page$")
    public void iCheckTheTypeOfTheInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfField());
    }

    @And("^I verify that type of \"([^\"]*)\" should be same as Existing filed \"([^\"]*)\" type in the Data Governance page$")
    public void iVerifyThatTypeOfShouldBeSameAsExistingFiledTypeInTheDataGovernancePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeShouldSameAsExisting());
    }

    @And("^I Check the type of Standard PII Data Type filed in the Data Governance page$")
    public void iCheckTheTypeOfStandardPIIDataTypeFiledInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfSTDPIIField());

    }

    @Then("^I verify the \"([^\"]*)\" field present in the \"([^\"]*)\" page$")
    public void iVerifyTheFieldPresentInThePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeOtherSTDPIIField());

    }

    @Then("^I click on \"([^\"]*)\" field in the Data Governance page$")
    public void iClickOnFieldInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonOtherSTDPIIField());

    }

    @And("^I Check the type of Standard PII Data Type - Other field in the Data Governance page$")
    public void iCheckTheTypeOfStandardPIIDataTypeOtherFieldInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkOtherSTDPIIField());

    }


    @And("^I click on Standard PII Data 'Yes' radio button$")
    public void iClickOnStandardPIIDataYesRadioButton() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnSTDPIIDataYes());
    }


    @When("^Standard PII Data' field is selected as 'Yes' then 'Standard PII Data Type field should be displayed$")
    public void standardPIIDataFieldIsSelectedAsYesThenStandardPIIDataTypeFieldShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.stdPIIDataFieldYesThenStdPIIType());
    }

    @When("^I click on 'Standard PII Data' field is selected as 'No'$")
    public void iClickOnStandardPIIDataFieldIsSelectedAsNo() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnSTDPIIDataNo());

    }

    @Then("^'Standard PII Data Type - Other' should not get displayed$")
    public void standardPIIDataTypeOtherShouldNotGetDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyOtherNotDisSTDPIIField());

    }


    @And("^I verify that it should be a mandatory field for Standard PII Data Type - Other field in the Data Governance page$")
    public void iVerifyThatItShouldBeAMandatoryFieldForStandardPIIDataTypeOtherFieldInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySTDPIIOthrfieldMandrty());
    }

    @And("^I Select the below list of values under \"([^\"]*)\" sub field$")
    public void iSelectTheBelowListOfValuesUnderSubField(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectBelowListOfValuesUnderSubField(subField, items));
    }


    @And("^I verify that HelpText displayed for \"([^\"]*)\" fields$")
    public void iVerifyThatHelpTextDisplayedForFields(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIData());

    }


    /*@And("^I verify that HelpText dispalyed for \"([^\"]*)\" in the Data Governance page$")
    public void iVerifyThatHelpTextDispalyedForInTheDataGovernancePage(String arg0) throws Throwable {
      Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIDataOthers());
    }*/

    @And("^I verify that HelpText dispalyed for \"([^\"]*)\" in the Data Governance pageDisplay$")
    public void iVerifyThatHelpTextDispalyedForInTheDataGovernancePageDisplay(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIDataOthers());
    }


    @Then("^I verify \"([^\"]*)\" field is present in the Data Governance page$")
    public void iVerifyFieldIsPresentInTheDataGovernancePage(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyFieldPrescenceInDataGovernancePage(fieldName));
    }

    @And("^I Check the type of \"([^\"]*)\" in the Data Governance page$")
    public void iCheckTheTypeOfInTheDataGovernancePage(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfField(fieldName));
    }

    @When("^I click on \"([^\"]*)\" button for \"([^\"]*)\" field$")
    public void iClickOnButtonForField(String buttonValue, String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnRadioButtonForFieldName(buttonValue, fieldName));
    }

    @Then("^I verify All the sub questions under \"([^\"]*)\" field should get displayed$")
    public void iVerifyAllTheSubQuestionsUnderFieldShouldGetDisplayed(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestionsUnderFieldNameIsDisplayed(fieldName));
    }


    @Then("^I verify \"([^\"]*)\" sub field is present under \"([^\"]*)\" the Data Governance page$")
    public void iVerifySubFieldIsPresentUnderTheDataGovernancePage(String subField, String field) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPrescenceOfSubFieldUnderField(subField, field));
    }

    @And("^I verify that 'Help text' displayed for \"([^\"]*)\"$")
    public void iVerifyThatHelpTextDisplayedFor(String subField) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTextDisplayedForSubField(subField));
    }

    @Then("^I verify below list of values should be present under \"([^\"]*)\" sub field:$")
    public void iVerifyBelowListOfValuesShouldBePresentUnderSubField(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyListOfValuesBePresentUnderSubField(subField, items));
    }


    @And("^I verify that it should be mandatory field$")
    public void iVerifyThatItShouldBeMandatoryField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyMandatoryField());
    }


    @When("^I click on Yes \"([^\"]*)\" and \"([^\"]*)\" should be displayed$")
    public void iClickOnYesAndShouldBeDisplayed(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestionFields());
    }

    @When("^I click on No option nothing should be displayed below the main question field$")
    public void iClickOnNoOptionNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNO());
    }

    @When("^I click on I dont Know option nothing should be displayed below the main question field$")
    public void iClickOnIDontKnowOptionNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonIDontKnow());
    }

    @When("^I click on Yes I verify the type of the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iClickOnYesIVerifyTheTypeOfTheAnd(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTheTypeOfSubQueFields());
    }

    @Then("^I verify type of \"([^\"]*)\" and \"([^\"]*)\" should be same as existing \"([^\"]*)\" field$")
    public void iVerifyTypeOfAndShouldBeSameAsExistingField(String arg0, String arg1, String arg2) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeOfSubQueShouldBeSameAsExistingField());
    }

    @Then("^I Verify if the limit exceeds for first -SubQueField validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsForFirstSubQueFieldValidationMessageShouldGetDisplayed(List<String> subQue1LimitValue) throws Throwable {
        for (String subque1limit : subQue1LimitValue) {
            Assert.assertTrue(dataGovernance11Page.verifySubQue1FieldLimit(subque1limit));
        }

    }

    @Then("^I Verify if the limit exceeds second -SubQueField validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsSecondSubQueFieldValidationMessageShouldGetDisplayed(List<String> subQue2LimitValue) throws Throwable {
        for (String subque2limit : subQue2LimitValue) {
            Assert.assertTrue(dataGovernance11Page.verifySubQue2FieldLimit(subque2limit));
        }

    }

    @When("^I dont select Yes/No option validation message should be displayed$")
    public void iDontSelectYesNoOptionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidationMessage());
    }


    @Then("^I verify Updated field should get displayed in the Data Governance tab present in the Details page Who receives personal data from your product$")
    public void iVerifyUpdatedFieldShouldGetDisplayedInTheDataGovernanceTabPresentInTheDetailsPageWhoReceivesPersonalDataFromYourProduct() throws Throwable {

    }

    @Then("^I verify the \"([^\"]*)\" is present in the Data Governance page$")
    public void iVerifyTheIsPresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyFieldDispalyed());


    }

    @And("^I Check the type of \"([^\"]*)\" Type field in the Data Governance page$")
    public void iCheckTheTypeOfTypeFieldInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyFieldType());
    }

    @And("^I verify that 'Help text' displayed for \"([^\"]*)\" is displayed$")
    public void iVerifyThatHelpTextDisplayedForIsDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTextThirdParty());
    }

    @And("^I verify that \"([^\"]*)\" should be a mandatory field$")
    public void iVerifyThatShouldBeAMandatoryField(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.isThirdPartyMand());
    }

    @When("^I click on No radio button \"([^\"]*)\" subquestion should not be displayed$")
    public void iClickOnNoRadioButtonSubquestionShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDJNTClickNobutton());
    }

    @When("^I click on I don't know radio button \"([^\"]*)\" subquestion should not be displayed$")
    public void iClickOnIDonTKnowRadioButtonSubquestionShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyClickPRDJNTIDNKNWobutton());
    }

    @When("^I click on Yes radio button \"([^\"]*)\" subquestion should be displayed$")
    public void iClickOnYesRadioButtonSubquestionShouldBeDisplayed(String buttonValue) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyClickYesbutton());
        Assert.assertTrue(dataGovernance11Page.clickOnRadioButtonForFieldNamePRDJNTYes());
    }

    @And("^I verify subquestion textfield is mandatory$")
    public void iVerifySubquestionTextfieldIsMandatory() throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verifyTHRDPRTYSubQMand());
    }

    @When("^I click on \"([^\"]*)\" button for \"([^\"]*)\" field for THRD Party$")
    public void iClickOnButtonForFieldForTHRDParty(String buttonValue) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.clickOnRadioButtonForFieldNamePRD(buttonValue));

    }


    @Then("^I Verify if limit -exceed validation message should be displayed for THRD PRTY$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayedForTHRDPRTY(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyIfTheLimitExceedsTHPRTYValidationMSG(text));
        }
    }

    @Then("^clear the THRD PRTY textbox value$")
    public void clearTheTHRDPRTYTextboxValue() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clearTHRPRTYTXT());
    }

    @Then("^I Verify if value is validation message should be displayed$")
    public void iVerifyIfValueIsValidationMessageShouldBeDisplayed(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyIfTheLimitExceedsTHPRTYValidationMSG(text));
        }
    }

    @Then("^I Verify by adding valid data for field \"([^\"]*)\"$")
    public void iVerifyByAddingValidDataForField(String text) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidData(text));
    }

    @Then("^I Verify by adding valid data for field for THRDPRTY$")
    public void iVerifyByAddingValidDataForFieldForTHRDPRTY(List<String> textList) throws Throwable {
        for (String text : textList) {

            Assert.assertTrue(dataGovernance11Page.verifyValidData(text));
        }

    }


    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field for PRD$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubFieldForPRD(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectbelowListOfItems(subField, items));

    }


    @When("^I click Yes radio button \"([^\"]*)\" if not selected then \"([^\"]*)\" should be displayed in PRD$")
    public void iClickYesRadioButtonIfNotSelectedThenShouldBeDisplayedInPRD(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonSenisitivePIIDataType());

    }

    @And("^I click on \"([^\"]*)\" Yes radio button if not selected  then \"([^\"]*)\" field should be displayed$")
    public void iClickOnYesRadioButtonIfNotSelectedThenFieldShouldBeDisplayed(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickYesStandardPIIData());
    }

    @Then("^I verify below list of values should be present under \"([^\"]*)\" sub field$")
    public void iVerifyBelowListOfValuesShouldBePresentUnderSubFieldSTND(String subField, List<String> items) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verifyListOfValuesBePresentUnderSubFieldSTND(subField, items));


    }

    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field STDPII$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubFieldSTDPII(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectbelowListOfItemsSTDPII(subField, items));

    }

    @Then("^I verify the \"([^\"]*)\" is present in the Data Governance page for PRD$")
    public void iVerifyTheIsPresentInTheDataGovernancePageForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPersonalDataIsJointDecision());
    }


    @And("^I Check the type of \"([^\"]*)\" Type field in the Data Governance page for PRD$")
    public void iCheckTheTypeOfTypeFieldInTheDataGovernancePageForPRD(String arg0) throws Throwable {


        Assert.assertTrue(dataGovernance11Page.verifyFieldTypePRJNT());

    }

    @And("^I verify that 'Help text' displayed for \"([^\"]*)\" is displayed for PRD$")
    public void iVerifyThatHelpTextDisplayedForIsDisplayedForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtPRDJNT());
    }

    @And("^I verify that \"([^\"]*)\" should be a mandatory field for PRD$")
    public void iVerifyThatShouldBeAMandatoryFieldForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDJNTMND());
    }

    @And("^I verify subquestion textfield is mandatory for PRDJNT$")
    public void iVerifySubquestionTextfieldIsMandatoryForPRDJNT() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDJNTSubQuesMand());
    }

    @And("^I verify subquestion textfield is mandatory for PRDJNT for Contract$")
    public void iVerifySubquestionTextfieldIsMandatoryForPRDJNTForContract() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDJNTCONTRCTMAND());
    }

    @Then("^I verify help text of \"([^\"]*)\" for contract number and/or TR personnel$")
    public void iVerifyHelpTextOfForContractNumberAndOrTRPersonnel(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyhelpTxtPRDJNTCNT());
    }

    @Then("^I Verify if limit -exceed validation message should be displayed for description for PRD DESCRP$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayedForDescriptionForPRDDESCRP(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyIfTheLimitExceedsPRDJNT(text));
        }

    }

    @Then("^I Verify if limit -exceed validation message should be displayed for contract number and/or TR personnel$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayedForContractNumberAndOrTRPersonnel(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyIfTheLimitExceedsPRDJNTCont(text));
        }
    }

    @Then("^I clear the textbox of PersonalDataJointDecisionDescription and PersonalDataJointDecisionContact$")
    public void iClearTheTextboxOfPersonalDataJointDecisionDescriptionAndPersonalDataJointDecisionContact() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clearPRDJNTFields());
    }

    @Then("^I Verify by adding valid data for field for TR jointly decides use of Pdata for PersonalDataJointDecisionDescription$")
    public void iVerifyByAddingValidDataForFieldForTRJointlyDecidesUseOfPdataForPersonalDataJointDecisionDescription(List<String> textList) throws Throwable {

        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyValidDataPRDJNT(text));


        }
    }


    @Then("^I verify the \"([^\"]*)\" is present in the Data Governance page for PRODUCT$")
    public void iVerifyTheIsPresentInTheDataGovernancePageForPRODUCT(String Newfield) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyAddART(Newfield));
    }

    @Then("^I verify the information icon next to \"([^\"]*)\" header$")
    public void iVerifyTheInformationIconNextToHeader(String Newfield) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyAddARTICON(Newfield));
    }

    @Then("^I click on the information icon next to \"([^\"]*)\" header$")
    public void iClickOnTheInformationIconNextToHeader(String Newfield) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonAddARTICON(Newfield));
    }


    @Then("^I verify the \"([^\"]*)\" external link to GDPR page should be displayed$")
    public void iVerifyTheExternalLinkToGDPRPageShouldBeDisplayed(String Newfield) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyLinkToGDPR(Newfield));

    }

    @Then("^I click on the \"([^\"]*)\" external link to GDPR page$")
    public void iClickOnTheExternalLinkToGDPRPage(String Newfield) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnLinkGDPR(Newfield));
    }

    @Then("^I verify the \"([^\"]*)\" is present in the Data Governance page for PROD$")
    public void iVerifyTheIsPresentInTheDataGovernancePageForPROD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRfield());
    }

    @Then("^I verify the \"([^\"]*)\" is manadatory$")
    public void iVerifyTheIsManadatory(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRfieldMandtr());
    }

    @And("^I Check the type of \"([^\"]*)\" Type field in the Data Governance page for PROD$")
    public void iCheckTheTypeOfTypeFieldInTheDataGovernancePageForPROD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRFieldType());
    }

    @When("^I click on Yes radio button \"([^\"]*)\" subquestion should not be displayed$")
    public void iClickOnYesRadioButtonSubquestionShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRYes());
    }

    @When("^I click on No radio button \"([^\"]*)\" subquestion should be displayed$")
    public void iClickOnNoRadioButtonSubquestionShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRNo());
    }

    @Then("^I verify the \"([^\"]*)\" subquestion is manadatory$")
    public void iVerifyTheSubquestionIsManadatory(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRMan());
    }

    @When("^I click on I don't know radio button \"([^\"]*)\" subquestion should be displayed$")
    public void iClickOnIDonTKnowRadioButtonSubquestionShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRIDNTKW());

    }

    @When("^I click on No radio button \"([^\"]*)\" Yes No and I don't know subquestion radio button should be displayed$")
    public void iClickOnNoRadioButtonYesNoAndIDonTKnowSubquestionRadioButtonShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySuqQuestionRadiobutton());
    }

    @And("^I Check the type of radio button \"([^\"]*)\" for subquestion Yes No and I don't know subquestion type$")
    public void iCheckTheTypeOfRadioButtonForSubquestionYesNoAndIDonTKnowSubquestionType(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRSubQuesFieldType());
    }

    @Then("^I check for the help text of \"([^\"]*)\" of subquestion$")
    public void iCheckForTheHelpTextOfOfSubquestion(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRHelpTxt());
    }

    @Then("^I click on No button of \"([^\"]*)\" of subquestion$")
    public void iClickOnNoButtonOfOfSubquestion(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRSubQuestNO());
    }


    @Then("^I verify subquestion of \"([^\"]*)\" name and contact details should not be displayed$")
    public void iVerifySubquestionOfNameAndContactDetailsShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubquestionOfNameAndContactDetails());

    }

    @Then("^I click on I don't know button of \"([^\"]*)\" of subquestion$")
    public void iClickOnIDonTKnowButtonOfOfSubquestion(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRSubQuestIDNTKNW());
    }

    @Then("^I click on Yes button of \"([^\"]*)\" of subquestion$")
    public void iClickOnYesButtonOfOfSubquestion(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRYES());
    }


    @Then("^I verify subquestion name and contact details should be displayed$")
    public void iVerifySubquestionNameAndContactDetailsShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRSubQuesField());

    }

    @Then("^I verify subquestion name and contact details should be manadatory$")
    public void iVerifySubquestionNameAndContactDetailsShouldBeManadatory() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestionTXTMAnd());
    }


    @Then("^I verify subquestion name and contact details of helpTXT$")
    public void iVerifySubquestionNameAndContactDetailsOfHelpTXT() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestHelpTxt());
    }

    @Then("^I Verify if limit -exceed validation message should be displayed for description for name and contact details$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayedForDescriptionForNameAndContactDetails(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyIfTheLimitExceedsPRDDESC(text));
        }

    }

    @Then("^I verify by adding valid data for field for Personal data subcontract$")
    public void iVerifyByAddingValidDataForFieldForPersonalDataSubcontract(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.validdataSubques(text));
        }
    }

    @Then("^I clear the textbox of description for name and contact details$")
    public void iClearTheTextboxOfDescriptionForNameAndContactDetails() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clearPRDSubFields());
    }

    @Then("^I validatr each item present in Back to detail values$")
    public void iValidatrEachItemPresentInBackToDetailValues(List<String> itemList) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.validateSubBCKDetail(itemList));


    }

    @When("^I click Yes radio button \"([^\"]*)\" if not selected then \"([^\"]*)\" should be displayed in app$")
    public void iClickYesRadioButtonIfNotSelectedThenShouldBeDisplayedInApp(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonSensitivePIIData());

    }

    @Then("^I check \"([^\"]*)\" is manadatory for SENSIPIISUB$")
    public void iCheckIsManadatoryForSENSIPIISUB(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkSensitivePIISubMand());
    }

    @Then("^I verify subquestion \"([^\"]*)\" of helpTXT for SENSIPIISUB$")
    public void iVerifySubquestionOfHelpTXTForSENSIPIISUB(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensiPIISubHelpTxt());
    }

    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field SENSIPIISUB$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubFieldSENSIPIISUB(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectbelowListOfISensitPIIdatatems(subField, items));

    }

    @Then("^I click on \"([^\"]*)\" NO radio button$")
    public void iClickOnNORadioButton(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonSensitivePIIDataNo());
    }

    @Then("^I click on \"([^\"]*)\" NO radio button of app$")
    public void iClickOnNORadioButtonOfApp(String arg0) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.clickonSTNDPIIDataNo());
    }

    @Then("^I click on NO radio button of Is TR able to view, edit, delete, share, change or use the personal data$")
    public void iClickOnNORadioButtonOfIsTRAbleToViewEditDeleteShareChangeOrUseThePersonalData() throws Throwable {
        Assert.assertTrue(technologyPage.clickNoTRPersndata());
    }


    @Then("^I click on NO radio button of Is TR free to decide PD is viewed edited deleted shared changed or used for appl$")
    public void iClickOnNORadioButtonOfIsTRFreeToDecidePDIsViewedEditedDeletedSharedChangedOrUsedForAppl() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickNoTRPD());
    }


    @Then("^I click on NO radio button of Does Thomson Reuters jointly decide how to use personal data in your application$")
    public void iClickOnNORadioButtonOfDoesThomsonReutersJointlyDecideHowToUsePersonalDataInYourApplication() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRJoint());
    }

    @Then("^I click on NO radion button please confirm if you share any personal data from your application with any sub-contractor/service provider used by TR$")
    public void iClickOnNORadionButtonPleaseConfirmIfYouShareAnyPersonalDataFromYourApplicationWithAnySubContractorServiceProviderUsedByTR() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRSUBJoint());
    }


    @Then("^I click on NO radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected$")
    public void iClickOnNORadioButtonOfWillAnyPersonalDataBeTransferredToOrAccessedOutsideTheGeographicLocationsWhereItWasOriginallyCollected() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRGeoNO());
    }


    @Then("^I click on NO radio button of If your application involves the transfer of personal data to a third party$")
    public void iClickOnNORadioButtonOfIfYourApplicationInvolvesTheTransferOfPersonalDataToAThirdParty() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyClickNobutton());
    }


    @Then("^I click on NO radio button of Does the retention period vary according to the types of data stored$")
    public void iClickOnNORadioButtonOfDoesTheRetentionPeriodVaryAccordingToTheTypesOfDataStored() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRRentionPRD());
    }

    @Then("^I click on YES radio button of Is TR able to view, edit, delete, share, change or use the personal data$")
    public void iClickOnYESRadioButtonOfIsTRAbleToViewEditDeleteShareChangeOrUseThePersonalData() throws Throwable {
        Assert.assertTrue(technologyPage.clickYESTRPersndata());
    }

    @Then("^I click on YES radio button of Is TR free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used$")
    public void iClickOnYESRadioButtonOfIsTRFreeToDecideWhetherHowThePersonalDataIsViewedEditedDeletedSharedChangedOrUsed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickYESTRPD());
    }


    @Then("^I click on YES radio button of Does Thomson Reuters jointly decide how to use personal data in your application with any other party$")
    public void iClickOnYESRadioButtonOfDoesThomsonReutersJointlyDecideHowToUsePersonalDataInYourApplicationWithAnyOtherParty() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYESTRJoint());
    }

    @Then("^I click on YES radion button please confirm if you share any personal data from your application with any sub-contractor/service provider used by TR$")
    public void iClickOnYESRadionButtonPleaseConfirmIfYouShareAnyPersonalDataFromYourApplicationWithAnySubContractorServiceProviderUsedByTR() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYESTRJoint());
    }

    @Then("^I click on YES radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected$")
    public void iClickOnYESRadioButtonOfWillAnyPersonalDataBeTransferredToOrAccessedOutsideTheGeographicLocationsWhereItWasOriginallyCollected() throws Throwable {

        Assert.assertTrue(dataGovernance11Page.clickonTRGeoIDNK());
    }


    @Then("^I click on YES radio button of If your application involves the transfer of personal data to a third party is there a contract in place with the third party$")
    public void iClickOnYESRadioButtonOfIfYourApplicationInvolvesTheTransferOfPersonalDataToAThirdPartyIsThereAContractInPlaceWithTheThirdParty() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyClickYesbutton());
    }

    @Then("^I click on YES radio button of Does the retention period vary according to the types of data stored$")
    public void iClickOnYESRadioButtonOfDoesTheRetentionPeriodVaryAccordingToTheTypesOfDataStored() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRRentionPRDYES());
    }


    @Then("^I click on IDNK radio button of Is TR free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used$")
    public void iClickOnIDNKRadioButtonOfIsTRFreeToDecideWhetherHowThePersonalDataIsViewedEditedDeletedSharedChangedOrUsed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickIDKTRPD());
    }

    @Then("^I click on IDNK radio button of Does Thomson Reuters jointly decide how to use personal data in your application with any other party$")
    public void iClickOnIDNKRadioButtonOfDoesThomsonReutersJointlyDecideHowToUsePersonalDataInYourApplicationWithAnyOtherParty() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonIDNKTRJoint());
    }

    @Then("^I click on IDNK radio button of Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected$")
    public void iClickOnIDNKRadioButtonOfWillAnyPersonalDataBeTransferredToOrAccessedOutsideTheGeographicLocationsWhereItWasOriginallyCollected() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonTRGeoIDNK());
    }


    @Then("^I click on IDNK radio button of If your application involves the transfer of personal data to a third party  is there a contract in place with the third party$")
    public void iClickOnIDNKRadioButtonOfIfYourApplicationInvolvesTheTransferOfPersonalDataToAThirdPartyIsThereAContractInPlaceWithTheThirdParty() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyClickIDKbutton());
    }


    @Then("^I check there should be common validation message displayed$")
    public void iCheckThereShouldBeCommonValidationMessageDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyCommonValidMsg());
    }

    @Then("^I click on NO radio button of subquestion share any personal data from your application with any sub-contractor/service$")
    public void iClickOnNORadioButtonOfSubquestionShareAnyPersonalDataFromYourApplicationWithAnySubContractorService() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickNOSubPR());

    }


//    @And("^  I validate that below invalid dates are not allowed in date field for application$")
//    public void iValidateThatBelowInvalidDatesAreNotAllowedInDateFieldForApplication( DataTable validateInvalidNSOD) throws Throwable {
//        Map<String, String> data = validateInvalidNSOD.asMap(String.class, String.class);
//        Assert.assertTrue(dataGovernance11Page.validateInvalidDateNSOD(data));
//    }


    @And("^ I validate that below invalid dates are not allowed in date field for application$")
    public void iValidateThatBelowInvalidDatesAreNotAllowedInDateFieldForApplication(DataTable validateInvalidNSOD) throws Throwable {
        Map<String, String> data = validateInvalidNSOD.asMap(String.class, String.class);
        Assert.assertTrue(dataGovernance11Page.validateInvalidDateNSOD(data));
    }

    @Then("^I verify user enter invalid dates are not allowes in date field for application$")
    public void iVerifyUserEnterInvalidDatesAreNotAllowesInDateFieldForApplication(DataTable validateInvalidNSOD) throws Throwable {
        Map<String, String> data = validateInvalidNSOD.asMap(String.class, String.class);
        Assert.assertTrue(dataGovernance11Page.validateInvalidDateNSOD(data));

    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance$")
    public void iVerifyIsDisplayedInDataGovernance(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNSODappl());

    }


    @Then("^I verify \"([^\"]*)\" should be optional for application$")
    public void iVerifyShouldBeOptionalForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNSODNotMandtry());
    }

    @Then("^I verify \"([^\"]*)\" is text field for application$")
    public void iVerifyIsTextFieldForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNSODType());

    }


    @Then("^I verify \"([^\"]*)\" as calendra for application$")
    public void iVerifyAsCalendraForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNSODCal());
    }


    @Then("^I click on \"([^\"]*)\" calendra of NSOD$")
    public void iClickOnCalendraOfNSOD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickNSODCal());
    }


    @Then("^I select \"([^\"]*)\" a month from calendra of NSOD for appliaction$")
    public void iSelectAMonthFromCalendraOfNSODForAppliaction(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectNSDOMonth());
    }

    @Then("^I verify \"([^\"]*)\" datefield a calendar widget is dispalyed$")
    public void iVerifyDatefieldACalendarWidgetIsDispalyed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNSODDate());
    }


    @Then("^I select \"([^\"]*)\" a year calendra of NSOD$")
    public void iSelectAYearCalendraOfNSOD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectNSDOYear());
    }


//    @Then("^ I verify that user enter date manually in the date following the date format for application$")
//    public void iVerifyThatUserEnterDateManuallyInTheDateFollowingTheDateFormatForApplication(String nsdo) throws Throwable {
//      Assert.assertTrue(dataGovernance11Page.nsdomanually(nsdo));
//    }


    @Then("^I verify user enter date \"([^\"]*)\"  manually for NSDO for application$")
    public void iVerifyUserEnterDateManuallyForNSDOForApplication(String nsdo) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.nsdomanually(nsdo));
    }


    @And("^I enter the date \"([^\"]*)\" in the nsdo field$")
    public void iEnterTheDateInTheNsdoField(DataTable validateInvalidNSOD) throws Throwable {

        Map<String, String> data = validateInvalidNSOD.asMap(String.class, String.class);
        Assert.assertTrue(dataGovernance11Page.validateInvalidDateNSOD(data));


    }


    @Then("^ I verify that user enter below valid dates$")
    public void iVerifyThatUserEnterBelowValidDates(DataTable validateInvalidNSOD) throws Throwable {

        Map<String, String> data = validateInvalidNSOD.asMap(String.class, String.class);
        Assert.assertTrue(dataGovernance11Page.validateInvalidDateNSOD(data));
    }

    @Then("^ I verify that user enter date manually in the date \"([^\"]*)\" following the date format for application$")
    public void iVerifyThatUserEnterDateManuallyInTheDateFollowingTheDateFormatForApplication(String nsdo1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.nsdomanually(nsdo1));
    }

    @And("^I verify in valid date \"([^\"]*)\" for NSDO$")
    public void iVerifyInValidDateForNSDO(String nsdo) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.nsdomanually(nsdo));
    }


    @And("^I verify validation message for \"([^\"]*)\"$")
    public void iVerifyValidationMessageFor(String arg) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidationMsgNSDO());

    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance for application$")
    public void iVerifyIsDisplayedInDataGovernanceForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensitvCustDisp());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance is mandatory for appl$")
    public void iVerifyIsDisplayedInDataGovernanceIsMandatoryForAppl(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensitvCustMAND());

    }

    @Then("^I verify type of \"([^\"]*)\" for app$")
    public void iVerifyTypeOfForApp(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeSensitvCust());
    }

    @Then("^I click on NO radio button of \"([^\"]*)\" for app$")
    public void iClickOnNORadioButtonOfForApp(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNOSensCust());
    }


    @Then("^I verify \"([^\"]*)\" and \"([^\"]*)\" of \"([^\"]*)\" for app should not be displayed$")
    public void iVerifyAndOfForAppShouldNotBeDisplayed(String arg0, String arg1, String arg2) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensiSuqNotDisp());

    }

    @Then("^I click on YES radio button of \"([^\"]*)\" for app$")
    public void iClickOnYESRadioButtonOfForApp(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYESSensCust());
    }

    @Then("^I verify \"([^\"]*)\" and \"([^\"]*)\" of \"([^\"]*)\" for app should be displayed$")
    public void iVerifyAndOfForAppShouldBeDisplayed(String arg0, String arg1, String arg2) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensiSubqDisp());
    }

    @Then("^I verify \"([^\"]*)\" is manadatory for app$")
    public void iVerifyIsManadatoryForApp(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensCustDataPattrnMan());
    }

    @Then("^I verify \"([^\"]*)\" is manadatory for application$")
    public void iVerifyIsManadatoryForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensPatrnData());
    }

    @Then("^I search for \"([^\"]*)\" field in searchbox for app$")
    public void iSearchForFieldInSearchboxForApp(String sensiPattdata) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchSensiPatrnData(sensiPattdata));
    }

    @And("^only search item in Recipients of Sensitive Customer should be displayed$")
    public void onlySearchItemInRecipientsOfSensitiveCustomerShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchSensiPattData());
    }

    @Then("^I search for \"([^\"]*)\" field in searchbox for application$")
    public void iSearchForFieldInSearchboxForApplication(String sensiPattDataPurp) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchSensiPattDataPur(sensiPattDataPurp));
    }

    @And("^only search item in Recipients of Sensitive Customer Pattern Data should be displayed$")
    public void onlySearchItemInRecipientsOfSensitiveCustomerPatternDataShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchSensiPattrnData());

    }

    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field for app$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubFieldForApp(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectSesitCustPatrData(subField, items));
    }

    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field for app for Purpose$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubFieldForAppForPurpose(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectSensicutPattrnDataPurp(subField, items));
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance for appl$")
    public void iVerifyIsDisplayedInDataGovernanceForAppl(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensiTRDataDisp());
    }


    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance is mandatory for application$")
    public void iVerifyIsDisplayedInDataGovernanceIsMandatoryForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensiTRDATAMand());
    }

    @Then("^I verify type of \"([^\"]*)\" for application$")
    public void iVerifyTypeOfForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeSensiTRData());
    }

    @Then("^I click on YES radio button of \"([^\"]*)\" for application$")
    public void iClickOnYESRadioButtonOfForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYESSensTRData());
    }

    @Then("^I click on NO radio button of \"([^\"]*)\" for application$")
    public void iClickOnNORadioButtonOfForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNOSensiTRData());
    }

    @And("^verify each item in detail page$")
    public void verifyEachItemInDetailPage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySensTRDatadetailPg());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance for applicatiin$")
    public void iVerifyIsDisplayedInDataGovernanceForApplicatiin(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyStndrPattDataDisp());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance is mandatory for applic$")
    public void iVerifyIsDisplayedInDataGovernanceIsMandatoryForApplic(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySTRPattDATAMand());
    }

    @Then("^I verify type of \"([^\"]*)\" for applictn$")
    public void iVerifyTypeOfForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeStndPattTRData());
    }

    @Then("^I click on NO radio button of \"([^\"]*)\" for applictn$")
    public void iClickOnNORadioButtonOfForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNOStndPattData());
    }

    @Then("^I click on YES radio button of \"([^\"]*)\" for applictn$")
    public void iClickOnYESRadioButtonOfForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYESStndPattData());
    }

    @And("^verify each item in detail page of STNDPATT$")
    public void verifyEachItemInDetailPageOfSTNDPATT() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySTNDPattDatadetailPg());
    }

    @When("^I click on No radio button \"([^\"]*)\" of Product subquestion should not be displayed$")
    public void iClickOnNoRadioButtonOfProductSubquestionShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNothrdPartyTR());
    }

    @When("^I click on I don't know radio button \"([^\"]*)\" of Product subquestion should not be displayed$")
    public void iClickOnIDonTKnowRadioButtonOfProductSubquestionShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonIDNTthrdPartyTR());
    }

    @When("^I click on Yes radio button \"([^\"]*)\" of Product subquestion should be displayed$")
    public void iClickOnYesRadioButtonOfProductSubquestionShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonYesthrdPartyTR());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance for applictn$")
    public void iVerifyIsDisplayedInDataGovernanceForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensitive());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in DataGovernance is mandatory for applictn$")
    public void iVerifyIsDisplayedInDataGovernanceIsMandatoryForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensitiveMandtry());
    }

    @Then("^I verify type of \"([^\"]*)\" for applict$")
    public void iVerifyTypeOfForApplict(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensitiveType());
    }

    @Then("^I verify helptext of \"([^\"]*)\" for applictn$")
    public void iVerifyHelptextOfForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensitiveHelpTxt());
    }

    @Then("^I click on NO radio button of \"([^\"]*)\" for applict$")
    public void iClickOnNORadioButtonOfForApplict(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonDataSensitiveNo());
    }

    @Then("^I verify \"([^\"]*)\" subquestions are should not be displayed$")
    public void iVerifySubquestionsAreShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensiSubQuesNotDis());
    }

    @Then("^I click on YES radio button of \"([^\"]*)\" for appliction$")
    public void iClickOnYESRadioButtonOfForAppliction(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonDataSensitiveYes());

    }

    @Then("^I verify \"([^\"]*)\" subquestions are should be displayed$")
    public void iVerifySubquestionsAreShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensiSubQuesDispl());
    }

    @Then("^I verify \"([^\"]*)\" subquestion(\\d+) is mandatory$")
    public void iVerifySubquestionIsMandatory(String arg0, int arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataSensiSubQues1Mand());
    }

    @Then("^I Verify if limit -exceed validation message should be displayed for DataSensitiveHost$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayedForDataSensitiveHost(List<String> limitvalue) throws Throwable {
        for (String limit : limitvalue) {
            Assert.assertTrue(dataGovernance11Page.verifyingValidationMessage(limit));
        }
    }

    @Then("^I clear \"([^\"]*)\" subquestion(\\d+) textbox$")
    public void iClearSubquestionTextbox(String arg0, int arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clearDataSensiSubQues1());
    }

    @Then("^I Verify by adding valid data for field for DataSensitiveHost for SubQuestn(\\d+) for application$")
    public void iVerifyByAddingValidDataForFieldForDataSensitiveHostForSubQuestnForApplication(int arg0, List<String> txt) throws Throwable {
        for (String txtmsg : txt) {
            Assert.assertTrue(dataGovernance11Page.verifyValidDataSenSitSubQuest1(txtmsg));
        }
    }

    @Then("^I Verify by adding valid data for field for DataSensitiveHost for SubQuestn(\\d+)$")
    public void iVerifyByAddingValidDataForFieldForDataSensitiveHostForSubQuestn(int arg0, List<String> txt) throws Throwable {
        for (String txtmsg : txt) {
            Assert.assertTrue(dataGovernance11Page.verifyValidaDataSensiSubQues2(txtmsg));

        }
    }

    @Then("^I verify \"([^\"]*)\" is displayed in Data Dependencies for applictn$")
    public void iVerifyIsDisplayedInDataDependenciesForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataDependenciesDisp());
    }


    @Then("^I verify helptext of \"([^\"]*)\" in Data Dependencies for applictn$")
    public void iVerifyHelptextOfInDataDependenciesForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTextDataDependencies());

    }

    @Then("^I search for \"([^\"]*)\" field in searchbox in Data Dependencies for applictn$")
    public void iSearchForFieldInSearchboxInDataDependenciesForApplictn(String srchitem) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchDataDep(srchitem));
    }

    @And("^only search item in Recipients of PData should be displayed in Data Dependencies for applictn$")
    public void onlySearchItemInRecipientsOfPDataShouldBeDisplayedInDataDependenciesForApplictn() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchDataDepDispla());
    }

    @And("^I Select the below list of values under the \"([^\"]*)\" in Data Dependencies for applictn$")
    public void iSelectTheBelowListOfValuesUnderTheInDataDependenciesForApplictn(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectBelowDataDepUnderSubField(subField, items));
    }

    @And("^Validare each item present in the detail page for Data Dependencies for applictn$")
    public void validareEachItemPresentInTheDetailPageForDataDependenciesForApplictn() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDataDepinDetail());
    }

    @Then("^I verify \"([^\"]*)\" is displayed in Supports Products for applictn$")
    public void iVerifyIsDisplayedInSupportsProductsForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySupprtPrdDisp());
    }

    @Then("^I verify helptext of \"([^\"]*)\" in Supports Products for applictn$")
    public void iVerifyHelptextOfInSupportsProductsForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyhelpTxtSupprtPrd());
    }

    @Then("^I search for \"([^\"]*)\" field in searchbox in Supports Products for applictn$")
    public void iSearchForFieldInSearchboxInSupportsProductsForApplictn(String srchTXT) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.searchSupprtPrdTxt(srchTXT));
    }

    @And("^only search item in Recipients of PData should be displayed in Supports Products for applictn$")
    public void onlySearchItemInRecipientsOfPDataShouldBeDisplayedInSupportsProductsForApplictn() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.dataDepItemDisp());
    }

    @And("^I Select the below list of values under the \"([^\"]*)\" in Supports Products for applictn$")
    public void iSelectTheBelowListOfValuesUnderTheInSupportsProductsForApplictn(String subField, List<String> items) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.selectSupportPRDItem(subField, items));
    }

    @And("^Validare each item present in the detail page for Supports Products for applictn$")
    public void validareEachItemPresentInTheDetailPageForSupportsProductsForApplictn() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDetailPageSupprPRD());
    }

    @Then("^I Verify if limit exceeds validation -message should get displayed for application$")
    public void iVerifyIfLimitExceedsValidationMessageShouldGetDisplayedForApplication(List<String> limitvalue) throws Throwable {
        for (String limit : limitvalue) {
            Assert.assertTrue(dataGovernance11Page.verifyLimitValidationMessage(limit));
        }
    }

    @Then("^I verify \"([^\"]*)\" is displayed for applictn$")
    public void iVerifyIsDisplayedForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyRegulatedataDisp());
    }

    @Then("^I verify \"([^\"]*)\" is manadatory for applictn$")
    public void iVerifyIsManadatoryForApplictn(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyRegulatedataMandtry());
    }

    @Then("^I check \"([^\"]*)\" type for application$")
    public void iCheckTypeForApplication(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyRegulatedDataType());
    }

    @Then("^I select \"([^\"]*)\" for application below Items$")
    public void iSelectForApplicationBelowItems(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectRegultdDataItems(subField, items));
    }

    @Then("^I verify \"([^\"]*)\" for other field is displayed$")
    public void iVerifyForOtherFieldIsDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.regultedDataOther());

    }

    @Then("^I verify \"([^\"]*)\" for other Textbox is manadatory$")
    public void iVerifyForOtherTextboxIsManadatory(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.regultedDataOtherMand());
    }

    @Then("^I verify \"([^\"]*)\" for other Textbox sholud be displayed$")
    public void iVerifyForOtherTextboxSholudBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.regultedDataOtherField());
    }

    @And("^Validate each item present in the detail page for Regulated Data for applictn$")
    public void validateEachItemPresentInTheDetailPageForRegulatedDataForApplictn() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.regultedDataDetail());
    }

    @Then("^I click on \"([^\"]*)\" tab of product$")
    public void iClickOnTabOfProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonGeneral());

    }

    @Then("^I verify \"([^\"]*)\" is displayed for product$")
    public void iVerifyIsDisplayedForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.productName());
    }

    @Then("^I verify \"([^\"]*)\" is Mandatory for product$")
    public void iVerifyIsMandatoryForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.productNameMandtr());
    }

    @Then("^I verify \"([^\"]*)\" helptext for product$")
    public void iVerifyHelptextForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.productNamehelpTxt());
    }

    @Then("^I verify \"([^\"]*)\" for product$")
    public void iVerifyForProduct(String arg0, DataTable Product) throws Throwable {
        Map<String, String> fields = Product.asMap(String.class, String.class);
        Assert.assertTrue(dataGovernance11Page.productNamefield("ProductFields", fields));

    }

    @Then("^I clear the textbox of description for Product Name$")
    public void iClearTheTextboxOfDescriptionForProductName() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clearPRDNAME());
    }


    @Then("^I verify \"([^\"]*)\" validation message for blank field$")
    public void iVerifyValidationMessageForBlankField(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidatnBlnkMsg());
    }

//    @Then("^I verify \"([^\"]*)\" enter valid data for Product$")
//    public void iVerifyEnterValidDataForProduct(String txt) throws Throwable {
//        Assert.assertTrue(dataGovernance11Page.enterblnkPRDName(txt));
//    }

    @Then("^I verify \"([^\"]*)\" is blank field for Product$")
    public void iVerifyIsBlankFieldForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.enterblnkPRDName(" "));
    }


    @Then("^I verify \"([^\"]*)\" enter valid data for Product$")
    public void iVerifyEnterValidDataForProduct(String txt) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.enterblnkPRDName(txt));
    }

    @Then("^I verify \"([^\"]*)\" is displayed for prod$")
    public void iVerifyIsDisplayedForProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBuisnessUnitDis());
    }

    @Then("^I verify \"([^\"]*)\" is Mandatory for prod$")
    public void iVerifyIsMandatoryForProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUisMandrty());
    }

    @Then("^I verify \"([^\"]*)\" helptext for prod$")
    public void iVerifyHelptextForProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUHelpTxt());
    }

    @Then("^I donot select any element from the drop down list$")
    public void iDonotSelectAnyElementFromTheDropDownList() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.dntselectItemsfrmDrpDwn());

    }

    @Then("^I verify \"([^\"]*)\" validation should be displayed$")
    public void iVerifyValidationShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidationMsgBU());
    }

    @Then("^I select item from the drop down list$")
    public void iSelectItemFromTheDropDownList() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectBUItem());
    }

    @And("^Validate each item present in the detail page for Business Unit for Product$")
    public void validateEachItemPresentInTheDetailPageForBusinessUnitForProduct() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUIteminDetailPg());
    }

    @Then("^I verify \"([^\"]*)\" field helptext for prod$")
    public void iVerifyFieldHelptextForProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verify3rdPartyHelpTxt());
    }

    @Then("^I verify \"([^\"]*)\" type for prod$")
    public void iVerifyTypeForProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verify3rdPartyType());
    }

    @Then("^I click on \"([^\"]*)\" button for Product$")
    public void iClickOnButtonForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickYes3rdParty());
    }

    @Then("^I click on \"([^\"]*)\" button for Product for (\\d+)rd Party$")
    public void iClickOnButtonForProductForRdParty(String arg0, int arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickNo3rdParty());
    }

    @Then("^I verify \"([^\"]*)\" is Mandatory for PRD$")
    public void iVerifyIsMandatoryForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUSubSegmnt());
    }

    @Then("^I verify \"([^\"]*)\" helptext for PRD$")
    public void iVerifyHelptextForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUSubSegHelpTxt());

    }

    @Then("^I select item from dropdown list for Business Sub Segement for PRD$")
    public void iSelectItemFromDropdownListForBusinessSubSegementForPRD() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectitemsBUSubSegment());
    }

    @And("^Validate each item present in the detail page for Business Sub Segment$")
    public void validateEachItemPresentInTheDetailPageForBusinessSubSegment() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyBUSubSegmntIteminDetailPg());
    }

    @Then("^I select item from dropdown list for  Sub Segement for PRD$")
    public void iSelectItemFromDropdownListForSubSegementForPRD() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectItemOtherPRDStatus());
    }

    @Then("^I verify \"([^\"]*)\" is Mandatory for the PRD$")
    public void iVerifyIsMandatoryForThePRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDStatusMand());
    }

    @Then("^I verify \"([^\"]*)\" helptext for the PRD$")
    public void iVerifyHelptextForThePRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDStatusHelpTXT());
    }

    @Then("^I verify Other Product status text is displayed$")
    public void iVerifyOtherProductStatusTextIsDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDStatusOther());
    }

    @Then("^I Verify if limit exceeds validation -message should get displayed for PRD$")
    public void iVerifyIfLimitExceedsValidationMessageShouldGetDisplayedForPRD(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyTheLimitExceedMsgForPrd(text));
        }
    }

    @Then("^I select item from dropdown list for Prd Status$")
    public void iSelectItemFromDropdownListForPrdStatus() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectPRDStatusIuem());
    }

    @And("^Validate each item present in the detail page for PRD Status for Product$")
    public void validateEachItemPresentInTheDetailPageForPRDStatusForProduct() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDSTAtDetailPG());
    }

    @Then("^I verify \"([^\"]*)\" is dispalyed for Product$")
    public void iVerifyIsDispalyedForProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDisp());
    }

    @Then("^I verify \"([^\"]*)\" is Mandatory for the Product$")
    public void iVerifyIsMandatoryForTheProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDLevelMand());
    }

    @Then("^I verify \"([^\"]*)\" helptext for the Product$")
    public void iVerifyHelptextForTheProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDLevelHelpTXT());
    }


    @Then("^I select item \"([^\"]*)\" from the drop down list for PRD level$")
    public void iSelectItemFromTheDropDownListForPRDLevel(String item) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectPRDLevelItems(item));
    }


    @Then("^I verify all fields in Data Governance tab all fields have default values for PRD$")
    public void iVerifyAllFieldsInDataGovernanceTabAllFieldsHaveDefaultValuesForPRD(List<String> xpathitem) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verifyDGfieldshasdefaultValues(xpathitem));

    }

    @Then("^I verify \"([^\"]*)\" validation should be displayed for PRD$")
    public void iVerifyValidationShouldBeDisplayedForPRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDLevelValidatnMsg());
    }


    @Then("^I verify all fields in Data \"([^\"]*)\" Governance tab all fields have default values for PRD with two radio buttons$")
    public void iVerifyAllFieldsInDataGovernanceTabAllFieldsHaveDefaultValuesForPRDWithTwoRadioButtons(String arg0, List<String> xpathitem) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDGfieldForTworadioButtn(xpathitem));
    }

    @Then("^I verify three radio buttons in Data Governance tab all fields have default values for PRD$")
    public void iVerifyThreeRadioButtonsInDataGovernanceTabAllFieldsHaveDefaultValuesForPRD(List<String> xpathitems) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDGfieldforThreeradioButtn(xpathitems));
    }

    @Then("^I verify textbox in Data Governance tab have default  for PRD$")
    public void iVerifyTextboxInDataGovernanceTabHaveDefaultForPRD(List<String> xpathitem) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verifyDGTXTfieldshasdefaultValues(xpathitem));

    }

    @Then("^I verify checkbox in Data Governance tab have default  for PRD$")
    public void iVerifyCheckboxInDataGovernanceTabHaveDefaultForPRD(List<String> xpathitem) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyDGcheckBoxfieldhasdefaultValues(xpathitem));
    }

    @Then("^I verify \"([^\"]*)\" helptext for the PROD$")
    public void iVerifyHelptextForThePROD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPrdTypeHelpTxt());
    }

    @Then("^I select item from dropdown list for Product Type$")
    public void iSelectItemFromDropdownListForProductType() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectitemPRDType());
    }

    @And("^Validate each item present in the detail page for PRD Type for Product$")
    public void validateEachItemPresentInTheDetailPageForPRDTypeForProduct() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDTypeIndetailPG());
    }

    @Then("^I verify Product Status helptext for the PRD$")
    public void iVerifyProductStatusHelptextForThePRD() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtPRDPurps());
    }

    @Then("^I Verify if limit exceeds validation -message should get displayed for PRD Purpose$")
    public void iVerifyIfLimitExceedsValidationMessageShouldGetDisplayedForPRDPurpose(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(dataGovernance11Page.verifyTheLimitExceedMsgForPrdPUrs(text));
        }
    }

    @Then("^I Verify by adding valid data for field for PRD PURPS$")
    public void iVerifyByAddingValidDataForFieldForPRDPURPS(List<String> textList) throws Throwable {
        for (String text : textList) {

            Assert.assertTrue(dataGovernance11Page.verifyValidPURPData(text));
        }
    }

    @And("^Validate each item present in the detail page for PRD PURP for Product$")
    public void validateEachItemPresentInTheDetailPageForPRDPURPForProduct() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPRDPURDetail());
    }

    @Then("^I verify \"([^\"]*)\" helptext of the PRD$")
    public void iVerifyHelptextOfThePRD(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtPAZ());
    }

    @Then("^I add data for PAZ ID of PRD$")
    public void iAddDataForPAZIDOfPRD(List<String> textList) throws Throwable {
        for (String text : textList) {

            Assert.assertTrue(dataGovernance11Page.enterdata(text));

        }
    }

    @Then("^I verify the validation message for PAZ ID of PRD$")
    public void iVerifyTheValidationMessageForPAZIDOfPRD() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidatnMsgPAZ());
    }

    @And("^Validate each item present in the detail page for PRD PAZ for Product$")
    public void validateEachItemPresentInTheDetailPageForPRDPAZForProduct() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPAZDetail());
    }

    @And("^Validate each item present in the detail page for Product(\\d+)rd paryt for Product$")
    public void validateEachItemPresentInTheDetailPageForProductRdParytForProduct(int arg0) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verify3rdPartyDetail());
    }


    @Then("^I verify \"([^\"]*)\" is Mandatory for the Prod$")
    public void iVerifyIsMandatoryForTheProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyEntrOwnerMandrt());

    }

    @Then("^I verify \"([^\"]*)\" helptext of the Prod$")
    public void iVerifyHelptextOfTheProd(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyEntrOwnerHelp());
    }

    @Then("^I click on For assistance of Enterprise Owners$")
    public void iClickOnForAssistanceOfEnterpriseOwners() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyAssistanceofEnterOwer());
    }

    @Then("^I select Enterprise Owner from the list$")
    public void iSelectEnterpriseOwnerFromTheList(List<String> itemList) throws Throwable {
        for (String item : itemList) {

            Assert.assertTrue(dataGovernance11Page.selectEnterOwner(item));

        }
    }

    @And("^Validate each item present in the detail page for EnterpriseOwner for Product$")
    public void validateEachItemPresentInTheDetailPageForEnterpriseOwnerForProduct(List<String> item) throws Throwable {
        for (String item1 : item) {
            Assert.assertTrue(dataGovernance11Page.verifyEnterOwnDetail(item1));
        }
    }

    @Then("^I remove Enterprise Owner from the list$")
    public void iRemoveEnterpriseOwnerFromTheList(List<String> itemList) throws Throwable {
        for (String item : itemList) {
            Assert.assertTrue(dataGovernance11Page.deselectEnterOwner(item));

        }
    }

    @And("^Validate item present in detail page for TR Jointly decides field$")
    public void validateItemPresentInDetailPageForTRJointlyDecidesField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTRJointlyDetail());
    }

    @Then("^I check \"([^\"]*)\" Type of Technology$")
    public void iCheckTypeOfTechnology(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeTags());
    }

    @Then("^I verify helpText of Tags of Technology$")
    public void iVerifyHelpTextOfTagsOfTechnology() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTagsHelpTxt());
    }

    @Then("^I add below tags to the Technology tag field$")
    public void iAddBelowTagsToTheTechnologyTagField(List<String> itemList) throws Throwable {
        for (String item : itemList) {
            Assert.assertTrue(dataGovernance11Page.addTags(item));

        }

    }

    @Then("^check for validation message in the popup window$")
    public void checkForValidationMessageInThePopupWindow() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidtnTagMsg());
    }

    @And("^Validate each item present in the detail page for Tags for Product$")
    public void validateEachItemPresentInTheDetailPageForTagsForProduct(List<String> item) throws Throwable {
        for (String item1 : item) {
            Assert.assertTrue(dataGovernance11Page.verifyTagsDetail(item1));
        }
    }

    @Then("^click on below tag of Technology$")
    public void clickOnBelowTagOfTechnology(List<String> item) throws Throwable {
        for (String item1 : item) {
            Assert.assertTrue(dataGovernance11Page.clickOnTagsDetail(item1));

        }
    }

    @Then("^i valid the tagged Technology page should be displayed$")
    public void iValidTheTaggedTechnologyPageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTaggedTechn());
    }

    @Then("^I remove below tags to the Technology tag field$")
    public void iRemoveBelowTagsToTheTechnologyTagField(List<String> itemList) throws Throwable {
        for (String item : itemList) {
            Assert.assertTrue(dataGovernance11Page.removeTagsTech(item));

        }
    }

    @Then("^I check \"([^\"]*)\" is present in product$")
    public void iCheckIsPresentInProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPlatClassfDisplayed());
    }

    @Then("^I check \"([^\"]*)\" is manadtory in product$")
    public void iCheckIsManadtoryInProduct(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPlatClassFMand());
    }

    @Then("^I Select Platform Classification subitem in product$")
    public void iSelectPlatformClassificationSubitemInProduct(List<String> item) throws Throwable {
        for (String item1 : item) {


            System.out.println("ITEMS" + item1);
            Reporter.addStepLog("Items Selected" + item1);
            Assert.assertTrue(dataGovernance11Page.selectSubitemPlatClss(item1));
        }

    }

    @Then("^I verify the validation message for Platform Classification in product$")
    public void iVerifyTheValidationMessageForPlatformClassificationInProduct(List<String> valtnmsg) throws Throwable {

        for (String msg : valtnmsg) {
            System.out.println("Validation message" + msg);
            Reporter.addStepLog("Validation message" + msg);
            Assert.assertTrue(dataGovernance11Page.verifyStndPltValidtnMsg(msg));

        }

    }

    @Then("^I verify subquestions are should not be displayed$")
    public void iVerifySubquestionsAreShouldNotBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuesPlatfrmNotDisp());
    }

    @Then("^I verify (\\d+) subquestions are should be displayed$")
    public void iVerifySubquestionsAreShouldBeDisplayed(int arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuesPlatfrmDisply());
    }

    @And("^I Select Standard Platform subquestion item in product$")
    public void iSelectStandardPlatformSubquestionItemInProduct(List<String> stnplfItems) throws Throwable {

        for (String items : stnplfItems) {
            System.out.println("ITEMS" + items);
            Reporter.addStepLog("Items Selected" + items);
            Assert.assertTrue(dataGovernance11Page.verifyStndPltSubItems(items));

        }
    }

    @And("^I Select Migration Date subquestion item in product$")
    public void iSelectMigrationDateSubquestionItemInProduct(List<String> migdate) throws Throwable {
        try {
            for (String dateitem1 : migdate) {
                System.out.println("before convertn" + dateitem1);
                int dateitem = Integer.valueOf(dateitem1);

                System.out.println("Date" + dateitem);
                Reporter.addStepLog("Date Selected" + dateitem);
                Assert.assertTrue(dataGovernance11Page.selectMigrDate(dateitem));
            }


        } catch (Exception e) {
            System.out.println("Exception" + e);

        }
    }

    @Then("^I verify the validation message for Migration Date in product$")
    public void iVerifyTheValidationMessageForMigrationDateInProduct(List<String> valtnmsg) throws Throwable {

        for (String msg : valtnmsg) {
            System.out.println("Validation message" + msg);
            Reporter.addStepLog("Validation message" + msg);
            Assert.assertTrue(dataGovernance11Page.verifyStnPltMigDateMsg(msg));

        }
    }

    @Then("^I verify the validation message for Standard Platform in product$")
    public void iVerifyTheValidationMessageForStandardPlatformInProduct(List<String> valtnmsg) throws Throwable {

        for (String msg : valtnmsg) {
            System.out.println("Validation message" + msg);
            Reporter.addStepLog("Validation message" + msg);
            Assert.assertTrue(dataGovernance11Page.verifyStnPltvalidatMsg(msg));

        }
    }


    @Then("^I verify Migartion Date validation message$")
    public void iVerifyMigartionDateValidationMessage(List<String> valtnmsg) throws Throwable {

        for (String msg : valtnmsg) {
            System.out.println("Validation message" + msg);
            Reporter.addStepLog("Validation message" + msg);

            Assert.assertTrue(dataGovernance11Page.verifyValidateMigrdate(msg));
        }
    }

    @Then("^I select empty date for Migration Date$")
    public void iSelectEmptyDateForMigrationDate() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.emptyMigrtnDate());
    }

    @Then("^Validate each item of present in detail page in product$")
    public void validateEachItemOfPresentInDetailPageInProduct(List<String> items) throws Throwable {
        for (String itemList : items) {
            Assert.assertTrue(dataGovernance11Page.verifyStandplfDetail(itemList));

        }

    }

    @Then("^I verify \"([^\"]*)\" field is present in Product$")
    public void iVerifyFieldIsPresentInProduct(String arg0) throws Throwable {
       Assert.assertTrue(dataGovernance11Page.verifyStatusTechDisplayed());
    }

    @Then("^I verify I select items from \"([^\"]*)\" in product$")
    public void iVerifyISelectItemsFromInProduct(List<String> items) throws Throwable {
        for (String itemList : items) {
            Assert.assertTrue(dataGovernance11Page.selectStatusItem(itemList));
        }

    }

    @Then("^I verify I select items from  Status in Product$")
    public void iVerifyISelectItemsFromStatusInProduct(List<String> items) throws Throwable {
        for (String itemList : items) {
            Assert.assertTrue(dataGovernance11Page.selectStatusItem(itemList));
        }
    }

    @And("^Validate each item present in the detail page for Status for Product$")
    public void validateEachItemPresentInTheDetailPageForStatusForProduct() throws Throwable {
       Assert.assertTrue(dataGovernance11Page.verifyStatusTechDetail());
    }

    @Then("^I verify \"([^\"]*)\" field is present in Produc$")
    public void iVerifyFieldIsPresentInProduc(String arg0) throws Throwable {
    Assert.assertTrue(dataGovernance11Page.verifyAssertOwnshp());
    }


    @Then("^I verify \"([^\"]*)\" field is SubField(\\d+) is present in PrD$")
    public void iVerifyFieldIsSubFieldIsPresentInPrD(List<String> subfield) throws Throwable {
//        for (String subfield : subfield1) {
//            Assert.assertTrue(dataGovernance11Page.verifySubFieldAssert());
//        }
    }
}





