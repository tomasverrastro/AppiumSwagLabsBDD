package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy (accessibility = "com.saucelabs.mydemoapp.android:id/menuIV")
    private WebElement settingsBtn;

    public SettingsPage pressSettingsBtn(){
        click(settingsBtn, "Pressing Settings button");
        return new SettingsPage();
    }
}
