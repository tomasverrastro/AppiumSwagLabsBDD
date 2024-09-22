package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class OrderReviewPage extends MenuPage{

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/enterShippingAddressTV")
    private WebElement msgOrderReview;

    @AndroidFindBy(accessibility = "Completes the process of checkout")
    private WebElement btnPlaceOrder;

    public String getOrderReviewTxt() {
        return getText(msgOrderReview, "Order Review text is: ");
    }

    public CheckoutCompletePage pressPlaceOrderBtn() {
        click(btnPlaceOrder, "press place order button");
        return new CheckoutCompletePage();
    }
}
