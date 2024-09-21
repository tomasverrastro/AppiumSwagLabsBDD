package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PaymentPage extends MenuPage {

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/enterPaymentMethodTV\"]")
    private WebElement msgPaymentMethod;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/nameET\"]")
    private WebElement txtFullName;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/cardNumberET\"]")
    private WebElement txtCardNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/expirationDateET\"]")
    private WebElement txtExpirationDate;

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id=\"com.saucelabs.mydemoapp.android:id/securityCodeET\"]")
    private WebElement txtSecurityCode;

    @AndroidFindBy(accessibility = "Saves payment info and launches screen to review checkout data")
    private WebElement btnReviewOrder;

    public String getPaymentMethodTxt() {
        return getText(msgPaymentMethod, "Payment method text is: ");
    }

    public PaymentPage enterFullName(String name) throws InterruptedException {
        clear(txtFullName);
        sendKeys(txtFullName, name, "Filling full name as: " + name);
        return this;
    }

    public PaymentPage enterCardNumber(String cardNum) throws InterruptedException {
        clear(txtCardNumber);
        sendKeys(txtCardNumber, cardNum, "Filling card number with: " + cardNum);
        return this;
    }

    public PaymentPage enterExpirationDate(String expDate) throws InterruptedException {
        clear(txtExpirationDate);
        sendKeys(txtExpirationDate, expDate, "Filling expiration date with: " + expDate);
        return this;
    }

    public PaymentPage enterSecurityCode(String code) throws InterruptedException {
        clear(txtSecurityCode);
        sendKeys(txtSecurityCode, code, "Filling security code with: " + code);
        return this;
    }

    public OrderReviewPage pressReviewOrderBtn() {
        click(btnReviewOrder, "press review order button");
        return new OrderReviewPage();
    }
}
