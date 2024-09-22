package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/menuIV")
    private WebElement settingsBtn;

    @AndroidFindBy (id = "com.saucelabs.mydemoapp.android:id/cartRL")
    private WebElement cartBtn;

    public SettingsPage pressSettingsBtn(){
        click(settingsBtn, "Pressing Settings button");
        return new SettingsPage();
    }

    public CartPage pressCartBtn(){
        click(cartBtn, "Pressing Cart button");
        return new CartPage();
    }
}
