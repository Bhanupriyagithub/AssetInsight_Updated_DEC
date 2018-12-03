package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.TestUtils;

import com.cucumber.listener.ExtentCucumberFormatter;
import com.cucumber.listener.Reporter;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.managers.FileReaderManager;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import java.io.File;
@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber-report.json", "junit:target/cucumber-junit-report/cuc.xml"}
        , glue = {"com.techmahindra.gui.cucumber"}
        , plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
        , features = {"src/test/resources"}
        , monochrome = true
        , tags = {"@AC_ProductPage_Technology_StandrPltfrm_Clariftn_02"}

        //, tags ={" @AC_ProductPage_Technology_Status_02"}
        //, tags = {"@Feature_ProductsPage_902,@Feature_ProductsPage_904,@Feature_ProductsPage_905,@Feature_ProductsPage_908,@Feature_TechnologyPage_873,@Feature_TechnologyPage_878,@Feature_ProductsPage_899,@Feature_ProductsPage_910,@Feature_ProductsPage_906,@Feature_ProductsPage_909,@Feature_TechnologyPage_874,@Feature_TechnologyPage_883,@Feature_TechnologyPage_DataDependencyOn,@Feature_TechnologyPage_DataSensitiveHostContxt,@Feature_TechnologyPage_NSOD,@Feature_TechnologyPage_Regulated_Data,@Feature_TechnologyPage_SensitiveCust,@Feature_TechnologyPage_SensitiveTRData,@Feature_TechnologyPage_StndrCustPattData,@Feature_TechnologyPage_SupportsProducts,@Feature_Business_Sub_Segment,@Feature_BusinessUnit,@Feature_Prd3rdparty,@Feature_ProductName,@Feature_PAZ_ID,@Feature_Product_Purpose,@Feature_Product_Status,@Feature_Product_Type"}
        //, tags = {"@AC_TechnologyPage_874_03,@AC_ProductPage_909_02,@AC_ProductPage_910_03,@AC_ProductPage_906_03,@AC_TechnologyPage_874_03, @AC_TechnologyPage_885_03,@AC_ProductPage_899_03,@AC_ProductPage_902_03,@AC_TechnologyPage_NSOD_03,@AC_TechnologyPage_SensitiveCust_03,@AC_TechnologyPage_SensitiveTRData_03,@AC_TechnologyPage_StndrCustPattData_03"}
        //, tags = {"@Feature_ProductsPage_904,@AC_TechnologyPage_874_03,@AC_ProductPage_909_02,@AC_ProductPage_910_03,@AC_ProductPage_906_03,@AC_TechnologyPage_874_03, @AC_TechnologyPage_885_03,@AC_ProductPage_899_03,@AC_ProductPage_905_03,@AC_ProductPage_908_03,@AC_ProductPage_902_03,@AC_TechnologyPage_NSOD_03,@AC_TechnologyPage_SensitiveCust_03,@AC_TechnologyPage_SensitiveTRData_03,@AC_TechnologyPage_StndrCustPattData_03"}
)



public class AssetInsightRunner extends PageInstances {
    @BeforeClass
    public static void BeforeClass() throws Exception
    {
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter();

    }
    @AfterClass
    public static void CreateReport() throws Exception {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        WebDriverUtils.waitForElementLoading(5);
        driver.quit();
    }
}

