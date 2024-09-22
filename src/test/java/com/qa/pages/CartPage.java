package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CartPage extends MenuPage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement msgPageTitle;

    @AndroidFindBy(accessibility = "Removes product from cart")
    private WebElement btnRemoveItem;

    @AndroidFindBy(accessibility = "Confirms products for checkout")
    private WebElement btnCheckout;


    public String getPageName() {
        return getText(msgPageTitle, "Page title is: ");
    }

    public CartPage pressRemoveItem() throws Exception {
        click(andScrollToElementUsingUiScrollable("content-desc", "Removes product from cart"), "Clicking on Remove Item button");
        return this;
    }

    public LoginPage pressCheckout(){
        click(btnCheckout);
        return new LoginPage();
    }
}
