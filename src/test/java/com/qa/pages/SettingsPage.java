package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SettingsPage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Catalog\"]")
    private WebElement btnCatalog;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Drawing\"]")
    private WebElement btnDrawing;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Reset App State\"]")
    private WebElement btnResetApp;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/itemTV\" and @text=\"Log In\"]")
    private WebElement btnLogIn;

    public ProductsPage pressCatalogBtn(){
        click(btnCatalog, "Pressing Catalog Button");
        return new ProductsPage();
    }

    public DrawingPage pressDrawingBtn(){
        click(btnDrawing, "Pressing Drawing Button");
        return new DrawingPage();
    }

    public void pressResetAppBtn(){
        click(btnResetApp, "Pressing Reset App Button");
    }

    public LoginPage pressLoginBtn(){
        click(btnLogIn, "Pressing Login Button");
        return new LoginPage();
    }
}
