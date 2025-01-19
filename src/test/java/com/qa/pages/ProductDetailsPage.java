package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage extends MenuPage{

    TestUtils utils = new TestUtils();

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement msgProductName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/start5IV")
    private WebElement btnRate5Stars;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/sortTV")
    private WebElement msgSuccessfulReview;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/closeBt")
    private WebElement btnOkSuccessfulReview;

    @AndroidFindBy(accessibility = "Closes review dialog")
    private WebElement btnCloseReviewDialog;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/priceTV")
    private WebElement msgProductPrice;

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement btnAddToCart;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/descTV")
    private WebElement msgProductDescription;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cartTV")
    private WebElement msgCartAmount;

    public String getProductName() {
        return getText(msgProductName, "Product name is: ");
    }

    public ProductDetailsPage pressRateBtn() {
        waitForClickable(btnRate5Stars);
        click(btnRate5Stars, "Pressing 5 stars rating button");
        return this;
    }

    public String getSuccessfulReviewText() {
        return getText(msgSuccessfulReview, "Successful review text is: ");
    }

    public ProductDetailsPage pressCloseReviewBtn(){
        click(btnCloseReviewDialog);
        return this;
    }

    public String getProductPrice() throws Exception {
        return getText(andScrollToElementUsingUiScrollable("resource-id", "com.saucelabs.mydemoapp.android:id/priceTV"), "Product price is: ");
    }

    public ProductDetailsPage pressAddToCardBtn() throws Exception {
        click(andScrollToElementUsingUiScrollable("text", "Add to cart"), "Clicking on Add to Cart button ");
        return this;
    }

    public String getProductDescription() {
        return getText(andScrollToElementUsingUiScrollable("resourceId", "com.saucelabs.mydemoapp.android:id/descTV"), "product description is: ");
    }

    public String getCartAmount() {
        return getText(msgCartAmount, "Cart amount is: ");
    }

    public void pressOkSuccessfulReview(){
        click(btnOkSuccessfulReview);
    }
}
