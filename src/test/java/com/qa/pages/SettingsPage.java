package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Catalog\")")
    private WebElement btnCatalog;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drawing\")")
    private WebElement btnDrawing;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Reset App State\")")
    private WebElement btnResetApp;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Log In\")")
    private WebElement btnLogIn;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    private WebElement btnConfirmReset;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/message\")")
    private WebElement msgSuccessfulReset;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"android:id/button1\")")
    private WebElement btnOKSuccessfulReset;

    public ProductsPage pressCatalogBtn(){
        click(btnCatalog, "Pressing Catalog Button");
        return new ProductsPage();
    }

    public DrawingPage pressDrawingBtn(){
        click(btnDrawing, "Pressing Drawing Button");
        return new DrawingPage();
    }

    public SettingsPage pressResetAppBtn(){
        click(btnResetApp, "Pressing Reset App Button");
        return this;
    }

    public LoginPage pressLoginBtn(){
        click(btnLogIn, "Pressing Login Button");
        return new LoginPage();
    }

    public void pressConfirmResetBtn(){
        click(btnConfirmReset);
    }

    public void pressOkSuccessfulResetBtn(){
        click(btnOKSuccessfulReset);
    }

    public String getSuccessfulResetTxt(){
        return msgSuccessfulReset.getText();
    }
}
