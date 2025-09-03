package com.qa.stepdef;

import com.qa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PaymentStepDef {
    @And("User enters Full name as {string}")
    public void userEntersFullNameAs(String name) throws InterruptedException {
        new CheckoutPage().enterFullName(name);
    }

    @And("User enters Address Line as {string}")
    public void userEntersAddressLineAs(String address) throws InterruptedException {
        new CheckoutPage().enterAddress1(address);
    }

    @And("User enters City as {string}")
    public void userEntersCityAs(String city) throws InterruptedException {
        new CheckoutPage().enterCity(city);
    }

    @And("User enters Zip code as {string}")
    public void userEntersZipCodeAs(String code) throws InterruptedException {
        new CheckoutPage().enterZipCode(code);
    }

    @And("User enters Country as {string}")
    public void userEntersCountryAs(String country) throws InterruptedException {
        new CheckoutPage().enterCountry(country);
    }

    @And("User clicks on To Payment button")
    public void userClicksOnToPaymentButton() {
        new CheckoutPage().pressToPaymentBtn();
    }

    @And("User enters Card Full name as {string}")
    public void userEntersCardFullNameAs(String name) throws InterruptedException {
        new PaymentPage().enterFullName(name);
    }

    @And("User enters Card Number as {string}")
    public void userEntersCardNumberAs(String card) throws InterruptedException {
        new PaymentPage().enterCardNumber(card);
    }

    @And("User enters Expiration date as {string}")
    public void userEntersExpirationDateAs(String date) throws InterruptedException {
        new PaymentPage().enterExpirationDate(date);
    }

    @And("User enters Security code as {string}")
    public void userEntersSecurityCodeAs(String code) throws InterruptedException {
        new PaymentPage().enterSecurityCode(code);
    }

    @And("User clicks on Review Order button")
    public void userClicksOnReviewOrderButton() {
        new PaymentPage().pressReviewOrderBtn();
    }

    @And("User clicks on Place Order button")
    public void userClicksOnPlaceOrderButton() {
        new OrderReviewPage().pressPlaceOrderBtn();
    }

    @Then("User should view Checkout Complete Text as {string}")
    public void userShouldViewCheckoutCompleteTextAs(String expectedText) {
        System.out.println("Expected text is: " + expectedText);
        Assert.assertEquals(new CheckoutCompletePage().getCheckoutCompleteTxt(), expectedText);
    }

    @Then("User should view ZIP code error text as {string}")
    public void userShouldViewZIPCodeErrorTextAs(String error) {
        System.out.println("Expected text is: " + error);
        Assert.assertEquals(new CheckoutPage().getZipErrorTxt(), error);
    }

    @Then("User should view security code error text as {string}")
    public void userShouldViewSecurityCodeErrorTextAs(String error) {
        System.out.println("Expected text is: " + error);
        Assert.assertEquals(new PaymentPage().getSecurityCodeErrorTxt(), error);
    }
}
