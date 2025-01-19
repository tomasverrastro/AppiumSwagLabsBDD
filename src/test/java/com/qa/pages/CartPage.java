package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CartPage extends MenuPage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/noItemTitleTV")
    private WebElement msgPageTitle;


    @AndroidFindBy(accessibility = "Removes product from cart")
    private WebElement btnRemoveItem;

    @AndroidFindBy(accessibility = "Confirms products for checkout")
    private WebElement btnCheckout;


    public String getPageName() {
        return getText(msgPageTitle, "Page title is: ");
    }

    public void pressRemoveItem() throws Exception {
        Thread.sleep(500);
        click(andScrollToElementUsingUiScrollable("resourceId", "com.saucelabs.mydemoapp.android:id/removeBt"), "Clicking on Remove Item button");
    }

    public LoginPage pressCheckout(){
        click(btnCheckout);
        return new LoginPage();
    }
}
