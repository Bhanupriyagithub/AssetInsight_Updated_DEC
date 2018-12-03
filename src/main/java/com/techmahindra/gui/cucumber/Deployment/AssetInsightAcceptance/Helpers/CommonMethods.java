package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonMethods extends PageInstances {

    public static String ValidateAndUpdateField(WebElement element,String text1) {

        int i;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        HighlightAnElement.highlightElement(driver,element);

        i = text1.length();
        element.clear();
        //added
        String text2 = null;
        WebDriverUtils.waitForElementLoading(2);
        //if (i > 512 | i > 256) {

        while(i>0) {
            if (i > 512) {
                WebDriverUtils.waitForElementLoading(2);
                element.sendKeys(text1);
                WebDriverUtils.waitForElementLoading(2);
               // text1 = text1.substring(0, 512);

                element.clear();
                WebDriverUtils.waitForElementLoading(2);
                System.out.println("STRING++++" + text1);

                //element.sendKeys(text1);
                WebDriverUtils.waitForElementLoading(2);
              // driver.findElement(By.xpath("//html")).click();
                break;


            }
            if (i > 256) {
                WebDriverUtils.waitForElementLoading(2);
//                element.sendKeys(text1);
//                text1 = text1.substring(0, 255);
//
               element.clear();
                WebDriverUtils.waitForElementLoading(2);
                System.out.println("STRING222++++" + text1);
                element.sendKeys(text1);
                break;

            } else {
                element.clear();
                element.sendKeys(text1);
                System.out.println("STRING333++++" + text1);
                break;

            }
        }

        return text1;
    }


}
