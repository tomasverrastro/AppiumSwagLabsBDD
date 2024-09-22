package com.qa.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends MenuPage{

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/checkoutTitleTV")
    private WebElement msgPageTitle;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/fullNameET")
    private WebElement txtFullName;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/address1ET")
    private WebElement txtAddress1;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/cityET")
    private WebElement txtCity;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/zipET")
    private WebElement txtZipCode;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/countryET")
    private WebElement txtCountry;

    @AndroidFindBy(accessibility = "Saves user info for checkout")
    private WebElement btnToPayment;

    public String getPageTitle() {
        return getText(msgPageTitle, "Page Title is: ");
    }

    public CheckoutPage enterFullName(String name) throws InterruptedException {
        clear(txtFullName);
        sendKeys(txtFullName, name, "Filling full name as: " + name);
        return this;
    }

    public CheckoutPage enterAddress1(String address) throws InterruptedException {
        clear(txtAddress1);
        sendKeys(txtAddress1, address, "Filling address 1 as: " + address);
        return this;
    }

    public CheckoutPage enterCity(String city) throws InterruptedException {
        clear(txtCity);
        sendKeys(txtCity, city, "Filling city as: " + city);
        return this;
    }

    public CheckoutPage enterZipCode(String zipCode) throws InterruptedException {
        clear(txtZipCode);
        sendKeys(txtZipCode, zipCode, "Filling zip code as: " + zipCode);
        return this;
    }

    public CheckoutPage enterCountry(String country) throws InterruptedException {
        clear(txtCountry);
        sendKeys(txtCountry, country, "Filling country as: " + country);
        return this;
    }

    public PaymentPage pressToPaymentBtn() {
        click(btnToPayment, "press to payment button");
        return new PaymentPage();
    }
}
