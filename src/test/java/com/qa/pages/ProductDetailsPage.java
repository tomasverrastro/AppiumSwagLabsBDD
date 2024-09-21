package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends MenuPage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement msgProductName;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id=\"com.saucelabs.mydemoapp.android:id/start5IV\"]")
    private WebElement btnRate5Stars;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/sortTV\"]")
    private WebElement msgSuccessfulReview;

    @AndroidFindBy(accessibility = "Closes review dialog")
    private WebElement btnCloseReviewDialog;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/priceTV\"]")
    private WebElement msgProductPrice;

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddToCart;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/descTV\"]")
    private WebElement msgProductDescription;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/cartTV\"]")
    private WebElement msgCartAmount;

    public String getProductName() {
        return getText(msgProductName, "Product name is: ");
    }

    public void pressRateBtn() {
        click(btnRate5Stars, "Pressing 5 stars rating button");
    }

    public String getSuccessfulReviewText() {
        return getText(msgSuccessfulReview, "Successful review text is: ");
    }

    public void pressCloseReviewBtn(){
        click(btnCloseReviewDialog);
    }

    public String getProductPrice() throws Exception {
        return getText(andScrollToElementUsingUiScrollable("resource-id", "com.saucelabs.mydemoapp.android:id/priceTV"), "Product price is: ");
    }

    public void pressAddToCardBtn() throws Exception {
        click(andScrollToElementUsingUiScrollable("text", "Add to cart"), "Clicking on Add to Cart button ");
    }

    public String getProductDescription() {
        return getText(msgProductDescription, "Product description is: ");
    }

    public String getCartAmount() {
        return getText(msgCartAmount, "Cart amount is: ");
    }
}
