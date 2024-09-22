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
}
