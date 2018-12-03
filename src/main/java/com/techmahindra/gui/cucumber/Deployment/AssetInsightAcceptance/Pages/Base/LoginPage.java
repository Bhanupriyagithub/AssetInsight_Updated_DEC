package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.HighlightAnElement;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SK00447696 on 2/22/18.
 */
public class LoginPage extends BasePage{

   @FindBy(xpath = ".//*[@id='USER']")
    private  WebElement textBoxUserName;

    @FindBy(xpath = ".//*[@id='PASSWORD']")
    private WebElement textBoxPassword;

    @FindBy(xpath = ".//*[@id='safeLoginbtn']")
    private WebElement buttonLogin;

    public LoginPage() throws Exception {
        super();
    }


    protected WebElement elementForLoading() throws Exception {
        return textBoxUserName;
    }

    public boolean isPageDisplayed() throws Exception {
        return true;
    }

    protected void pageName() throws Exception {

    }
    /**
     * This method enters default username and password and clicks button 'Log in'.
     *
     * @throws Exception
     * @params Nothing.
     */
    public void login(String username,String password) throws Exception {
        HighlightAnElement.highlightElement(driver,textBoxUserName);
        WebDriverUtils.waitForElementLoading(3);
        HighlightAnElement.highlightElement(driver,textBoxPassword);
        WebDriverUtils.waitForElementLoading(3);
        textBoxUserName.sendKeys(username);
        textBoxPassword.sendKeys(password);
        HighlightAnElement.highlightElement(driver,buttonLogin);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonLogin);
    }
}