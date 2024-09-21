package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends MenuPage{

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/completeTV\"]")
    private WebElement msgCheckoutComplete;


    @AndroidFindBy(accessibility = "Tap to open catalog")
    private WebElement btnContinueShopping;


    public String getCheckoutCompleteTxt() {
        return getText(msgCheckoutComplete, "Checkout complete text is: ");
    }

    public ProductsPage pressToContinueShoppingBtn() {
        click(btnContinueShopping, "press continue shopping button");
        return new ProductsPage();
    }
}
