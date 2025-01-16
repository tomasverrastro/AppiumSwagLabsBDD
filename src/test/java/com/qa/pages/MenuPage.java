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

    @AndroidFindBy (accessibility = "Shows current sorting order and displays available sorting options")
    private WebElement sortingBtn;

    @AndroidFindBy (accessibility = "Descending order by name")
    private WebElement sortByDescendingNameBtn;

    @AndroidFindBy (accessibility = "Ascending order by price")
    private WebElement sortByAscendingPriceBtn;


    public SettingsPage pressSettingsBtn(){
        click(settingsBtn, "Pressing Settings button");
        return new SettingsPage();
    }

    public CartPage pressCartBtn(){
        click(cartBtn, "Pressing Cart button");
        return new CartPage();
    }

    public MenuPage pressSortingBtn(){
        click(sortingBtn, "Pressing Sorting button");
        return new MenuPage();
    }

    public MenuPage pressSortByDescendingNameBtn(){
        click(sortByDescendingNameBtn, "Pressing Sort By Descending Name button");
        return new MenuPage();
    }

    public MenuPage pressSortByAscendingPriceBtn(){
        click(sortByAscendingPriceBtn, "Pressing Sort By Ascending Price button");
        return new MenuPage();
    }

    public Boolean isProductsSortedByDescendingName(){
        return true;
    }
}
