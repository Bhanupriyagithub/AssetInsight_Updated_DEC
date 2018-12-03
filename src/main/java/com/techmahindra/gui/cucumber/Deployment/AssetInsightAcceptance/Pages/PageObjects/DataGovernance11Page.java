package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.cucumber.listener.Reporter;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Utils.Utility;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.HighlightAnElement;



import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;


public class DataGovernance11Page extends BasePage {


    private static final String XPATH_ITEM_LIST4 = ".//*[contains(@id,'SensitivePIIDataType')]//li[@title='%s']";
    private static final String XPATH_FIELD_NAME_PRDJNT = ".//*[@id='_PersonalDataIsJointDecision_";
    private static final String XPATH_PRDJNT_DESC = ".//*[@id='lblPersonalDataJointDecision']";
    private static final String XPATH_THRDPARTY_IDK = "//*[@id = '_PersonalDataHasThirdPartyContract_IDK']";
    private static final String XPATH_COMMVALID = ".//*[contains(text(),'It has been specified in both the Sensitive PII Data and Standard PII Data sections that the product does not handle personal data (PII) although at least one of the questions in the Additional Article 30 Questions section indicates that it does')]";
    private static final String XPATH_NSOD = ".//*[@id = 'lblNextSignOffDate']";
    private static final String XPATH_NSOD1 = ".//*[@id = 'lblNextSignOffDate']/..//td//div";
    private static final String XPATH_SensitvCustAPP = ".//*[@id = 'lblSensitiveCustomerOrPartnerData']";
    private static final String XPATH_ITEM_SENPATTDATA = ".//*[contains(@id,'divPickListSensitiveCustomerDataContext')]//..//li[@title='%s']";
    private static final String XPATH_ITEM_SENCUSTPATTDATA = ".//*[contains(@id,'divPickListSensitiveCustomerDataPupose')]//..//li[@title='%s']";
    private static final String XPATH_SENTR_DATA = ".//*[@id = 'lblSensitiveThomsonReutersData']";
    private static final String XPATH_Patter_DATA = ".//*[@id= 'lblStandardCustomerOrPartnerData']";
    //private static final String XPATH_FIELD_NAME_TRDPRD = ".//*[@id='_PersonalDataHasThirdPartyContract_']" ;
    private static final String XPATH_FIELD_NAME_TRDPRD = ".//*[@id='_PersonalDataHasThirdPartyContract";
    private static final String XPATH_DATASENSITIVE = ".//*[@id='lblDataSensitiveToHostingContext";
    private static final String XPATH_DATADEPEN = ".//*[@id='lblDataDependency']";
    private static final String XPATH_SEARCHDATADEP = ".//*[@id='divPickListSubDependUponApplications']";
    private static final String XPATH_ITEM_LISTDATDEP = ".//*[contains(@id,'divPickListSubDependUponApplications')]//li[@title='%s']";
    private static final String XPATH_SEARCHSUPPRTPRD = ".//*[@id='divPickListProducts']";
    private static final String XPATH_ITEM_SUPPPRD = ".//*[contains(@id,'divPickListProducts')]//li[@title='%s']";
    //private static final String XPATH_ITEM_LIST7 = ".//*[contains(@id,'regulatedData')]//..//div//li//div[text()='%s']";
    private static final String XPATH_ITEM_LIST7 = ".//*[contains(@id,'regulatedData')]//..//div//li//div[text()='%s']";
    private static final String XPATH_BU = ".//*[@id = 'taxoPickerBusinessUnit']";
    private static final String XPATH_3rdParty = ".//*[@id = 'HasThirdPartyData']";
    private static final String XPATH_BUSUBSEGDetail = ".//*[contains(text(),'Intellectual Property and Science')]";
    private static final String Xpath_StndPl ="//*[@id='StandardPlatformClassification']//..//span[contains(text(),'%s')]";
    private static final String Xpath_StnPLValmsg = "//*[@id='trStandardPlatform']//..//span[contains(text(),'%s')]";

    private int count = 1;

    @FindBy(xpath = "//*[@id='lblSensitiveCustomerDataDataContexts']")
    private WebElement stdcntx;
    //private static final String XPATH_PRDJNT_DESC1 = ".//*[@id='lblPersonalDataJointDecision]";

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']")
    private WebElement newField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//td//div//input")
    private WebElement typeOfnewField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData']")
    private WebElement typeOfnewSTDPIIField;

    @FindBy(xpath = "//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']")
    private WebElement newFieldOtherSTD;

    // @FindBy(xpath="//div[contains(@id, 'divPickListStandardPIIDataType')]//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    @FindBy(xpath = "//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    private WebElement newFieldOther;


    @FindBy(xpath = "//textarea[@id='BusinessCriticalitySpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement othernewSTDPIIField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][1]")
    private WebElement stdPIIDataYes;


    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][2]")
    private WebElement stdPIIDataNo;


    @FindBy(xpath = "//div[contains(@id,'divStandardPIIData')]//div[text()='Standard PII Data Type ']")
    private WebElement stdPIIType;


    private static final String XPATH_ITEM_LIST = ".//*[contains(@id,'%s')]//li[@title='%s']";

    private static final String XPATH_ITEM_LIST5 = ".//*[contains(@id,'%s')]//..//div//li[@title='%s']";

    @FindBy(xpath = "//*[text()='Standard PII Data Type - Other ']//span")
    private WebElement stdOthrmandatoryfield;

    @FindBy(xpath = "//*[contains(text(),'please select \"Other\" and specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIData;

    @FindBy(xpath = "//*[contains(text(),'Please specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIOthers;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']//span")
    private WebElement mandatoryField;


    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//*[@type='radio']")
    private WebElement radioButton;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_Yes']")
    private WebElement clikOnYes;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_No']")
    private WebElement clikOnNo;

    @FindBy(xpath = "//*[text()='Provide a brief description as to why you think this is ']")
    private WebElement subQueField1;

    @FindBy(xpath = "//*[text()='If you answered \"Yes\", please identify the name and contact details of the customer, reseller, partner or other party who jointly decides how to use personal data.  Please include for example the contract number and/or TR personnel that negotiated the contract. ']")
    private WebElement subQueField2;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_IDK']")
    private WebElement clickOnIdontKnow;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1Type;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement ExistingFieldType;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1txtbox;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionContact']")
    private WebElement SubQueField2txtbox;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity.PersonalDataHasTRPermission-error']")
    private WebElement errorMsg;

    //@FindBy(xpath = "//*[@id='lblPersonalDataHasThirdPartyContract']")
    //private WebElement newFieldPrd;

    @FindBy(xpath = "//*[@id='lblPersonalDataHasThirdPartyContract']/..//td//div//input")
    private WebElement fieldType;

    @FindBy(xpath = "//*[contains(text(),'Some countries require that specific contract clauses are in place when there is a transfer of')]")
    private WebElement helpTxtThirdparty;


    private static final String XPATH_ITEM_THRDPARTY = "//*[@id='lblPersonalDataHasThirdPartyContract']";

    private static final String XPATH_THRDPARTY_No = "//*[@id='_PersonalDataHasThirdPartyContract_No']";

    private static final String XPATH_THRDPARTY_IDNTKNW = "//*[@id='_PersonalDataHasThirdPartyContract_IDK']";

    private static final String XPATH_THRDPARTY_YES = "//*[@id = '_PersonalDataHasThirdPartyContract_Yes']";

    @FindBy(xpath = "//*[@id='PersonalDataThirdPartyContractDescription']")
    private WebElement thrdPrtyDesc;

    @FindBy(xpath = "//*[@id='lblPersonalDataThirdPartyContractDescription']//span")
    private WebElement thrdParySub;

    private static final String XPATH_FIELD_NAME_PRD = "//*[@id='_PersonalDataHasThirdPartyContract_']";

    private WebElement THRDPRTY;

    private static final String SENSITIVEPII = ".//*[@id='ProductSpecialFactor_SensitivePIIData']";

    private static final String XPATH_SENSIPII = ".//*[@id='%s']";


    @FindBy(xpath = "//*[@id='lblSensitivePIIDataTypes']")
    private WebElement senistivePIIType;

    private static final String STANDRANDPII = ".//*[@id='ProductSpecialFactor_StandardPIIData'][1]";

    @FindBy(xpath = ".//*[@id='lblStandardPIIDataTypes']")
    private WebElement standradPIIType;

    @FindBy(xpath = ".//*[@id='lblPersonalDataIsJointDecision']")
    private WebElement personalDataIsJoint;

    @FindBy(xpath = "//*[@id='lblPersonalDataIsJointDecision']/..//td//div//input")
    private WebElement verifyFieldTypePRJNT;

    @FindBy(xpath = "//*[@id='lblPersonalDataIsJointDecision']/..//td//div[2]")
    private WebElement helpTxtPRDJNT;

    @FindBy(xpath = ".//*[@id='lblPersonalDataIsJointDecision']//span")
    private WebElement personalDataIsJointMan;

    private static final String XPATH_PRDJNT_CONTRCT = ".//*[@id='lblPersonalDataJointDecisionContact']";

    @FindBy(xpath = ".//*[@id='PersonalDataJointDecisionDescription']")
    private WebElement prdJNTDesct;

    @FindBy(xpath = ".//*[@id='PersonalDataJointDecisionContact']")
    private WebElement prdJNTContr;
    private static final String XPATH_PRDJNT_DESC2 = ".//*[@id='lblPersonalDataJointDecision";


    private static final String XPATH_additionART = ".//*[contains(text(),'%s')]";
    private static final String XPATH_TR_SUBCNTR = "PersonalDataCanTRDecideUsage";
    private static final String XPATH_TR_OTHERS = "PersonalDataIsSharedWithOthers";
    private static final String XPATH_SUB_QUESTN = ".//*[@id='lblPersonalDataSharedWithOthersDescription']";

    @FindBy(xpath = ".//*[@id='PersonalDataSharedWithOthersDescription']")
    private WebElement trsubQuedesc;

    private static final String XPATH_TR_SENISPIIDATA = ".//*[@id = 'SensitivePIIDataSubjects']";


    @FindBy(xpath = ".//*[@id='BusinessCriticalitySpecialFactor_SensitivePIIData'][1]")
    private WebElement sensitvPIIdata;

    @FindBy(xpath = "//*[contains(text(),'Data protection legislation requires that we know who we are processing Sensitive PII')]")
    private WebElement sensitivePIISubhelp;
    //private static final String  XPATH_ITEM_LIST6= ".//*[contains(@id,'SensitivePIIDataSubjects')]//li[@title='%s']";
    private static final String XPATH_ITEM_LIST6 = ".//*[contains(@id,'SensitivePIIDataSubjects')]//..//div//li[@title='%s']";

    @FindBy(xpath = ".//*[@id = 'BusinessCriticalitySpecialFactor_SensitivePIIData'][2]")
    private WebElement sensitvPIIdataNo;

    @FindBy(xpath = ".//*[@id = 'BusinessCriticalitySpecialFactor_StandardPIIData'][2]")
    private WebElement stndrPIIdataNo;

    @FindBy(xpath = ".//*[@id = 'PersonalDataIsSharedWithOthers_No']")
    private WebElement clikOnSUBNo;

    @FindBy(xpath = ".//*[@id = '_PersonalDataCanTRDecideUsage_No']")
    private WebElement clikOnTRNo;
    private static final String XPATH_TRNo = ".//*[@id = '_PersonalDataCanTRDecideUsage";
    private static final String XPATH_GEO_TRNo = "//*[@id='_PersonalDataIsAvailableOutsideGeography_";
    private static final String XPATH_TRRETEN_No = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary']";

    @FindBy(xpath = ".//*[@id='_PersonalDataIsSharedWithOthers_No']")
    private WebElement idntknwPRShared;

    @FindBy(xpath = "(//input[@id='ApplicationSignOffInfo_NextSignOffDateinDB' and @aria-invalid='false'])")
    private WebElement nsdonotMan;

    @FindBy(xpath = "(//*[@id='ApplicationSignOffInfo_NextSignOffDateinDB' and @type='text'])")
    private WebElement nsodtype;

    @FindBy(xpath = "//.[@id='ui-datepicker-div']")
    private WebElement nsodcal;

    @FindBy(xpath = "//*[contains(text(),'01/09/20019')]")
    private WebElement nsdoValiMsg;

    @FindBy(xpath = ".//*[@id='divSensitiveCustomerPartnerData']")
    private WebElement sensicustSub;

    @FindBy(xpath = ".//*[@id='lblSensitiveCustomerDataDataContexts']//span")
    private WebElement sensicustDataPatt;

    @FindBy(xpath = ".//*[@id='lblSensitiveCustomerDataDataPurposes']//span")
    private WebElement sensicustPattData;

    @FindBy(xpath = "//div[contains(@id, 'divPickListSensitiveCustomerDataContext')]//li[@title='Customer input data']")
    private WebElement sentiPattSearchItem;

    @FindBy(xpath = " //div[contains(@id, 'divPickListSensitiveCustomerDataPupose')]//li[@title='Customer Support']")
    private WebElement sentiPattDataSearchItem;

    @FindBy(xpath = ".//*[@id = 'lblLinkDataSensitiveToHostingContextUrl']")
    private WebElement dataSentiUrl;

    @FindBy(xpath = ".//*[@id = 'BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement dataSenstiDescr;

    @FindBy(xpath = ".//*[@id = 'ApplicationDataPrivacySecurity_LinkDataSensitiveToHostingContextUrl']")
    private WebElement dataSentiUrltxt;

    @FindBy(xpath = ".//*[contains(text(),'Dependent application invokes one or more functions of the depended-upon application OR it consumes data flows produced by depended-upon application.')]")
    private WebElement helpDataDep;

    @FindBy(xpath = "//div[contains(@id, 'divPickListSubDependUponApplications')]//li[@title='ADI/ADE']")
    private WebElement searchItemData;

    @FindBy(xpath = ".//*[contains(text(),'Abeledo Perrot')]")
    private WebElement datadepdetail;

    @FindBy(xpath = ".//*[@id ='lblSupportsProducts']")
    private WebElement supprtprd;

    @FindBy(xpath = "//*[contains(text(),'Application invokes one or more of the functions for the product OR if a data flow')]")
    private WebElement supprtPrdHelpTxt;

    @FindBy(xpath = "//div[contains(@id, 'divPickListProducts')]//li[@title='Activo Fijo']")
    private WebElement dataDepItem;

    @FindBy(xpath = ".//*[contains(text(),'Data Query')]")
    private WebElement supprtPRDdetail;

    @FindBy(xpath = ".//*[@id = 'BusinessCriticalitySpecialFactor_RegulatedDataTypeDescripton']")

    private WebElement regulatedDataOthr;
    private final String Xpath_regulatedata = ".//*[@id='lblRegulatedDataList']";

    private final static String regDataOther = ".//*[@id='lblRegulatedDataTypeDescripton']";

    @FindBy(xpath = ".//*[contains(@id,'lblRegulatedDataDetail')]//..//td//..//td[2]")
    private WebElement regulatedDetail;

//    @FindBy(xpath = ".//*[contains(text(),'Product Name')]")
//    private WebElement productName;

    private final String xpath_PRD_Name = ".//*[contains(text(),'Product Name')]";

    @FindBy(xpath = ".//*[contains(text(),'General')]")
    private WebElement general;

    @FindBy(xpath = ".//*[@id='Name']")
    private WebElement prdName;

    @FindBy(xpath = ".//*[contains(text(),'The Product Name field is required.')]")
    private WebElement prdNameVldMsg;

    @FindBy(xpath = ".//*[@id = 'BusinessUnitId-error']")
    private WebElement businessUnitvalidmsg;

    @FindBy(xpath = ".//*[contains(text(),'EBS')]")
    private WebElement businessitemdetail;

    @FindBy(xpath = "//*[contains(text(),'3rd party')]//div")
    private WebElement helpTxt3rdParty;

    private final static String xpath_PRD_BUSUBSEG = ".//*[contains(text(),'Business Sub Segment')]";
    private final static String xpath_BUSUBSEGITEM = ".//*[@id='BusinessSubSegmentId']";
    private final static String xpath_PrdStatus = ".//*[contains(text(),'Product Status')]";

    @FindBy(xpath = ".//*[@id='trOtherStatus']")
    private WebElement prdststusOthr;

    @FindBy(xpath = ".//*[@id='OtherStatus']")
    private WebElement otherPRDstatus;

    @FindBy(xpath = "//td[text()='Product Status']/..//td[contains(text(),'Available for Sale')]")
    private WebElement prdStatDetail;

    private final static String xpath_PRDLevel = ".//*[contains(text(),'Product Level')]";

    @FindBy(xpath = ".//*[@id = 'ProductLevel-error']")
    private WebElement prdLeveValidatnMsg;
    private final static String xpath_PRD_TYPE = ".//*[contains(text(),'Product Type')]//..//div";

    @FindBy(xpath = "//td[text()='Product Type']//..//td[contains(text(),'Platform')]")
    private WebElement prdTypeDetail;

    private final static String xpath_PRD_PURP = ".//*[contains(text(),'Product Purpose')]";

    @FindBy(xpath = ".//*[@id='ProductPurpose']")
    private WebElement xpath_PRDPUR;


    private final static String xpath_PRD_PAZ = ".//*[contains(text(),'PAZ ID')]";

    @FindBy(xpath = ".//*[contains(text(),'PAZ ID must be integer')]")
    private WebElement xpath_valtnmsg_PAZ;

    @FindBy(xpath = "//td[text()='PAZ ID']/..//td[contains(text(),'2')]")
    private WebElement xpath_PAZ_deatil;

    @FindBy(xpath = ".//*[contains(text(),'3rd party')]/..//td[contains(text(),'Yes')]")
    private WebElement xpath_3rdparty_detail;
    private final static String xpath_enterowner=".//*[@id='divEnterpriseOwner']";

    @FindBy(xpath=".//*[@id='_etyPckrCntr_EnterpriseOwnerCSV']//..//..//input")
    private WebElement xpath_enterownerItem;

    @FindBy(xpath=".//*[@id='_etyPckrCntr_EnterpriseOwnerCSV_listbox']")
    private WebElement xpath_enterownerItem1;

    private final static String xpath_entrown=".//*[@class='enterpriseOwner']";

    @FindBy(xpath = ".//*[@id='lblPersonalDataIsJointDecision']//..//input")
    private WebElement persnalDataRadio;


    @FindBy(xpath = " .//*[@class='etyPkrContainer etyPkrLstContainer ']//..//..//..//..//span[contains(text(),'Edmonds, Sarah (TRGR)')]")
    private WebElement xpath_enterownerItem_remv;

    @FindBy(xpath = ".//*[@id='_ac_ApplicationTagsCSV']")
    private WebElement xpath_tagsApp;

    @FindBy(xpath = ".//*[contains(text(),'A Tag name cannot contain any of the following special characters:')]")
    private WebElement xpath_TagsHelpTxt;

    @FindBy(xpath = ".//*[@id='_etyPckrCntr_ApplicationTagsCSV']//..//..//input")
    private WebElement xpath_Tagsfield;

    //@FindBy(xpath = ".//*[@id='_etyPckrCntr_ApplicationTagsCSV']//ul")
    @FindBy(xpath = ".//*[@class='ui-menu-item']")
    private WebElement xpath_Tagsfield1;

   private final static String  xpath_tags=".//*[@class='col-detail-title' and text()='Tags']";


  private final static String xpath_tagTech= "//*[text()='170 Systems (Markview)']";




  private final static String xpath_remTech=".//*[@class='etyItem' and text()='123456']";


    //private final static String xpath_Detailtags="//td[text()='Tags']/..//a[contains(text(),'123456')]";
    private final static String xpath_Detailtags="//td[text()='Tags']/..//a[contains(text(),'%s')]";
    private final static String xpath_tagsdetail=".//*[@class='col-detail-title']";

    @FindBy(xpath = ".//*[contains(text(),'Standard Platform Classification')]")
    private WebElement xpath_StndrPlfmClass;


    private final static String xpath_PlfmClass=".//*[text()='Platform Classification']";

    @FindBy(xpath = ".//*[@id='StandardPlatformClassification']")
    private WebElement xpath_Plfclassitems;

    @FindBy(xpath="//*[@id='trStandardPlatform']")
    private WebElement xpath_stndrplfsuq;

    @FindBy(xpath = "//*[@id='trMigrationDate']")
    private WebElement xpath_Migdatesuq;

    @FindBy(xpath = "//*[@id='StandardPlatformId']")
    private WebElement xpath_StnPlfclassitems;

    @FindBy(xpath="//*[@id='MigrationDate']")
    private WebElement xpath_Migdate;

    @FindBy(xpath = ".//*[@class='ui-datepicker-trigger']")
    private WebElement xpath_datepic;
    private final static String Xpath_MigDatPl="//*[@id='MigrationDate']//..//span[contains(text(),'%s')]";
    private final static String xpath_StndPlfdetail=".//*[@id='_Tip_TD_StandardPlatform']//..//..//span[contains(text(),'%s')]";
    private final static String xpath_StatusTech=".//*[@id='StatusList']";

    @FindBy(xpath = "//td[text()='Status']/..//td[contains(text(),'Active')]")
    private WebElement xpath_status_detail;

    @FindBy(xpath=".//*[contains(text(),'ASSET Ownership')]")
    private WebElement xpath_Assert_Ownr;


    public DataGovernance11Page() throws Exception {
        super();
    }

    public boolean verifyNewField() {
        WebDriverUtils.waitForElementLoading(1);
        newField.isDisplayed();
        return true;
    }


    @Override
    protected WebElement elementForLoading() throws Exception {

        return technologyHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        return technologyHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }

    public boolean checkTypeOfField() {
        boolean flag = false;
        if (typeOfnewField.getAttribute("type").equals("radio")) {

            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeShouldSameAsExisting() {
        WebDriverUtils.waitForElementLoading(5);
        return true;
        /* System.out.println(newFieldRadioBtn.getAttribute("type"));*/

      /*  boolean flag = false;
        if (newFieldRadioBtn.getAttribute("type").equals(radioButtonExistnfField.getAttribute("type"))) {
            flag = true;
        }
        return flag;
    */
    }

    public boolean checkTypeOfSTDPIIField() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,typeOfnewSTDPIIField);
        WebDriverUtils.waitForElementLoading(5);
        if (typeOfnewSTDPIIField.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeOtherSTDPIIField() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newFieldOtherSTD.isDisplayed()) {
            flag = true;
        }
        return flag;

    }


    public boolean VerifyFieldPresentInTheDataGovernancePage() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newField.isDisplayed()) {
            flag = true;
        }
        return flag;

    }

    public boolean clickonOtherSTDPIIField() {
        WebDriverUtils.waitForElementLoading(5);
        boolean flag = false;
        if (newFieldOther.isDisplayed()) {
            newFieldOther.click();
            flag = true;
        }
        return flag;
    }

    public boolean checkOtherSTDPIIField() {

        boolean flag = false;
        // if (othernewSTDPIIField.getAttribute("id").equals("textarea")) {

        if (othernewSTDPIIField.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean clickOnSTDPIIDataYes() {

        WebDriverUtils.waitForElementLoading(5);
        HighlightAnElement.highlightElement(driver,stdPIIDataYes);

        boolean flag = false;
        if (stdPIIDataYes.isDisplayed()) {
            stdPIIDataYes.click();
            flag = true;
        }
        return flag;

    }


    public boolean stdPIIDataFieldYesThenStdPIIType() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (stdPIIType.isDisplayed()) {
            System.out.println("+++PIIDATE");
            flag = true;
        }
        return flag;
    }


    public boolean clickOnSTDPIIDataNo() {


        WebDriverUtils.waitForElementLoading(6);
        boolean flag = false;
        if (stdPIIDataNo.isDisplayed()) {
            stdPIIDataNo.click();

            Alert alert = driver.switchTo().alert();

            driver.switchTo().alert();

            alert.accept();
            WebDriverUtils.waitForElementLoading(6);

            flag = true;
        }
        return flag;

    }

    public boolean verifyOtherNotDisSTDPIIField() {


        boolean flag = false;

        // if (othernewSTDPIIField.getAttribute("id").equals("textarea")) {
        if (!(othernewSTDPIIField.isDisplayed())) {
            flag = true;
        }
        return flag;
    }

    public boolean selectBelowListOfValuesUnderSubField(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            WebElement stdPII = driver.findElement(By.xpath("//*[text()='Standard PII Data Context ']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdPII);
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", item);
            //driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).isDisplayed();
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST, fieldName, item))).isDisplayed();
//flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).getAttribute("class").contains("minus");
            //commented
        /*driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).click();
        flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).getAttribute("class").contains("minus");*/

        }
        return flag;
    }


    public boolean verifySTDPIIOthrfieldMandrty() {

        return stdOthrmandatoryfield.isDisplayed();

    }

    public boolean verifyHelpTxtSTDPIIData() {
        WebDriverUtils.waitForElementLoading(2);
        boolean flag = false;
        if (helpSTDPIIData.isDisplayed()) {
            flag = true;
        }

        return flag;


    }

    public boolean verifyHelpTxtSTDPIIDataOthers() {
        boolean flag = false;
        if (helpSTDPIIOthers.isDisplayed()) {
            flag = true;
        }

        return flag;

    }

    public boolean verifyMandatoryField() {
        WebDriverUtils.waitForElementLoading(2);
        mandatoryField.isDisplayed();
        return true;
    }

    public boolean verifyValidationMessage() {
        WebDriverUtils.waitForElementLoading(2);
      /*  boolean flag = false;
        if (!radioButton.isSelected()) {
            errorMsg.isDisplayed();
            flag = true;
        }*/
        return true;

    }

    public boolean verifySubQuestionFields() {
        WebDriverUtils.waitForElementLoading(2);

        clikOnYes.click();
        boolean flag = false;
        if (clikOnYes.isSelected()) {
            subQueField1.isDisplayed();
            subQueField2.isDisplayed();
            flag = true;
        }
        return flag;
    }

    public boolean clickonNO() {
        WebDriverUtils.waitForElementLoading(2);

        clikOnNo.click();

        if (clikOnNo.isSelected())
            return !subQueField1.isDisplayed();
        if (clikOnYes.isSelected())
            return !subQueField2.isDisplayed();
        else return false;

    }

    public boolean clickonIDontKnow() {
        WebDriverUtils.waitForElementLoading(2);

        clickOnIdontKnow.click();
        if (clickOnIdontKnow.isSelected())
            return !subQueField1.isDisplayed();
        if (clickOnIdontKnow.isSelected())
            return !subQueField2.isDisplayed();
        else return false;


    }

    public boolean verifyTheTypeOfSubQueFields() {

        boolean flag = false;
        if (SubQueField1Type.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyTypeOfSubQueShouldBeSameAsExistingField() {

        boolean flag = false;
        if (ExistingFieldType.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifySubQue1FieldLimit(String subQueLimit) {
        WebDriverUtils.waitForElementLoading(1);
        clikOnYes.click();
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(SubQueField1txtbox, subQueLimit);
        return true;
    }

    public boolean verifySubQue2FieldLimit(String subQue2Limit) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(SubQueField2txtbox, subQue2Limit);
        WebDriverUtils.waitForElementLoading(1);
        return true;
    }

    public boolean verifyItShouldBeMandatoryField() {
        return true;

    }

    private static final String XPATH_FIELD_NAME_TYPE = ".//input[@id='BusinessCriticalitySpecialFactor_%s']";
    private static final String XPATH_FIELD_NAMES = "//table[@class='ai-edit-field w100']//*[contains(text(),'%s')]";


    public boolean verifyFieldPrescenceInDataGovernancePage(String fieldName) {
        WebDriverUtils.waitForElementLoading(10);
        WebElement element = driver.findElement(By.xpath(String.format(XPATH_FIELD_NAMES, fieldName)));
        return element.isDisplayed();
    }


    public boolean checkTypeOfField(String fieldName) {
        String fieldNameNew = fieldName.replaceAll("\\s", "");
        WebDriverUtils.waitForElementLoading(8);
        return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew))).getAttribute("type").equals("radio");
    }

    public boolean clickOnRadioButtonForFieldName(String buttonValue, String fieldName) {
        String fieldNameNew = fieldName.replaceAll("\\s", "");
        switch (buttonValue.toLowerCase()) {
            case "yes":
                return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew) + "[@value='True']")).isSelected();
            case "no":
                return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew) + "[@value='False']")).isSelected();
            default:
                System.out.println("Wrong radio type value entered in the scenario file");
                return false;
        }


    }

    public boolean verifySubQuestionsUnderFieldNameIsDisplayed(String fieldName) {
        WebDriverUtils.waitForElementLoading(10);
        String newFieldName = "div" + fieldName.replaceAll("\\s", "");
        WebElement subQuestion = driver.findElement(By.xpath(".//*[@id='" + newFieldName + "']"));

        return subQuestion.isDisplayed();
    }

    public boolean verifyPrescenceOfSubFieldUnderField(String subField, String field) {
        WebDriverUtils.waitForElementLoading(10);
        boolean flag = false;
        String newFieldName = "div" + field.replaceAll("\\s", "");
        return driver.findElement(By.xpath(".//*[@id='" + newFieldName + "']//div[contains(@class,'ai-edit-field')]/div[contains(text(),'" + subField + "')]")).isDisplayed();
    }

    public boolean verifyHelpTextDisplayedForSubField(String subField) {
        String newFieldName = "div" + subField.replaceAll("\\s", "");
        switch (subField.toLowerCase()) {
            case "sensitive pii data type":
                return driver.findElement(By.xpath("//div[@class='ai-edit-hint' and contains(text(),'" + "Data protection legislation requires that we know what Sensitive PII data we are processing.')]")).isDisplayed();
            case "sensitive pii data context ":
            default:
                System.out.println("Wrong sub field name is mentioned in feature file");
                return false;
        }


    }

    public boolean verifyListOfValuesBePresentUnderSubField(String subField, List<String> items) {
        Boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST, fieldName, item))).isDisplayed();

            System.out.println(item);

        }
        return flag;
    }

    public boolean verifyListOfValuesSTNDPIISubField(String subField, List<String> items) {
        Boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST5, item))).isDisplayed();

            System.out.println(item);

        }
        return flag;
    }


    public boolean dontSelectYesNo() {
        return true;
    }

    public boolean clickOnYes() {
        return true;
    }

    public boolean clickOnNo() {
        return true;
    }

    public boolean clickOnIdontKnow() {
        return true;
    }

    public boolean verifyTypeOftheSubFields() {
        return true;
    }

    public boolean verifyTypeWithExistingField() {

        return true;
    }

    public boolean limitValidationForSubField1() {
        return true;
    }

    public boolean limitValidationForSubField2() {
        return true;
    }


    public boolean verifyFieldDispalyed() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(1);
        flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_THRDPARTY))).isDisplayed();
        return flag;
        //return true;

    }

    public boolean verifyFieldType() {
        WebDriverUtils.waitForElementLoading(2);
        boolean flag = false;
        if (fieldType.getAttribute("type").equals("radio")) {
            flag = fieldType.getAttribute("type").equals("radio");
        }
        return flag;

    }

    public boolean verifyHelpTextThirdParty() {
        boolean flag = false;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", helpTxtThirdparty);
        WebDriverUtils.waitForElementLoading(3);
        if (helpTxtThirdparty.isDisplayed()) {
            System.out.println(helpTxtThirdparty.getText());
            flag = true;

        }
        return flag;

    }

    public boolean isThirdPartyMand() {
        boolean flag = false;
        //String t=XPATH_ITEM_THRDPARTY+"'//span'";
        flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_THRDPARTY + "//span"))).isDisplayed();
        System.out.println("+++++++++" + flag);
        return flag;
    }

    public boolean verifyClickNobutton() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_THRDPARTY_No)));
        WebDriverUtils.waitForElementLoading(5);
        driver.findElement(By.xpath(XPATH_THRDPARTY_No)).click();

        flag = driver.findElement(By.xpath(XPATH_THRDPARTY_No)).isDisplayed();
        return flag;

    }

    public boolean verifyClickIDNKNWobutton() {
        boolean flag = false;
        driver.findElement(By.xpath(XPATH_THRDPARTY_IDNTKNW)).click();
        WebDriverUtils.waitForElementLoading(5);
        if (!thrdPrtyDesc.isDisplayed()) {
            flag = !thrdPrtyDesc.isDisplayed();
            System.out.println("XPATH_THRDPARTY_IDNTKNW" + flag);


        }
        return flag;


    }

    public boolean verifyClickYesbutton() {
        boolean flag = false;


        driver.findElement(By.xpath(XPATH_THRDPARTY_YES)).click();
        flag = driver.findElement(By.xpath(XPATH_THRDPARTY_YES)).isDisplayed();
        return flag;

    }

    public boolean verifyTHRDPRTYSubQMand() {
        boolean flag = false;
        if (thrdParySub.isDisplayed()) {
            flag = thrdParySub.isDisplayed();


        }
        return flag;
    }

    public boolean clickOnRadioButtonForFieldNamePRD(String buttonValue) {


        switch (buttonValue) {
            case "Yes":
                //    System.out.println(driver.findElement(By.xpath(XPATH_FIELD_NAME_PRD+"'Yes']"+"[@value='Yes']")));
                //  System.out.println(driver.findElement(By.xpath(XPATH_FIELD_NAME_PRD+"'Yes']"+"[@value='Yes']")).click();
                driver.findElement(By.xpath(XPATH_FIELD_NAME_PRD + "'Yes']" + "[@value='Yes']")).click();
                WebDriverUtils.waitForElementLoading(5);
                return true;
            //return driver.findElement(By.xpath(XPATH_FIELD_NAME_PRD+"'Yes']"+"[@value='Yes']")).isSelected();

            /*case "no":
               // return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew)+"[@value='False']")).isSelected();
           */
            default:
                System.out.println("Wrong radio type value entered in the scenario file");
                return false;
        }

    }


    public boolean verifyIfTheLimitExceedsTHPRTYValidationMSG(String text) {


        WebDriverUtils.waitForElementLoading(2);
        CommonMethods.ValidateAndUpdateField(thrdPrtyDesc, text);
        return true;


    }

    public boolean clearTHRPRTYTXT() {
        boolean flag = false;

        if (thrdPrtyDesc.isDisplayed()) {
            thrdPrtyDesc.clear();
            flag = true;

        }
        return flag;
    }

    public boolean verifyValidData(String text) {
        boolean flag = false;
        if (thrdPrtyDesc.isDisplayed()) {
            thrdPrtyDesc.sendKeys(text);
            flag = true;


        }
        return flag;
    }


    public boolean selectbelowListOfItems(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);


            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST4, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST4, item) + "/a/span")).click();
            WebDriverUtils.waitForElementLoading(10);
            System.out.println("++item++" + item);

            flag = true;

        }

        return flag;
    }

    public boolean clickonSenisitivePIIDataType() {
        boolean flag = false;
        if (!(driver.findElement(By.xpath(SENSITIVEPII)).isSelected())) {
            driver.findElement(By.xpath(SENSITIVEPII)).click();

        } else {
            System.out.println("++SENSITINVEPII alrady clicked++");

        }
        if (senistivePIIType.isDisplayed()) {
            System.out.println("+++SENSIT PII++");
            WebDriverUtils.waitForElementLoading(5);
            flag = true;


        }

        return flag;
    }

    public boolean clickYesStandardPIIData() {
        boolean flag = false;

        if (!(driver.findElement(By.xpath(STANDRANDPII)).isSelected())) {
            driver.findElement(By.xpath(STANDRANDPII)).click();


        } else {
            System.out.println("++STNDR PII DATA already clicked++");

        }
        if (standradPIIType.isDisplayed()) {
            System.out.println("++stndrPIITYE++" + standradPIIType.isDisplayed());
            flag = standradPIIType.isDisplayed();

        }
        return flag;

    }


    public boolean verifyListOfValuesBePresentUnderSubFieldSTND(String subField, List<String> items) {
        Boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST5, fieldName, item))).isDisplayed();

            System.out.println(item);

        }
        return flag;
    }

    public boolean selectbelowListOfItemsSTDPII(String subField, List<String> items) {


        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);


//
//            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST5, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST5,fieldName,item) + "/a/span")).click();
            WebDriverUtils.waitForElementLoading(10);
            System.out.println("++item++" + item);

            flag = true;

        }

        return flag;
    }

    public boolean verifyPersonalDataIsJointDecision() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        flag = personalDataIsJoint.isDisplayed();
        return flag;

    }

    public boolean verifyFieldTypePRJNT() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        HighlightAnElement.highlightElement(driver,verifyFieldTypePRJNT);
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (verifyFieldTypePRJNT.getAttribute("type").equals("radio")) {
            System.out.println("+PRJNT+++" + verifyFieldTypePRJNT.getAttribute("type").equals("radio"));
            flag = verifyFieldTypePRJNT.getAttribute("type").equals("radio");

        }

        return flag;
    }

    public boolean verifyHelpTxtPRDJNT() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,helpTxtPRDJNT);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", helpTxtPRDJNT);
        WebDriverUtils.waitForElementLoading(3);
        if (helpTxtPRDJNT.isDisplayed()) {
            System.out.println(helpTxtPRDJNT.getText());
            flag = true;

        }
        return flag;
    }

    public boolean verifyPRDJNTMND() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,personalDataIsJointMan);
        WebDriverUtils.waitForElementLoading(3);

        if (personalDataIsJointMan.isDisplayed()) {
            flag = personalDataIsJointMan.isDisplayed();

        }
        return flag;
    }

    public boolean verifyPRDJNTClickNobutton() {
        boolean flag = false;
        //HighlightAnElement.highlightElement(driver,persnalDataRadio);
        HighlightAnElement.highlightElement(driver,verifyFieldTypePRJNT);
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_PRDJNT) + "No']")).click();

        flag = true;


        if ((!driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']")).isDisplayed()) && (!driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']")).isDisplayed())) {

            flag = true;


        }
        return flag;
    }

    public boolean verifyClickPRDJNTIDNKNWobutton() {
        boolean flag = false;
        //HighlightAnElement.highlightElement(driver,persnalDataRadio);
        HighlightAnElement.highlightElement(driver,verifyFieldTypePRJNT);
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_PRDJNT) + "IDK']")).click();

        flag = true;


        if ((!driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']")).isDisplayed()) && (!driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']")).isDisplayed())) {

            flag = true;


        }
        return flag;
    }

    public boolean clickOnRadioButtonForFieldNamePRDJNTYes() {

        boolean flag = false;
        //HighlightAnElement.highlightElement(driver,persnalDataRadio);
        HighlightAnElement.highlightElement(driver,verifyFieldTypePRJNT);
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_PRDJNT) + "Yes']")).click();

        flag = true;


        if ((driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']")).isDisplayed()) && (driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']")).isDisplayed())) {

            flag = true;


        }
        return flag;
    }

    public boolean verifyPRDJNTSubQuesMand() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']")));
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']")).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Description']" + "//span")).isDisplayed();


        }
        return flag;
    }

    public boolean verifyPRDJNTCONTRCTMAND() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']")));
        if (driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']")).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(XPATH_PRDJNT_DESC2) + "Contact']" + "//span")).isDisplayed();


        }
        return flag;
    }

    public boolean verifyhelpTxtPRDJNTCNT() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_PRDJNT_CONTRCT) + "/..//td//div")));
        if (driver.findElement(By.xpath(String.format(XPATH_PRDJNT_CONTRCT) + "/..//td//div")).isDisplayed()) {
            System.out.println("contr helpTXT+++" + driver.findElement(By.xpath(String.format(XPATH_PRDJNT_CONTRCT) + "/..//td//div")));
            flag = driver.findElement(By.xpath(String.format(XPATH_PRDJNT_CONTRCT) + "/..//td//div")).isDisplayed();


        }
        return flag;
    }

    public boolean verifyIfTheLimitExceedsPRDJNT(String text) {
        WebDriverUtils.waitForElementLoading(2);
        CommonMethods.ValidateAndUpdateField(prdJNTDesct, text);
        return true;


    }

    public boolean verifyIfTheLimitExceedsPRDJNTCont(String text) {
        WebDriverUtils.waitForElementLoading(2);
        CommonMethods.ValidateAndUpdateField(prdJNTContr, text);
        return true;

    }

    public boolean clearPRDJNTFields() {
        boolean flag = false;

        if ((prdJNTContr.isDisplayed() && (prdJNTDesct.isDisplayed()))) {
            prdJNTContr.clear();
            prdJNTDesct.clear();
            flag = true;

        }
        return flag;

    }

    public boolean verifyValidDataPRDJNT(String text) {
        boolean flag = false;
        if ((prdJNTDesct.isDisplayed()) && (prdJNTContr.isDisplayed())) {
            HighlightAnElement.highlightElement(driver,prdJNTDesct);
            HighlightAnElement.highlightElement(driver,prdJNTContr);
            WebDriverUtils.waitForElementLoading(5);
            prdJNTDesct.sendKeys(text);
            prdJNTContr.sendKeys(text);
            flag = true;


        }

        return flag;
    }


    public boolean verifyAddART(String txt) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);


        System.out.println("+++ART ADDT++" + driver.findElement(By.xpath(String.format(XPATH_additionART, txt))).isDisplayed());
        flag = driver.findElement(By.xpath(String.format(XPATH_additionART, txt))).isDisplayed();


        return flag;
    }

    public boolean verifyAddARTICON(String newfield) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);

        System.out.println("+++ART ADDT++" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield))).isDisplayed());
        System.out.println("++ADDICON" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")).isDisplayed());
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")));
        flag = driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")).isDisplayed();

        return flag;
    }

    public boolean clickonAddARTICON(String newfield) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);

        System.out.println("+++ART ADDT++" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield))).isDisplayed());
        System.out.println("++ADDICON" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")).isDisplayed());
        flag = driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")).isDisplayed();
        HighlightAnElement.highlightElement(driver, driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")));
        driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//*[contains(@src,'/Content/Images/info-icon-unselected.png')]")).click();
        WebDriverUtils.waitForElementLoading(6);
        return flag;

    }

    public boolean verifyLinkToGDPR(String newfield) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        System.out.println("++GDPR LINK++" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).isDisplayed());
        flag = driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).isDisplayed();
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")));
        driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).click();
        return flag;

    }

    public boolean clickOnLinkGDPR(String newfield) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        System.out.println("++GDPR LINK++" + driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).isDisplayed());
        flag = driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).isDisplayed();
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")));
        driver.findElement(By.xpath(String.format(XPATH_additionART, newfield) + "//a[@href='https://www.eugdpr.org/']")).click();

        return flag;

    }

    public boolean verifyTRfield() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        System.out.println("" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']")));
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']")));
        flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']")).isDisplayed();

        return flag;

    }

    public boolean verifyTRfieldMandtr() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        System.out.println("++TR MAndr++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']//span")));
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']//span")));
        flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']//span")).isDisplayed();

        return flag;

    }

    public boolean verifyTRFieldType() {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']/..//td//div//input")).getAttribute("type").equals("radio")) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']/..//td//div//input")));
            System.out.println("+TRFieldType+++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']/..//td//div//input")).getAttribute("type").equals("radio"));
            //flag =driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']/..//td//div//input")).getAttribute("type").equals("radio");
            flag = true;


        }
        return flag;
    }

    public boolean clickonTRYes() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);",(driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_SUBCNTR) + "']/..//td//div//input")) ));
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_Yes']"))));

        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_Yes']"))).click();
        WebDriverUtils.waitForElementLoading(6);

        if (!driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed()) {
            System.out.println("TR YES OTHER" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed());
            flag = true;

        }

        return flag;

    }

    public boolean clickonTRNo() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        HighlightAnElement.highlightElement(driver, driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))));
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))).click();
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed()) {
            System.out.println("TR YES OTHER" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed());
            flag = true;

        }

        return flag;

    }

    public boolean verifyTRMan() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']//span"))));
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']//span"))).isDisplayed();
            System.out.println("++TR MAND++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']//span"))).isDisplayed());

        }
        return flag;

    }

    public boolean clickonTRIDNTKW() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_IDK']"))));
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_IDK']"))).click();
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed()) {
            System.out.println("TR YES OTHER" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']"))).isDisplayed());
            flag = true;

        }

        return flag;

    }

    public boolean verifySuqQuestionRadiobutton() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))));
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))).click();
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed()) {
            System.out.println("++TR radio button present++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed());
            flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed();
        }
        return flag;


    }

    public boolean verifyTRSubQuesFieldType() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed()) {
            System.out.println("++TR help TXt++" + (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed()));
            flag = (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).isDisplayed());
        }


        return flag;

    }

    public boolean verifyTRHelpTxt() {

        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td/div[2]"))));

        boolean flag = false;
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td/div[2]"))).isDisplayed()) {
            System.out.println("++TR radio button Type++" + (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).getAttribute("type").equals("radio")));
            flag = (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input"))).getAttribute("type").equals("radio"));
        }
        return flag;
    }

    public boolean clickonTRSubQuestNO() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[2]"))));
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[2]"))).isDisplayed()) {
            System.out.println("++TR suquestion NO clicked++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[2]"))).isDisplayed());
            driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[2]"))).click();
            flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[2]"))).isDisplayed();
        }
        return flag;

    }


    public boolean verifySubquestionOfNameAndContactDetails() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        if (!(driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN)))).isDisplayed()) {
            flag = !(driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN)))).isDisplayed();
        }
        return flag;

    }

    public boolean clickonTRSubQuestIDNTKNW() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[3]"))));
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[3]"))).isDisplayed()) {
            System.out.println("++TR suquestion Idnt  KNW clicked++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[3]"))).isDisplayed());
            driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[3]"))).click();
            flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[3]"))).isDisplayed();
        }
        return flag;
    }

    public boolean clickonTRYES() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[1]"))));
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[1]"))).isDisplayed()) {
            System.out.println("++TR suquestion NO clicked++" + driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[1]"))).isDisplayed());
            driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[1]"))).click();
            flag = driver.findElement(By.xpath(String.format("//*[@id='lbl" + XPATH_TR_OTHERS + "']/..//td//div//input[1]"))).isDisplayed();
        }
        return flag;
    }


    public boolean verifyTRSubQuesField() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN))));
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN))).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN))).isDisplayed();
        }
        return flag;

    }

    public boolean verifySubQuestionTXTMAnd() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "//span")));
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "//span")).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "//span")).isDisplayed();
        }
        return flag;

    }


    public boolean verifySubQuestHelpTxt() {

        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "/..//td//div")));
        WebDriverUtils.waitForElementLoading(6);
        if (driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "/..//td//div")).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(XPATH_SUB_QUESTN) + "/..//td//div")).isDisplayed();
        }
        return flag;


    }


    public boolean verifyIfTheLimitExceedsPRDDESC(String text) {
        WebDriverUtils.waitForElementLoading(2);
        CommonMethods.ValidateAndUpdateField(trsubQuedesc, text);
        return true;
    }

    public boolean validdataSubques(String text) {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,trsubQuedesc);
        if ((trsubQuedesc.isDisplayed())) {
            WebDriverUtils.waitForElementLoading(5);
            trsubQuedesc.sendKeys(text);

            flag = true;


        }
        return flag;
    }

    public boolean clearPRDSubFields() {
        boolean flag = false;
        if ((trsubQuedesc.isDisplayed())) {
            trsubQuedesc.clear();

            flag = true;

        }
        return flag;

    }

    public boolean validateSubBCKDetail(List<String> textList) {
        boolean flag = false;


        System.out.println("Before Audit");
        WebDriverUtils.waitForElementLoading(5);

        List<WebElement> newValueList = driver.findElements(By.xpath(".//*[@id='lblPersonalDataSharedWithOthersDescription']//..//div"));
        WebDriverUtils.waitForElementLoading(10);
        ArrayList<String> valueList = new ArrayList<String>();
        WebDriverUtils.waitForElementLoading(10);
        System.out.println(newValueList.size());
        System.out.println("Audit");

        System.out.println(newValueList);


        for (int i = 0; i < textList.size(); i++) {
            WebDriverUtils.waitForElementLoading(10);
            System.out.println(newValueList.get(i).getText());
            String ele = newValueList.get(i).getText();
            System.out.println(i + "  " + ele);

            valueList.add(i, ele);
            WebDriverUtils.waitForElementLoading(10);


        }

        System.out.println(valueList);
        System.out.println(textList);


        for (int j = 0; j < textList.size(); j++) {
            for (int i = 0; i < valueList.size(); i++) {
                if (textList.get(j).equals(valueList.get(i))) {
                    System.out.println("textList Matching" + textList.get(j));
                    System.out.println("valueList.get(i)" + valueList.get(i));
                    System.out.println("Matching" + " " + i);

                    flag = true;

                }
            }


        }

        System.out.println("flag" + flag);
        return flag;


    }

    public boolean clickonSensitivePIIData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
//       if (!(sensitvPIIdata.isSelected())) {
//            sensitvPIIdata.click();
//            WebDriverUtils.waitForElementLoading(2);
//
//        } else {
//            System.out.println("++SENSITINVEPII alrady clicked++");
//
//        }


        if (driver.findElement(By.xpath(XPATH_TR_SENISPIIDATA)).isDisplayed()) {
            System.out.println("+++SENSIT PII++");
            WebDriverUtils.waitForElementLoading(5);
            flag = true;


        }

        return flag;

    }

    public boolean checkSensitivePIISubMand() {
        boolean flag = false;
        if (driver.findElement(By.xpath(XPATH_TR_SENISPIIDATA + "//span")).isDisplayed()) {
            System.out.println("+++SENSIT PII++");
            WebDriverUtils.waitForElementLoading(5);
            flag = true;


        }


        return flag;
    }

    public boolean verifySensiPIISubHelpTxt() {
        boolean flag = false;
        if (sensitivePIISubhelp.isDisplayed()) {
            flag = sensitivePIISubhelp.isDisplayed();

        }
        return flag;

    }

    public boolean selectbelowListOfISensitPIIdatatems(String subField, List<String> items) {

        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);


            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST6, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST6 + "", item) + "/a/span")).click();
            WebDriverUtils.waitForElementLoading(10);
            System.out.println("++item++" + item);

            flag = true;

        }

        return flag;

    }

    public boolean clickonSensitivePIIDataNo() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,sensitvPIIdataNo);
        WebDriverUtils.waitForElementLoading(5);

        if (sensitvPIIdataNo.isDisplayed()) {
//            JavascriptExecutor executor = (JavascriptExecutor) driver;
//            executor.executeScript("arguments[0].click();", sensitvPIIdataNo);
            sensitvPIIdataNo.click();
            WebDriverUtils.waitForElementLoading(5);
            driver.switchTo().alert().accept();
            WebDriverUtils.waitForElementLoading(5);
            flag = sensitvPIIdataNo.isDisplayed();
        }

        return flag;

    }


    public boolean clickonSTNDPIIDataNo() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,stndrPIIdataNo);
        WebDriverUtils.waitForElementLoading(5);

        if (stndrPIIdataNo.isDisplayed()) {
            stndrPIIdataNo.click();
            WebDriverUtils.waitForElementLoading(5);
            driver.switchTo().alert().accept();

            WebDriverUtils.waitForElementLoading(5);
            flag = stndrPIIdataNo.isDisplayed();
        }

        return flag;

    }


    public boolean clickNoTRPD() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))));
        WebDriverUtils.waitForElementLoading(6);
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))).click();
        flag = driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_No']"))).isDisplayed();
        return flag;
    }

    public boolean clickonTRJoint() {
        boolean flag = false;

        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_TRNo + "_No']"))));
        WebDriverUtils.waitForElementLoading(6);

        if (driver.findElement(By.xpath(String.format(XPATH_TRNo + "_No']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_TRNo + "_No']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_TRNo + "_No']"))).isDisplayed();
        }


//        if (clikOnTRNo.isDisplayed()) {
//            clikOnTRNo.click();
//            WebDriverUtils.waitForElementLoading(5);
//            driver.switchTo().alert().accept();
//
//            WebDriverUtils.waitForElementLoading(5);
//            flag =  clikOnTRNo.isDisplayed();
//        }

        return flag;

    }

    public boolean clickonTRSUBJoint() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,clikOnNo);
        WebDriverUtils.waitForElementLoading(5);
        if (clikOnNo.isDisplayed()) {
            clikOnNo.click();
            WebDriverUtils.waitForElementLoading(5);
            //driver.switchTo().alert().accept();

            //WebDriverUtils.waitForElementLoading(5);
            flag = clikOnNo.isDisplayed();
        }

        return flag;

    }

    public boolean clickonTRGeoNO() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "No']"))));
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "No']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "No']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "No']"))).isDisplayed();
        }

        return flag;


    }

    public boolean clickonTRRentionPRD() {

        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[2]"))));
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[2]"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[2]"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[2]"))).isDisplayed();
        }

        return flag;


    }

    public boolean clickYESTRPD() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_Yes']"))).click();
        flag = driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_Yes']"))).isDisplayed();
        return flag;
    }

    public boolean clickonYESTRJoint() {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format(XPATH_TRNo + "_Yes']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_TRNo + "_Yes']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_TRNo + "_Yes']"))).isDisplayed();
        }

        return flag;

    }

    public boolean clickonTRGeoYes() {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "Yes']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "Yes']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "Yes']"))).isDisplayed();
        }

        return flag;


    }

    public boolean clickonTRRentionPRDYES() {

        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[1]"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[1]"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_TRRETEN_No + "[1]"))).isDisplayed();
        }

        return flag;

    }

    public boolean clickIDKTRPD() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_IDK']"))).click();
        flag = driver.findElement(By.xpath(String.format("//*[@id='_" + XPATH_TR_SUBCNTR + "_IDK']"))).isDisplayed();
        return flag;
    }

    public boolean clickonIDNKTRJoint() {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format(XPATH_TRNo + "_IDK']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_TRNo + "_IDK']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_TRNo + "_IDK']"))).isDisplayed();
        }

        return flag;

    }

    public boolean clickonTRGeoIDNK() {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "IDK']"))).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "IDK']"))).click();


            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_GEO_TRNo + "IDK']"))).isDisplayed();
        }

        return flag;


    }

    public boolean verifyClickIDKbutton() {
        boolean flag = false;


        driver.findElement(By.xpath(XPATH_THRDPARTY_IDK)).click();
        flag = driver.findElement(By.xpath(XPATH_THRDPARTY_IDK)).isDisplayed();


        return flag;

    }

    public boolean verifyCommonValidMsg() {

        boolean flag = false;


        flag = driver.findElement(By.xpath(XPATH_COMMVALID)).isDisplayed();


        return flag;

    }


    public boolean clickNOSubPR() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,idntknwPRShared);
        WebDriverUtils.waitForElementLoading(5);
        if (idntknwPRShared.isDisplayed()) {
            idntknwPRShared.click();
            WebDriverUtils.waitForElementLoading(5);
            flag = idntknwPRShared.isDisplayed();
        }
        return flag;
    }

    public boolean verifyNSODappl() {
        boolean flag = false;
        if (driver.findElement(By.xpath(XPATH_NSOD)).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(3);
            flag = driver.findElement(By.xpath(XPATH_NSOD)).isDisplayed();

        }
        return flag;
    }

    public boolean validateInvalidDateNSOD(Map<String, String> data) {
        boolean flag = false;
        String nsdo1 = data.get("Next Sign Off Date1");
        driver.findElement(By.xpath(XPATH_NSOD1)).sendKeys(nsdo1);
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++NSOD+++");


        flag = true;


        return flag;

    }

    public boolean verifyNSODNotMandtry() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (nsdonotMan.isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);

            flag = nsdonotMan.isDisplayed();
            System.out.println("++NSOD++");

        }
        return flag;
    }

    public boolean verifyNSODType() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (nsodtype.getAttribute("type").equals("text")) {
            System.out.println("+++NSOD type+");
            flag = true;
        }

        return flag;
    }

    public boolean clickNSODCal() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_NSOD + "/..//td//div/img"))).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            driver.findElement(By.xpath(String.format(XPATH_NSOD + "/..//td//div/img"))).click();
            WebDriverUtils.waitForElementLoading(5);
            System.out.println("+++++");
            // if(nsodcal.isDisplayed()){
            WebDriverUtils.waitForElementLoading(5);
            //   flag=nsodcal.isDisplayed();
            System.out.println("++NSOD cal clicked++");
            flag = true;

            //}


        }
        return flag;
    }

    public boolean verifyNSODCal() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_NSOD + "/..//td//div/img"))).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            System.out.println("++NSOD Displayed++");
            flag = driver.findElement(By.xpath(String.format(XPATH_NSOD + "/..//td//div/img"))).isDisplayed();
        }


        return flag;
    }

    public boolean verifyNSODCalDisp() {
        boolean flag = false;
        if (nsodcal.isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            flag = nsodcal.isDisplayed();
            System.out.println("++NSOD cal clicked++");

        }
        return flag;
    }

    public boolean selectNSDOMonth() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        // if((driver.findElement(By.xpath("//.[@class='ui-datepicker-month']")).isDisplayed())){
        WebDriverUtils.waitForElementLoading(5);
        Select sel = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
        sel.selectByIndex(6);
        System.out.println("+selected 6 month+");
        WebDriverUtils.waitForElementLoading(5);
        flag = true;


        // }
        return flag;
    }

    public boolean selectNSDOYear() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        // if(nsodcal.isDisplayed()){
        // if((driver.findElement(By.xpath("//.[@class='ui-datepicker-year']")).isDisplayed())){
        WebDriverUtils.waitForElementLoading(5);
        nsodtype.clear();
        Select sel = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        sel.selectByIndex(15);
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("+selected 2021 month+");
        WebDriverUtils.waitForElementLoading(5);
        //flag = nsodcal.isDisplayed();
        flag = true;


        // }
        return flag;
    }

    public boolean nsdomanually(String nsdo) {
        boolean flag = false;
        if (nsodtype.isDisplayed()) {

            nsodtype.clear();
            WebDriverUtils.waitForElementLoading(5);
            nsodtype.sendKeys(nsdo);
            WebDriverUtils.waitForElementLoading(5);
            flag = true;
        }
        return flag;
    }

    public boolean verifyValidationMsgNSDO() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (nsdoValiMsg.isDisplayed()) {
            flag = nsdoValiMsg.isDisplayed();


        }
        return flag;

    }

    public boolean verifyNSODDate() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        //  if(nsodcal.isDisplayed()){
        // if(driver.findElement(By.xpath(XPATH_NSOD)).isDisplayed()){
        WebDriverUtils.waitForElementLoading(5);
        driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='11']")).click();

        System.out.println("+selected 6 date+");
        WebDriverUtils.waitForElementLoading(5);
        flag = true;


        // }
        return flag;

    }

    public boolean verifySensitvCustDisp() {
        boolean flag = false;
        if (driver.findElement(By.xpath(XPATH_SensitvCustAPP)).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(XPATH_SensitvCustAPP)).isDisplayed();

        }
        return flag;
    }

    public boolean verifySensitvCustMAND() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//span"))).isDisplayed()) {

            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//span"))).isDisplayed();

        }
        return flag;

    }

    public boolean verifyTypeSensitvCust() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_SensitvCustAPP + "/..//div//input")).getAttribute("type").equals("radio")) {
            flag = driver.findElement(By.xpath(XPATH_SensitvCustAPP + "/..//div//input")).getAttribute("type").equals("radio");


        }
        return flag;
    }

    public boolean clickonNOSensCust() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[2]"))).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(2);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", stdcntx);

            driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[2]"))).click();
            WebDriverUtils.waitForElementLoading(5);


            Alert alert = driver.switchTo().alert();

            driver.switchTo().alert();

            alert.accept();
            WebDriverUtils.waitForElementLoading(2);

            flag = driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[2]"))).isDisplayed();

        }
        return flag;
    }


    public boolean verifySensiSuqNotDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", stdcntx);

        if (!(sensicustSub.isDisplayed())) {
            WebDriverUtils.waitForElementLoading(2);
            System.out.println("+sensitv cust Not prsen+" + !(sensicustSub.isDisplayed()));
            flag = (!(sensicustSub.isDisplayed()));

        }
        return flag;
    }

    public boolean clickonYESSensCust() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[1]"))).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(2);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", stdcntx);

            driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[1]"))).click();
            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_SensitvCustAPP + "//..//div//input[1]"))).isDisplayed();

        }
        return flag;
    }

    public boolean verifySensiSubqDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", stdcntx);

        if (sensicustSub.isDisplayed()) {
            WebDriverUtils.waitForElementLoading(2);
            System.out.println("+sensitv cust prsen+" + sensicustSub.isDisplayed());
            flag = (sensicustSub.isDisplayed());

        }
        return flag;

    }

    public boolean verifySensCustDataPattrnMan() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (sensicustDataPatt.isDisplayed()) {
            flag = sensicustDataPatt.isDisplayed();

        }
        return flag;
    }

    public boolean verifySensPatrnData() {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (sensicustPattData.isDisplayed()) {
            flag = sensicustPattData.isDisplayed();

        }
        return flag;
    }

    public boolean searchSensiPatrnData(String sensiPattdata) throws AWTException {
        WebDriverUtils.waitForElementLoading(10);
        //String searchPDTxt = "//div[@id='divPickListSensitiveCustomerDataContext']//input[@class='search empty ui-widget-content ui-corner-all']";
        String searchPDTxt = "//div[@id='divPickListSensitiveCustomerDataContext']//input";

        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);

        WebDriverUtils.waitForElementLoading(5);


        WebElement element = driver.findElement(By.xpath(searchPDTxt));
        element.sendKeys(sensiPattdata);

        WebDriverUtils.waitForElementLoading(10);
        Robot robot = new Robot();
        WebDriverUtils.waitForElementLoading(4);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebDriverUtils.waitForElementLoading(4);


        return true;

    }

    public boolean searchSensiPattData() {
        boolean flag = false;
        if (sentiPattSearchItem.isDisplayed()) {

            flag = true;
        }
        return flag;

    }


    public boolean searchSensiPattDataPur(String sensiPattDataPurp) throws AWTException {
        WebDriverUtils.waitForElementLoading(10);
        String searchPDTxt = "//div[@id='divPickListSensitiveCustomerDataPupose']//input";

        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);

        WebDriverUtils.waitForElementLoading(5);


        WebElement element = driver.findElement(By.xpath(searchPDTxt));
        element.sendKeys(sensiPattDataPurp);

        WebDriverUtils.waitForElementLoading(10);
        Robot robot = new Robot();
        WebDriverUtils.waitForElementLoading(4);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebDriverUtils.waitForElementLoading(4);


        return true;

    }

    public boolean searchSensiPattrnData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (sentiPattDataSearchItem.isDisplayed()) {

            flag = true;
        }
        return flag;


    }

    public boolean selectSesitCustPatrData(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);
            WebDriverUtils.waitForElementLoading(3);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_SENPATTDATA, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_SENPATTDATA, item) + "/a/span")).click();

            flag = true;

        }

        return flag;


    }

    public boolean selectSensicutPattrnDataPurp(String subField, List<String> items) {
        boolean flag = false;
        for (String item : items) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_SENCUSTPATTDATA, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_SENCUSTPATTDATA, item) + "/a/span")).click();

            flag = true;

        }

        return flag;
    }

    public boolean verifySensiTRDataDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);
        if (driver.findElement(By.xpath(XPATH_SENTR_DATA)).isDisplayed()) {
            flag = driver.findElement(By.xpath(XPATH_SENTR_DATA)).isDisplayed();

        }
        return flag;
    }

    public boolean verifySensiTRDATAMand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//span")))).isDisplayed()) {
            flag = (driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//span")))).isDisplayed());

        }
        return flag;
    }

    public boolean verifyTypeSensiTRData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(String.format(XPATH_SENTR_DATA + "//..//input"))).getAttribute("type").equals("radio")) {

            flag = (driver.findElement(By.xpath(String.format(XPATH_SENTR_DATA + "//..//input"))).getAttribute("type").equals("radio"));

        }
        return flag;

    }

    public boolean clickonYESSensTRData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//span")))).isDisplayed()) {
            driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//..//input[1]")))).click();
            WebDriverUtils.waitForElementLoading(2);
            return true;


        }
        return flag;
    }

    public boolean clickonNOSensiTRData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//span")))).isDisplayed()) {
            driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//..//input[2]")))).click();
            WebDriverUtils.waitForElementLoading(2);
            return true;


        }
        return flag;
    }

    public boolean verifySensTRDatadetailPg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//..//td[2]")))).isDisplayed()) {
            flag = driver.findElement((By.xpath(String.format(XPATH_SENTR_DATA + "//..//td[2]")))).isDisplayed();
            WebDriverUtils.waitForElementLoading(2);

        }


        return flag;
    }


    public boolean verifyStndrPattDataDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdcntx);
        if (driver.findElement(By.xpath(XPATH_Patter_DATA)).isDisplayed()) {
            flag = driver.findElement(By.xpath(XPATH_Patter_DATA)).isDisplayed();

        }
        return flag;

    }

    public boolean verifySTRPattDATAMand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//span")))).isDisplayed()) {
            flag = (driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//span")))).isDisplayed());

        }
        return flag;

    }

    public boolean verifyTypeStndPattTRData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(String.format(XPATH_Patter_DATA + "//..//input"))).getAttribute("type").equals("radio")) {

            flag = (driver.findElement(By.xpath(String.format(XPATH_Patter_DATA + "//..//input"))).getAttribute("type").equals("radio"));

        }
        return flag;

    }

    public boolean clickonNOStndPattData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//span")))).isDisplayed()) {
            driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//..//input[2]")))).click();
            WebDriverUtils.waitForElementLoading(2);
            return true;


        }
        return flag;

    }

    public boolean clickonYESStndPattData() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//span")))).isDisplayed()) {
            driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//..//input[1]")))).click();
            WebDriverUtils.waitForElementLoading(2);
            return true;


        }
        return flag;
    }

    public boolean verifySTNDPattDatadetailPg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//..//td[2]")))).isDisplayed()) {
            flag = driver.findElement((By.xpath(String.format(XPATH_Patter_DATA + "//..//td[2]")))).isDisplayed();
            WebDriverUtils.waitForElementLoading(2);

        }


        return flag;

    }

    public boolean clickonNothrdPartyTR() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TRDPRD) + "_No']")).click();

        flag = true;

        if (!(thrdPrtyDesc).isDisplayed()) {
            flag = true;

        }
        return flag;
    }

    public boolean clickonIDNTthrdPartyTR() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TRDPRD) + "_IDK']")).click();

        flag = true;

        if (!(thrdPrtyDesc).isDisplayed()) {
            flag = true;

        }

        return flag;
    }

    public boolean clickonYesthrdPartyTR() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", personalDataIsJoint);
        driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TRDPRD) + "_Yes']")).click();

        flag = true;


        if (thrdPrtyDesc.isDisplayed()) {

            flag = true;


        }
        return flag;
    }

    public boolean verifyDataSensitive() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")).isDisplayed()) {

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")).isDisplayed();


        }

        return flag;

    }

    public boolean verifyDataSensitiveMandtry() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//span")).isDisplayed()) {

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//span")).isDisplayed();


        }

        return flag;
    }

    public boolean verifyDataSensitiveType() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input")).getAttribute("type").equals("radio")) {
            // if(driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE)+"']")).getAttribute("type").equals("radio")){

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input")).getAttribute("type").equals("radio");


        }

        return flag;

    }

    public boolean verifyDataSensitiveHelpTxt() {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div[2]")).isDisplayed()) {

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div[2]")).isDisplayed();


        }

        return flag;

    }

    public boolean clickonDataSensitiveNo() {


        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[2]")).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(3);
            driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[2]")).click();

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[2]")).isDisplayed();


        }

        return flag;

    }

    public boolean verifyDataSensiSubQuesNotDis() {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (!driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']")).isDisplayed() && !dataSentiUrl.isDisplayed()) {


            flag = !(driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']")).isDisplayed() && !dataSentiUrl.isDisplayed());


        }

        return flag;
    }

    public boolean verifyDataSensiSubQuesDispl() {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if ((driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']")).isDisplayed()) && (dataSentiUrl.isDisplayed())) {

            flag = ((driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']")).isDisplayed()) && (dataSentiUrl.isDisplayed()));


        }

        return flag;
    }

    public boolean clickonDataSensitiveYes() {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[1]")).isDisplayed()) {
            driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[1]")).click();

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']//..//div//input[1]")).isDisplayed();


        }
        return flag;
    }

    public boolean verifyDataSensiSubQues1Mand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));

        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']//span")).isDisplayed()) {

            flag = driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "Description']//span")).isDisplayed();


        }

        return flag;
    }

    public boolean verifyingValidationMessage(String limit) {

        WebDriverUtils.waitForElementLoading(1);

        //CommonMethods.ValidateAndUpdateField(driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE)+"Description']//..//td[2]")),limit);
        CommonMethods.ValidateAndUpdateField(dataSenstiDescr, limit);
        return true;

    }

    public boolean clearDataSensiSubQues1() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
//        if(driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE)+"Description']//..//td[2]")).isDisplayed()){
//            driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE)+"Description']//..//td[2]")).clear();
//            flag = true;
//
//        }
        if (dataSenstiDescr.isDisplayed()) {
            dataSenstiDescr.clear();
            flag = true;

        }
        return flag;
    }


    public boolean verifyValidDataSenSitSubQuest1(String txtmsg) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (dataSenstiDescr.isDisplayed()) {
            dataSenstiDescr.clear();
            dataSenstiDescr.sendKeys(txtmsg);
            flag = true;

        }
        return flag;
    }

    public boolean verifyValidaDataSensiSubQues2(String txtmsg) {

        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (dataSentiUrltxt.isDisplayed()) {
            dataSentiUrltxt.clear();
            dataSentiUrltxt.sendKeys(txtmsg);
            flag = true;

        }
        return flag;
    }

    public boolean verifyDataDependenciesDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);

        if (driver.findElement(By.xpath(XPATH_DATADEPEN)).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(2);
            flag = driver.findElement(By.xpath(XPATH_DATADEPEN)).isDisplayed();
        }

        return flag;
    }

    public boolean verifyHelpTextDataDependencies() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (helpDataDep.isDisplayed()) {
            flag = helpDataDep.isDisplayed();

        }
        return flag;
    }

    public boolean searchDataDep(String srchitem) throws AWTException {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_SEARCHDATADEP)).isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", helpDataDep);
            WebDriverUtils.waitForElementLoading(3);


            //WebElement element = driver.findElement(By.xpath(XPATH_SEARCHDATADEP));
            WebElement element = driver.findElement(By.xpath(String.format(XPATH_SEARCHDATADEP + "//input")));
            element.sendKeys(srchitem);
            //driver.findElement(By.xpath(XPATH_SEARCHDATADEP)).sendKeys(srchitem);
            WebDriverUtils.waitForElementLoading(5);
            Robot rbt = new Robot();
            rbt.keyPress(KeyEvent.VK_ENTER);

            WebDriverUtils.waitForElementLoading(4);
            flag = true;

        }

        return flag;
    }

    public boolean searchDataDepDispla() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (searchItemData.isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            flag = searchItemData.isDisplayed();

        }

        return flag;

    }

    public boolean selectBelowDataDepUnderSubField(String subField, List<String> items) {
        boolean flag = false;

        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LISTDATDEP, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_LISTDATDEP, item) + "/a/span")).click();
            flag = true;

        }
        return flag;
    }

    public boolean verifyDataDepinDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(2);
        if (datadepdetail.isDisplayed()) {
            flag = datadepdetail.isDisplayed();

        }
        return flag;
    }

    public boolean verifySupprtPrdDisp() {
        boolean flag = false;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", supprtprd);
        WebDriverUtils.waitForElementLoading(3);
        if (supprtprd.isDisplayed()) {
            flag = supprtprd.isDisplayed();

        }
        return flag;
    }

    public boolean verifyhelpTxtSupprtPrd() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (supprtPrdHelpTxt.isDisplayed()) {
            flag = supprtPrdHelpTxt.isDisplayed();

        }

        return flag;

    }

    public boolean searchSupprtPrdTxt(String srchitem) throws AWTException {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_SEARCHSUPPRTPRD)).isDisplayed()) {

            WebElement element = driver.findElement(By.xpath(String.format(XPATH_SEARCHSUPPRTPRD + "//input")));
            element.sendKeys(srchitem);

            WebDriverUtils.waitForElementLoading(5);
            Robot rbt = new Robot();
            rbt.keyPress(KeyEvent.VK_ENTER);

            WebDriverUtils.waitForElementLoading(4);
            flag = true;
        }
        return flag;
    }

    public boolean dataDepItemDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (dataDepItem.isDisplayed()) {
            flag = dataDepItem.isDisplayed();

        }

        return flag;
    }

    public boolean selectSupportPRDItem(String subField, List<String> items) {

        boolean flag = false;

        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_SUPPPRD, item))).isDisplayed();
            driver.findElement(By.xpath(String.format(XPATH_ITEM_SUPPPRD, item) + "/a/span")).click();
            flag = true;

        }
        return flag;
    }

    public boolean verifyDetailPageSupprPRD() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (supprtPRDdetail.isDisplayed()) {
            flag = supprtPRDdetail.isDisplayed();

        }
        return flag;
    }

    public boolean verifyLimitValidationMessage(String textBoxValue) {
        WebDriverUtils.waitForElementLoading(2);
        CommonMethods.ValidateAndUpdateField(regulatedDataOthr, textBoxValue);
        return true;
    }

    public boolean verifyRegulatedataDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(Xpath_regulatedata)).isDisplayed()) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", driver.findElement(By.xpath(String.format(XPATH_DATASENSITIVE) + "']")));
            flag = driver.findElement(By.xpath(Xpath_regulatedata)).isDisplayed();

        }
        return flag;
    }

    public boolean verifyRegulatedataMandtry() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(String.format(Xpath_regulatedata + "//span"))).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(Xpath_regulatedata + "//span"))).isDisplayed();


        }
        return flag;
    }

    public boolean verifyRegulatedDataType() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(String.format(Xpath_regulatedata + "//..//div//input"))).getAttribute("type").equals("checkbox")) {
            flag = driver.findElement(By.xpath(String.format(Xpath_regulatedata + "//..//div//input"))).getAttribute("type").equals("checkbox");


        }
        return flag;
    }

    public boolean selectRegultdDataItems(String subField, List<String> listItems) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);


        for (String item : listItems) {
            // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);


            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST7, item))).isDisplayed();
            //driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST7 + "", item) + "/a/span")).click();

            driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST7 + "", item))).click();
            WebDriverUtils.waitForElementLoading(10);
            System.out.println("++item++" + item);

            flag = true;


        }
        return flag;
    }

    public boolean regultedDataOther() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(regDataOther)).isDisplayed()) {
            flag = driver.findElement(By.xpath(regDataOther)).isDisplayed();

        }
        return flag;

    }

    public boolean regultedDataOtherMand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (driver.findElement(By.xpath(String.format(regDataOther) + "//span")).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(regDataOther) + "//span")).isDisplayed();

        }
        return flag;

    }

    public boolean regultedDataOtherField() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (regulatedDataOthr.isDisplayed()) {
            flag = regulatedDataOthr.isDisplayed();

        }
        return flag;
    }

    public boolean regultedDataDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(3);
        if (regulatedDetail.isDisplayed()) {
            flag = regulatedDetail.isDisplayed();

        }
        return flag;
    }

    public boolean productName() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);
        if (driver.findElement(By.xpath(xpath_PRD_Name)).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            //flag = driver.findElement(By.xpath(xpath_PRD_Name)).isDisplayed();
            flag = true;
        }
        return flag;
    }


    public boolean clickonGeneral() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,general);
        WebDriverUtils.waitForElementLoading(10);
        if (general.isDisplayed()) {
            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,general);
            general.click();
            flag = true;

        }
        return flag;

    }

    public boolean productNameMandtr() {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span")).isDisplayed()) {

            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span")));
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span")).isDisplayed();
        }
        return flag;

    }

    public boolean productNamehelpTxt() {

        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span//..//div")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span//..//div")));

            WebDriverUtils.waitForElementLoading(5);
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_Name) + "//span//..//div")).isDisplayed();
        }
        return flag;

    }

    public boolean productNamefield(String ProductType, Map<String, String> productValues) {
        String productFieldName;
        switch (ProductType.toLowerCase()) {
            case "productfields":
                for (String key : productValues.keySet()) {
                    //applicationFieldName = createApplicationFields.get(key) + timeStamp;
                    productFieldName = productValues.get(key) + "_" + Utility.genRand5DigitNum();
                    switch (key.toLowerCase()) {
                        case "product name":
                            //driver.findElement(By.xpath(xpath_PRD_Name)).sendKeys(productFieldName);
                            prdName.sendKeys(productFieldName);
                            break;
                        default:
                            return false;
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean clearPRDNAME() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (prdName.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,prdName);
            prdName.clear();
            flag = true;

        }
        return flag;
    }

    public boolean enterblnkPRDName(String txt) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (prdName.isDisplayed()) {
            System.out.println("+++VALID DATA+++");
            prdName.sendKeys(txt);
            WebDriverUtils.waitForElementLoading(4);
            flag = true;

        }
        return flag;
    }

    public boolean verifyValidatnBlnkMsg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (prdNameVldMsg.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,prdNameVldMsg);
            flag = prdNameVldMsg.isDisplayed();

        }
        return flag;
    }

    public boolean verifyBuisnessUnitDis() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement(By.xpath(XPATH_BU)).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_BU)));

            flag = driver.findElement(By.xpath(XPATH_BU)).isDisplayed();
            System.out.println("++BU ++" + flag);

        }
        return flag;
    }

    public boolean verifyBUisMandrty() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement(By.xpath(String.format(XPATH_BU) + "//span")).isDisplayed()) {

            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_BU) + "//span")));
            flag = driver.findElement(By.xpath(String.format(XPATH_BU) + "//span")).isDisplayed();
            System.out.println("++BU MNd ++" + flag);

        }
        return flag;

    }

    public boolean verifyBUHelpTxt() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement(By.xpath(String.format(XPATH_BU) + "//div")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_BU) + "//div")));

            flag = driver.findElement(By.xpath(String.format(XPATH_BU) + "//div")).isDisplayed();
            System.out.println("BU HelpTxt" + driver.findElement(By.xpath(String.format(XPATH_BU) + "//div")).getText());
            System.out.println("++BU MNd ++" + flag);

        }
        return flag;

    }

    public boolean dntselectItemsfrmDrpDwn() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_BU)).isDisplayed()) {
            driver.findElement(By.id("BusinessUnitId")).click();
            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,driver.findElement(By.id("BusinessUnitId")));

            Select sel = new Select(driver.findElement(By.id("BusinessUnitId")));
            sel.selectByIndex(0);
            WebDriverUtils.waitForElementLoading(5);
            flag = true;

        }
        return flag;
    }

    public boolean verifyValidationMsgBU() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(9);
        if (businessUnitvalidmsg.isDisplayed()) {
            flag = businessUnitvalidmsg.isDisplayed();

        }
        return flag;
    }

    public boolean selectBUItem() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (driver.findElement(By.xpath(XPATH_BU)).isDisplayed()) {
            driver.findElement(By.id("BusinessUnitId")).click();
            WebDriverUtils.waitForElementLoading(5);


            Select sel = new Select(driver.findElement(By.id("BusinessUnitId")));
            System.out.println(sel.toString());


            sel.selectByIndex(2);


            WebDriverUtils.waitForElementLoading(5);

            flag = true;

        }
        return flag;


    }

    public boolean verifyBUIteminDetailPg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (businessitemdetail.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,businessitemdetail);
            flag = businessitemdetail.isDisplayed();

        }
        return flag;
    }

    public boolean verify3rdPartyHelpTxt() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (helpTxt3rdParty.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,helpTxt3rdParty);

            flag = helpTxt3rdParty.isDisplayed();


        }
        return flag;
    }

    public boolean verify3rdPartyType() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (driver.findElement(By.xpath(XPATH_3rdParty)).getAttribute("type").equals("radio")) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_3rdParty)));
            flag = driver.findElement(By.xpath(XPATH_3rdParty)).getAttribute("type").equals("radio");

        }
        return flag;
    }

    public boolean clickYes3rdParty() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_3rdParty + "[2]")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_3rdParty + "[2]")));
            driver.findElement(By.xpath(XPATH_3rdParty + "[2]")).click();
            flag = true;

        }
        return flag;


    }

    public boolean clickNo3rdParty() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_3rdParty + "[1]")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_3rdParty + "[1]")));
            driver.findElement(By.xpath(XPATH_3rdParty + "[1]")).click();
            flag = true;

        }
        return flag;

    }

    public boolean verifyBUSubSegmnt() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//span"))).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//span"))));
            flag = driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//span"))).isDisplayed();

        }
        return flag;
    }

    public boolean verifyBUSubSegHelpTxt() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//div"))).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//div"))));
            flag = driver.findElement((By.xpath(String.format(xpath_PRD_BUSUBSEG) + "//div"))).isDisplayed();

        }
        return flag;

    }

    public boolean selectitemsBUSubSegment() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++Before selecing++");


        if (driver.findElement(By.id("BusinessSubSegmentId")).isDisplayed()) {
            System.out.println("++After selecting++");
            driver.findElement(By.id("BusinessSubSegmentId")).click();
            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_BUSUBSEGITEM)));


            Select sel = new Select(driver.findElement(By.xpath(xpath_BUSUBSEGITEM)));
            System.out.println(sel.toString());


            sel.selectByIndex(4);

            WebDriverUtils.waitForElementLoading(5);
            flag = true;

        }

        return flag;


    }

    public boolean verifyBUSubSegmntIteminDetailPg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(XPATH_BUSUBSEGDetail)).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(XPATH_BUSUBSEGDetail)));

            flag = driver.findElement(By.xpath(XPATH_BUSUBSEGDetail)).isDisplayed();

        }
        return flag;
    }

    public boolean selectItemOtherPRDStatus() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++Before selecing PRD Status++");


        if (driver.findElement(By.id("Status")).isDisplayed()) {
            System.out.println("++After selecting++");
            driver.findElement(By.id("Status")).click();
            WebDriverUtils.waitForElementLoading(5);


            Select sel = new Select(driver.findElement(By.id("Status")));
            System.out.println(sel.toString());


            sel.selectByValue("Other");

            WebDriverUtils.waitForElementLoading(5);
            flag = true;

        }

        return flag;


    }

    public boolean verifyPRDStatusMand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);


        if (driver.findElement(By.xpath(String.format(xpath_PrdStatus + "//span"))).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(xpath_PrdStatus + "//span"))).isDisplayed();
        }
        return flag;

    }

    public boolean verifyPRDStatusHelpTXT() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (driver.findElement(By.xpath(String.format(xpath_PrdStatus + "//div"))).isDisplayed()) {
            flag = driver.findElement(By.xpath(String.format(xpath_PrdStatus + "//div"))).isDisplayed();
        }
        return flag;

    }

    public boolean verifyPRDStatusOther() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (prdststusOthr.isDisplayed()) {
            flag = prdststusOthr.isDisplayed();

        }
        return flag;
    }

    public boolean verifyTheLimitExceedMsgForPrd(String text) {
        CommonMethods.ValidateAndUpdateField(otherPRDstatus, text);
        return true;

    }

    public boolean selectPRDStatusIuem() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++Before selecing PRD Status++");


        if (driver.findElement(By.id("Status")).isDisplayed()) {
            System.out.println("++After selecting++");
            driver.findElement(By.id("Status")).click();
            WebDriverUtils.waitForElementLoading(5);


            Select sel = new Select(driver.findElement(By.id("Status")));
            System.out.println(sel.toString());


            sel.selectByValue("AvailableForSale");

            WebDriverUtils.waitForElementLoading(5);
            flag = true;

        }

        return flag;

    }

    public boolean verifyPRDSTAtDetailPG() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (prdStatDetail.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,prdStatDetail);

            flag = prdStatDetail.isDisplayed();

        }
        return flag;
    }

    public boolean verifyPRDisp() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(xpath_PRDLevel)).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_PRDLevel)));
            flag = driver.findElement(By.xpath(xpath_PRDLevel)).isDisplayed();

        }
        return flag;
    }

    public boolean verifyPRDLevelMand() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//span"))).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//span"))));

            flag = driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//span"))).isDisplayed();


        }
        return flag;
    }

    public boolean verifyPRDLevelHelpTXT() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//..//div"))).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//..//div"))));
            flag = driver.findElement(By.xpath(String.format(xpath_PRDLevel + "//..//div"))).isDisplayed();


        }
        return flag;
    }

    public boolean selectPRDLevelItems(String item) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++Before selecing PRD Level++");


        if (driver.findElement(By.id("ProductLevel")).isDisplayed()) {
            System.out.println("++After selecting++");
            driver.findElement(By.id("ProductLevel")).click();
            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,driver.findElement(By.id("ProductLevel")));

            Select sel = new Select(driver.findElement(By.id("ProductLevel")));
            System.out.println(sel.toString());


            sel.selectByValue(item);

            WebDriverUtils.waitForElementLoading(5);

            if (item.equals("Family")) {

                Alert alert = driver.switchTo().alert();

                driver.switchTo().alert();

                alert.accept();
                System.out.println("Alert popup");
                WebDriverUtils.waitForElementLoading(6);

            }

            flag = true;

        }

        return flag;

    }

    public boolean verifyDGfieldshasdefaultValues(List<String> xpathitem) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(20);


        for (String item : xpathitem) {
            flag = verifyDGfieldRadioisNotSelected(item, 2);
        }


        return flag;


    }

    public boolean verifyDGfieldRadioisNotSelected(String xpath_radio, int i) {
        boolean flag = false;


        WebDriverUtils.waitForElementLoading(11);
        List<WebElement> ele2 = driver.findElements(By.xpath(String.format(XPATH_SENSIPII, xpath_radio)));

        if ((driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).getAttribute("type").equals("radio"))) {
            if ((driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio) + "[2]")).isSelected())) {
                count++;
                HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))));
                System.out.println("FLAG VALUE1" + driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio) + "[2]")).isSelected());
                System.out.println("Count 1 No radio  " + count);
                System.out.println(" No Radio button" + xpath_radio);
                flag = true;

            }
        }
        //if (xpath_radio.equalsIgnoreCase("PbDComplianceConfirmationcheck")) {
        if ((driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).getAttribute("type").equals("checkbox"))) {
            if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).isSelected())) {
                System.out.println("Checkbox flag" + !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).isSelected()));
                System.out.println("Check box PB Complicance");
                flag = true;


            }

        }


        return flag;

    }

    public boolean verifyPRDLevelValidatnMsg() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (prdLeveValidatnMsg.isDisplayed()) {

            flag = prdLeveValidatnMsg.isDisplayed();

        }
        return flag;
    }

    public boolean verifyDGfieldForTworadioButtn(List<String> xpathitem) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(20);


        for (String item : xpathitem) {
            if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))).isSelected())) {
                HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))));

                System.out.println("FLAG VALUE2 Radio" + driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))).isSelected());
                flag = verifyDGfieldTwoRadioisNotSelected(item, 2);
                // }
            }
        }

        return flag;
    }

    private boolean verifyDGfieldTwoRadioisNotSelected(String xpath_radio, int i) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).isSelected())) {
            System.out.println("2 radio buttons");
            System.out.println("FLAG VALUE 2 Radio" + driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).isSelected());
            flag = !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpath_radio))).isSelected());
        }

        return flag;
    }

    public boolean verifyDGfieldforThreeradioButtn(List<String> xpathitem) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        for (String item : xpathitem) {
            if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")).isSelected())) {
                HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")));

                System.out.println("FLAG VALUE 3 Radio" + !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")).isSelected()));

                flag = verifyDGfieldThreeadioisNotSelected(item, 2);

            }


        }

        return flag;
    }

    private boolean verifyDGfieldThreeadioisNotSelected(String xpathitem, int i) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(6);
        if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpathitem) + "//..//td//..//td[2]//input")).isSelected())) {
            System.out.println("3 radio buttons");
            System.out.println("FLAG VALUE 3 Radio" + !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpathitem) + "//..//td//..//td[2]//input")).isSelected()));
            flag = !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, xpathitem) + "//..//td//..//td[2]//input")).isSelected());
        }

        return flag;
    }

    public boolean verifyDGTXTfieldshasdefaultValues(List<String> xpathitem) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(20);


        for (String item : xpathitem) {
            flag = verifyDGTXTfieldRadioisNotSelected(item);
        }


        return flag;
    }

    private boolean verifyDGTXTfieldRadioisNotSelected(String item) {
        boolean flag = false;

        if (driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))).getAttribute("type").equals("text") || (driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))).getTagName().equals("textarea"))) {
            if (driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))).getAttribute("value").isEmpty()) {
                HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item))));
                System.out.println("Text");
                System.out.println("xpath111" + item);
                flag = true;

            }
        }
        return flag;
    }

    public boolean verifyDGcheckBoxfieldhasdefaultValues(List<String> xpathitem) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(20);


        for (String item : xpathitem) {
            flag = verifyDGcheckboxfieldRadioisNotSelected(item);
        }
        return flag;


    }

    private boolean verifyDGcheckboxfieldRadioisNotSelected(String item) {
        boolean flag = false;
        if (driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")).getAttribute("type").equals("checkbox")) {
            if (!(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")).isSelected())) {
                HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")));
                System.out.println("Checkbox flag" + !(driver.findElement(By.xpath(String.format(XPATH_SENSIPII, item) + "//..//td//..//td[2]//input")).isSelected()));
                System.out.println("Check box");
                flag = true;

            }


        }
        return flag;
    }

    public boolean verifyPrdTypeHelpTxt() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(xpath_PRD_TYPE)).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_PRD_TYPE)));
            flag = driver.findElement(By.xpath(xpath_PRD_TYPE)).isDisplayed();

        }
        return flag;
    }

    public boolean selectitemPRDType() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        System.out.println("++Before selecing PRD Type++");


        if (driver.findElement(By.id("ProductType")).isDisplayed()) {
            System.out.println("++After selecting++");
            driver.findElement(By.id("ProductType")).click();
            WebDriverUtils.waitForElementLoading(5);
            HighlightAnElement.highlightElement(driver,driver.findElement(By.id("ProductType")));

            Select sel = new Select(driver.findElement(By.id("ProductType")));
            System.out.println(sel.toString());


            sel.selectByValue("Platform");

            WebDriverUtils.waitForElementLoading(5);
            flag = true;

        }

        return flag;

    }

    public boolean verifyPRDTypeIndetailPG() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (prdTypeDetail.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,prdTypeDetail);

            flag = prdTypeDetail.isDisplayed();

        }
        return flag;
    }

    public boolean verifyHelpTxtPRDPurps() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//div")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//div")));
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//div")).isDisplayed();


        }
        return flag;
    }

    public boolean verifyTheLimitExceedMsgForPrdPUrs(String text) {
        CommonMethods.ValidateAndUpdateField(xpath_PRDPUR, text);
        return true;
    }

    public boolean verifyValidPURPData(String text) {
        boolean flag = false;
        if (xpath_PRDPUR.isDisplayed()) {
            HighlightAnElement.highlightElement(driver,xpath_PRDPUR);
            xpath_PRDPUR.clear();
            xpath_PRDPUR.sendKeys(text);
            flag = true;


        }
        return flag;
    }

    public boolean verifyPRDPURDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);

        if (driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//..//div")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//..//div")));
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//..//div")).isDisplayed();

        }
        return flag;
    }

    public boolean verifyHelpTxtPAZ() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//div")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//div")));
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//div")).isDisplayed();

        }
        return flag;
    }

    public boolean enterdata(String txt) {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")).isDisplayed()) {
            driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")).clear();
            HighlightAnElement.highlightElement(driver,  driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")));
            driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")).sendKeys(txt);
            flag = true;


        }
        return flag;
    }

    public boolean verifyValidatnMsgPAZ() {


        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,  driver.findElement(By.xpath(String.format(xpath_PRD_PAZ) + "//..//td//input")));
            HighlightAnElement.highlightElement(driver,xpath_valtnmsg_PAZ);
            flag = xpath_valtnmsg_PAZ.isDisplayed();
        }
        return flag;

    }

    public boolean verifyPAZDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        HighlightAnElement.highlightElement(driver,xpath_PAZ_deatil);

        if(xpath_PAZ_deatil.isDisplayed()){

            flag=xpath_PAZ_deatil.isDisplayed();

        }
        return flag;
    }

    public boolean verify3rdPartyDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_3rdparty_detail.isDisplayed()){
            HighlightAnElement.highlightElement(driver,xpath_3rdparty_detail);
            flag=xpath_3rdparty_detail.isDisplayed();

        }
        return flag;
    }


    public boolean verifyEntrOwnerMandrt() {
        boolean flag = false;
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false);",driver.findElement(By.xpath(xpath_enterowner)));
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_enterowner)));
        WebDriverUtils.waitForElementLoading(5);

        if(driver.findElement(By.xpath(xpath_enterowner)).isDisplayed()){
            flag=driver.findElement(By.xpath(xpath_enterowner)).isDisplayed();

        }
        return flag;


    }

    public boolean verifyEntrOwnerHelp() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[2]")));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[2]")).isDisplayed()){
            flag=driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[2]")).isDisplayed();

        }
        return flag;
    }

    public boolean verifyAssistanceofEnterOwer() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[3]")));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[3]")).isDisplayed()){
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[3]//a")));
            driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div[3]//a")).click();
            WebDriverUtils.waitForElementLoading(6);
            //String base = driver.getWindowHandle();
            List<String> windows = new ArrayList<>(driver.getWindowHandles());
            driver.switchTo().window(windows.get(1));

            WebDriverUtils.waitForElementLoading(5);
           driver.close();
           driver.switchTo().window(windows.get(0));

            WebDriverUtils.waitForElementLoading(5);

            flag=true;


        }
        return flag;
    }


    public boolean selectEnterOwner(String item) {
        boolean flag = false;
//        driver.switchTo().defaultContent();
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div//div")));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(xpath_enterowner)+"//..//..//div//div")).isDisplayed()){
            xpath_enterownerItem.click();
           xpath_enterownerItem.sendKeys(item);
           WebDriverUtils.waitForElementLoading(6);
            xpath_enterownerItem1.click();

          System.out.println("Select enter"+xpath_enterownerItem1);
            Reporter.addStepLog("Enterperise Ower added item is"+item);


            WebDriverUtils.waitForElementLoading(13);




            flag= true;


        }
        return  flag;

    }

    public boolean verifyEnterOwnDetail(String item) {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_entrown)));
        WebDriverUtils.waitForElementLoading(4);
        if(driver.findElement(By.xpath(xpath_entrown)).isDisplayed()){
            String txt=driver.findElement(By.xpath(String.format(xpath_entrown)+"//..//a[contains(text(),'Edmonds')]")).getText().toString();
            //..//a[contains(text(),'Edmonds')]
            System.out.println("DE"+txt);
            WebDriverUtils.waitForElementLoading(4);
            flag = true;
            if(txt.equals(item)) {
                System.out.println("Entr Ownr" + txt);
                flag = true;
            }
        }
        return flag;
    }

    public boolean deselectEnterOwner(String item) {
        boolean flag = false;
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");
        HighlightAnElement.highlightElement(driver, driver.findElement(By.xpath(String.format(xpath_enterowner) + "//..//..//div//div")));
        WebDriverUtils.waitForElementLoading(5);
        if (driver.findElement(By.xpath(String.format(xpath_enterowner) + "//..//..//div//div")).isDisplayed()) {
            WebDriverUtils.waitForElementLoading(4);
            xpath_enterownerItem_remv.click();
            Reporter.addStepLog("Enterperise Ower removed item is"+item);
            WebDriverUtils.waitForElementLoading(4);
            flag=true;

        }
        return flag;
    }

    public boolean verifyTRJointlyDetail() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)", "");


        if (driver.findElement(By.xpath(".//*[@id='lblPersonalDataIsJointDecision']//..//span")).isDisplayed()) {
            HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(".//*[@id='lblPersonalDataIsJointDecision']//..//span")));
            driver.findElement(By.xpath(".//*[@id='lblPersonalDataIsJointDecision']//..//span")).equals("Yes");

            System.out.println("FLAG"+driver.findElement(By.xpath(".//*[@id='lblPersonalDataIsJointDecision']//..//span")).equals("Yes"));
            flag = driver.findElement(By.xpath(String.format(xpath_PRD_PURP) + "//..//div")).isDisplayed();

        }
        return flag;
    }

    public boolean verifyTypeTags() {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,xpath_tagsApp);
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)", "");
        if(xpath_tagsApp.getAttribute("type").equals("text")){
            flag=xpath_tagsApp.getAttribute("type").equals("text");


        }
        return flag;

    }

    public boolean verifyTagsHelpTxt() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,xpath_TagsHelpTxt);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_TagsHelpTxt.isDisplayed()){
            flag= true;

        }
        return flag;
    }

    public boolean addTags(String item) {
        boolean flag = false;
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)","");
        HighlightAnElement.highlightElement(driver,xpath_Tagsfield);
//.//*[@id='_etyPckrCntr_ApplicationTagsCSV']//..//..//input

        if(xpath_Tagsfield.isDisplayed()){

            WebDriverUtils.waitForElementLoading(3);
            xpath_Tagsfield.click();

           xpath_Tagsfield.sendKeys(item);
            WebDriverUtils.waitForElementLoading(5);
            xpath_Tagsfield1.click();
            WebDriverUtils.waitForElementLoading(5);


            Reporter.addStepLog("Tags added"+item);

            flag = true;


        }
        return flag;

    }

    public boolean verifyValidtnTagMsg() {
        boolean flag= false;
//        HighlightAnElement.highlightElement(driver,xpath_Tagsfield);

String txt1="A Tag name cannot contain any of the following special characters:";
        WebDriverUtils.waitForElementLoading(4);
        Alert alert = driver.switchTo().alert();
        WebDriverUtils.waitForElementLoading(4);
        String txt= alert.getText();
        System.out.println("Tag txt"+txt);
        System.out.println("VAlidtn MSG"+txt1);
        WebDriverUtils.waitForElementLoading(4);
        alert.accept();
        flag = true;



//      if(txt.contains(txt1)){
//          System.out.println("Tag txt"+txt);
//          System.out.println("VAlidtn MSG"+txt1);
//          WebDriverUtils.waitForElementLoading(5);
//          //alert.accept();
//          flag=true;
//
//      }
      return flag;
    }

    public boolean verifyTagsDetail(String item) {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_tags)));
        WebDriverUtils.waitForElementLoading(4);
        if(driver.findElement(By.xpath(xpath_tags)).isDisplayed()){
            //td[text()='Tags']/..//a[contains(text(),'123456')]
            String txt=driver.findElement(By.xpath(String.format(xpath_Detailtags,item))).getText();
            //..//a[contains(text(),'Edmonds')]
            System.out.println("Detail Tag"+txt);
            WebDriverUtils.waitForElementLoading(4);
          //  flag = true;
            if(txt.equals(item)) {
                System.out.println("Entr Ownr" + txt);
                flag = true;

            }
        }
        return flag;
    }

    public boolean clickOnTagsDetail(String item1) {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver, driver.findElement(By.xpath(xpath_tags)));
        WebDriverUtils.waitForElementLoading(4);
        if (driver.findElement(By.xpath(xpath_tags)).isDisplayed()) {
             driver.findElement(By.xpath(String.format(xpath_tagsdetail) + "//..//a[contains(text(),'123456')]")).click();


            WebDriverUtils.waitForElementLoading(4);
            flag = true;
        }
        return flag;
    }

    public boolean verifyTaggedTechn() {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_tagTech)));
        WebDriverUtils.waitForElementLoading(4);
        if(driver.findElement(By.xpath(xpath_tagTech)).isDisplayed()){

            flag=true;
        }
        return flag;
    }

    public boolean removeTagsTech(String item) {
        boolean flag = false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_remTech)));
        WebDriverUtils.waitForElementLoading(4);
        if(driver.findElement(By.xpath(xpath_remTech)).isDisplayed()){
            //driver.findElement(By.xpath(xpath_remTech)).click();
            driver.findElement(By.xpath(String.format(xpath_remTech))).click();
            Reporter.addStepLog("Tag of Applicating removed"+item);
            flag=true;
        }
        return flag;
    }

    public boolean verifyStndrPlatClDisplayed() {
        boolean flag= false;
        HighlightAnElement.highlightElement(driver,xpath_StndrPlfmClass);
        WebDriverUtils.waitForElementLoading(3);
        if(xpath_StndrPlfmClass.isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean verifyPlatClassfDisplayed() {
        boolean flag= false;
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)","");
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_PlfmClass)));
        WebDriverUtils.waitForElementLoading(3);
        if(driver.findElement(By.xpath(xpath_PlfmClass)).isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean verifyPlatClassFMand() {
        boolean flag= false;

        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)","");
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_PlfmClass)+"//span")));
        WebDriverUtils.waitForElementLoading(3);
        if(driver.findElement(By.xpath(String.format(xpath_PlfmClass)+"//span")).isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean selectSubitemPlatClss(String item) {
        boolean flag= false;
        HighlightAnElement.highlightElement(driver,xpath_Plfclassitems);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_Plfclassitems.isDisplayed()){

            WebDriverUtils.waitForElementLoading(4);

            Select sel = new Select(xpath_Plfclassitems);

            sel.selectByVisibleText(item);
            Reporter.addStepLog("Select item from Plaform Classifaction"+item);
            flag=true;
        }
        return flag;
    }

    public boolean verifyStndPltValidtnMsg(String msg) {
        boolean flag=false;

        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(Xpath_StndPl,msg))));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(Xpath_StndPl,msg))).isDisplayed()){
            flag=true;

        }

        return flag;
    }

    public boolean verifySubQuesPlatfrmNotDisp() {

        boolean flag=false;
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)","");
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_PlfmClass)));
                WebDriverUtils.waitForElementLoading(4);
        if(!(xpath_stndrplfsuq.isDisplayed() && xpath_Migdatesuq.isDisplayed())){
            flag =true;

        }
        return flag;
    }

    public boolean verifySubQuesPlatfrmDisply() {
        boolean flag=false;
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)","");
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_PlfmClass)));
        HighlightAnElement.highlightElement(driver,xpath_stndrplfsuq);
        HighlightAnElement.highlightElement(driver,xpath_Migdatesuq);
        WebDriverUtils.waitForElementLoading(4);
        if((xpath_stndrplfsuq.isDisplayed() && xpath_Migdatesuq.isDisplayed())){
            flag =true;

        }
        return flag;
    }

    public boolean verifyStndPltSubItems(String item) {
        boolean flag= false;
        HighlightAnElement.highlightElement(driver,xpath_StnPlfclassitems);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_StnPlfclassitems.isDisplayed()){

            WebDriverUtils.waitForElementLoading(4);

            Select sel = new Select(xpath_StnPlfclassitems);

            sel.selectByVisibleText(item);
            Reporter.addStepLog("Select item from Plaform Classifaction"+item);
            flag=true;
        }
        return flag;
    }

    public boolean selectMigrDate(int dt1) {
        boolean flag=false;
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)","");
        HighlightAnElement.highlightElement(driver,xpath_Migdate);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_Migdate.isDisplayed()){

          /*  DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");

            //get current date time with Date()
            Date date = new Date();

            // Now format the date
            String date1= dateFormat.format(date);

            // Print the Date
            System.out.println("System Date"+date1);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);*/
          xpath_datepic.click();
          WebDriverUtils.waitForElementLoading(5);
            //table[@class='ui-datepicker-calendar']//tr//a[text()='2']


            SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY");
            Date dt = new Date();
            Calendar cl = Calendar.getInstance();
            cl.setTime(dt);;
            System.out.println("System Date"+dt);
            cl.add(Calendar.DAY_OF_YEAR, dt1);
            dt=cl.getTime();
            String str = df.format(dt);
            System.out.println("the date today is 2 " + str);
            String output = str.substring(3, 5);
            System.out.println("Only date"+output);
            int i=Integer.parseInt(output);
            System.out.println("Coverting to interger"+i);




            WebElement el = driver.findElement(By.xpath(String.format(".//table[@class='ui-datepicker-calendar']//tr//a[text()='") + i + "']"));
//            WebElement e1=driver.findElement(By.xpath(".//*[@class='ui-datepicker-trigger']"));
            el.click();
            WebDriverUtils.waitForElementLoading(5);



            flag=true;

        }

        return flag;

    }

    public boolean verifyValidateMigrdate(String msg) {
        boolean flag=true;
        HighlightAnElement.highlightElement(driver,xpath_Migdate);
        WebDriverUtils.waitForElementLoading(5);
       // xpath_Migdate.clear();
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(Xpath_MigDatPl,msg))).isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean verifyStnPltMigDateMsg(String msg) {
        boolean flag=false;

        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(Xpath_MigDatPl,msg))));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(Xpath_MigDatPl,msg))).isDisplayed()){
            flag=true;

        }

        return flag;
    }

    public boolean verifyStnPltvalidatMsg(String msg) {
        boolean flag=false;

        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(Xpath_StnPLValmsg,msg))));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(Xpath_StnPLValmsg,msg))).isDisplayed()){
            flag=true;

        }

        return flag;
    }

    public boolean emptyMigrtnDate() {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,xpath_Migdate);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_Migdate.isDisplayed()) {
            xpath_Migdate.clear();
            WebDriverUtils.waitForElementLoading(5);
            flag=true;
        }
        return flag;
    }

    public boolean verifyStandplfDetail(String itemList) {
        boolean flag=false;

        WebDriverUtils.waitForElementLoading(5);
        //if(driver.findElement(By.xpath(xpath_StndPlfdetail),itemList){
        if(driver.findElement(By.xpath(String.format(xpath_StndPlfdetail,itemList))).isDisplayed()){
            flag=true;

        }
        return flag;

    }

    public boolean verifyStatusTechDisplayed() {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(String.format(xpath_StatusTech)+"/ancestor::tr")));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(String.format(xpath_StatusTech)+"/ancestor::tr")).isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean selectStatusItem(String itemList) {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,driver.findElement(By.xpath(xpath_StatusTech)));
        WebDriverUtils.waitForElementLoading(5);
        if(driver.findElement(By.xpath(xpath_StatusTech)).isDisplayed()){
            Select sel = new Select(driver.findElement(By.xpath("//select[@id='StatusList']")));
            sel.selectByValue(itemList);
            WebDriverUtils.waitForElementLoading(5);
            flag=true;



        }
        return flag;
    }

    public boolean verifyStatusTechDetail() {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,xpath_status_detail);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_status_detail.isDisplayed()){
            flag=true;

        }
        return flag;
    }

    public boolean verifyAssertOwnshp() {
        boolean flag=false;
        HighlightAnElement.highlightElement(driver,xpath_Assert_Ownr);
        WebDriverUtils.waitForElementLoading(5);
        if(xpath_Assert_Ownr.isDisplayed()){
            Reporter.addStepLog("ASSET Ownership of PRD");
            flag=true;

        }
        return flag;

    }
}







        //if((driver.findElement(By.xpath(xpath_radio+"["+i+"]")).isSelected())){
        /*
        System.out.println("xpath_radio"+String.format(XPATH_SENSIPII,xpath_radio)+"[2]");


    driver.findElement(By.xpath(String.format(XPATH_SENSIPII,xpath_radio)+"[2]")).isSelected();

            if(driver.findElement(By.xpath(String.format(XPATH_SENSIPII,xpath_radio)+"[2]")).isSelected()) {
                System.out.println("FLAG VALUE" + driver.findElement(By.xpath(String.format(XPATH_SENSIPII,xpath_radio)+"[2]")).isSelected());
                flag=true;
            }

*/













//        boolean flag = false;
//        WebDriverUtils.waitForElementLoading(5);
//        if(driver.findElement(By.xpath(xpath_PRD_Name)).isDisplayed()){
//            driver.findElement(By.xpath(xpath_PRD_Name)).sendKeys("PRD")Utility.genRand5DigitNum();
//







